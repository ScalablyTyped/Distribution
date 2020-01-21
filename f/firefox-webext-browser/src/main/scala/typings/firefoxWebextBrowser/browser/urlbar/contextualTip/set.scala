package typings.firefoxWebextBrowser.browser.urlbar.contextualTip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.urlbar.contextualTip.set")
@js.native
object set extends js.Object {
  /* urlbar.contextualTip functions */
  /**
    * Sets the contextual tip in the most recent browser winodw with the given icon, title, button title, and link
    * title. If the urlbar's view is not already open, then it will be opened so the contextual tip will be visible.
    * Note that when the urlbar's view is closed, the contextual tip is hidden and will not appear again.
    * `browser.urlbar.contextualTip.set` must be called each time a contextual tip should appear.
    * @param details Specifies the contextual tip's texts.
    */
  def apply(details: ContextualTip): Unit = js.native
}

