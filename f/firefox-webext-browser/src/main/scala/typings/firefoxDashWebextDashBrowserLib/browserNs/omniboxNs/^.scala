package typings
package firefoxDashWebextDashBrowserLib.browserNs.omniboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.omnibox")
@js.native
object ^ extends js.Object {
  /** User has ended the keyword input session without accepting the input. */
  val onInputCancelled: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]] = js.native
  /**
    * User has changed what is typed into the omnibox.
    * @param suggest A callback passed to the onInputChanged event used for sending suggestions back to the browser.
    */
  val onInputChanged: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function2[
      /* text */ java.lang.String, 
      /* suggest */ js.Function1[
        /* suggestResults */ js.Array[firefoxDashWebextDashBrowserLib.browserNs.omniboxNs.SuggestResult], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.native
  /** User has accepted what is typed into the omnibox. */
  val onInputEntered: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function2[
      /* text */ java.lang.String, 
      /* disposition */ firefoxDashWebextDashBrowserLib.browserNs.omniboxNs.OnInputEnteredDisposition, 
      scala.Unit
    ]
  ] = js.native
  /* omnibox events */
  /**
    * User has started a keyword input session by typing the extension's keyword. This is guaranteed to be sent
    * exactly once per input session, and before any onInputChanged events.
    */
  val onInputStarted: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]] = js.native
  /* omnibox functions */
  /**
    * Sets the description and styling for the default suggestion. The default suggestion is the text that is
    * displayed in the first suggestion row underneath the URL bar.
    * @param suggestion A partial SuggestResult object, without the 'content' parameter.
    */
  def setDefaultSuggestion(suggestion: firefoxDashWebextDashBrowserLib.browserNs.omniboxNs.DefaultSuggestResult): scala.Unit = js.native
}

