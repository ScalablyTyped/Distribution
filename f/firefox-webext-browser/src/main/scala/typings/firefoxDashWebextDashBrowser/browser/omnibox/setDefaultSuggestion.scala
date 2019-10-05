package typings.firefoxDashWebextDashBrowser.browser.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.omnibox.setDefaultSuggestion")
@js.native
object setDefaultSuggestion extends js.Object {
  /* omnibox functions */
  /**
    * Sets the description and styling for the default suggestion. The default suggestion is the text that is
    * displayed in the first suggestion row underneath the URL bar.
    * @param suggestion A partial SuggestResult object, without the 'content' parameter.
    */
  def apply(suggestion: DefaultSuggestResult): Unit = js.native
}

