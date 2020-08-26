package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.omnibox.DefaultSuggestResult
import typings.firefoxWebextBrowser.browser.omnibox.OnInputEnteredDisposition
import typings.firefoxWebextBrowser.browser.omnibox.SuggestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofomnibox extends js.Object {
  /** User has ended the keyword input session without accepting the input. */
  val onInputCancelled: WebExtEvent[js.Function0[Unit]] = js.native
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
  ] = js.native
  /** User has accepted what is typed into the omnibox. */
  val onInputEntered: WebExtEvent[
    js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
  ] = js.native
  /* omnibox events */
  /**
    * User has started a keyword input session by typing the extension's keyword. This is guaranteed to be sent
    * exactly once per input session, and before any onInputChanged events.
    */
  val onInputStarted: WebExtEvent[js.Function0[Unit]] = js.native
  /* omnibox functions */
  /**
    * Sets the description and styling for the default suggestion. The default suggestion is the text that is
    * displayed in the first suggestion row underneath the URL bar.
    * @param suggestion A partial SuggestResult object, without the 'content' parameter.
    */
  def setDefaultSuggestion(suggestion: DefaultSuggestResult): Unit = js.native
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
    val __obj = js.Dynamic.literal(onInputCancelled = onInputCancelled.asInstanceOf[js.Any], onInputChanged = onInputChanged.asInstanceOf[js.Any], onInputEntered = onInputEntered.asInstanceOf[js.Any], onInputStarted = onInputStarted.asInstanceOf[js.Any], setDefaultSuggestion = js.Any.fromFunction1(setDefaultSuggestion))
    __obj.asInstanceOf[Typeofomnibox]
  }
  @scala.inline
  implicit class TypeofomniboxOps[Self <: Typeofomnibox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnInputCancelled(value: WebExtEvent[js.Function0[Unit]]): Self = this.set("onInputCancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnInputChanged(
      value: WebExtEvent[
          js.Function2[
            /* text */ String, 
            /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], Unit], 
            Unit
          ]
        ]
    ): Self = this.set("onInputChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnInputEntered(
      value: WebExtEvent[
          js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
        ]
    ): Self = this.set("onInputEntered", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnInputStarted(value: WebExtEvent[js.Function0[Unit]]): Self = this.set("onInputStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDefaultSuggestion(value: DefaultSuggestResult => Unit): Self = this.set("setDefaultSuggestion", js.Any.fromFunction1(value))
  }
  
}

