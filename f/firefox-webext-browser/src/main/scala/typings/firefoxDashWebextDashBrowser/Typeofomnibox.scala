package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.omnibox.DefaultSuggestResult
import typings.firefoxDashWebextDashBrowser.browser.omnibox.OnInputEnteredDisposition
import typings.firefoxDashWebextDashBrowser.browser.omnibox.SuggestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofomnibox extends js.Object {
  /** User has ended the keyword input session without accepting the input. */
  val onInputCancelled: WebExtEvent[js.Function0[Unit]]
  /**
    * User has changed what is typed into the omnibox.
    * @param suggest A callback passed to the onInputChanged event used for sending suggestions back to the browser.
    */
  val onInputChanged: WebExtEvent[
    js.Function2[
      /* text */ String, 
      /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], Unit], 
      Unit
    ]
  ]
  /** User has accepted what is typed into the omnibox. */
  val onInputEntered: WebExtEvent[
    js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
  ]
  /* omnibox events */
  /**
    * User has started a keyword input session by typing the extension's keyword. This is guaranteed to be sent
    * exactly once per input session, and before any onInputChanged events.
    */
  val onInputStarted: WebExtEvent[js.Function0[Unit]]
  /* omnibox functions */
  /**
    * Sets the description and styling for the default suggestion. The default suggestion is the text that is
    * displayed in the first suggestion row underneath the URL bar.
    * @param suggestion A partial SuggestResult object, without the 'content' parameter.
    */
  def setDefaultSuggestion(suggestion: DefaultSuggestResult): Unit
}

object Typeofomnibox {
  @scala.inline
  def apply(
    onInputCancelled: WebExtEvent[js.Function0[Unit]],
    onInputChanged: WebExtEvent[
      js.Function2[
        /* text */ String, 
        /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], Unit], 
        Unit
      ]
    ],
    onInputEntered: WebExtEvent[
      js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
    ],
    onInputStarted: WebExtEvent[js.Function0[Unit]],
    setDefaultSuggestion: DefaultSuggestResult => Unit
  ): Typeofomnibox = {
    val __obj = js.Dynamic.literal(onInputCancelled = onInputCancelled, onInputChanged = onInputChanged, onInputEntered = onInputEntered, onInputStarted = onInputStarted, setDefaultSuggestion = js.Any.fromFunction1(setDefaultSuggestion))
  
    __obj.asInstanceOf[Typeofomnibox]
  }
}

