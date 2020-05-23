package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.urlbar.contextualTip.ContextualTip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcontextualTip extends js.Object {
  /* urlbar.contextualTip events */
  /**
    * Fired when the user clicks the contextual tip's button.
    * @param windowId The id of the window where the contextual tip's button was clicked.
    */
  val onButtonClicked: WebExtEvent[js.Function1[/* windowId */ Double, Unit]]
  /**
    * Fired when the user clicks the contextual tip's link.
    * @param windowId The id of the window where the contextual tip's link was clicked.
    */
  val onLinkClicked: WebExtEvent[js.Function1[/* windowId */ Double, Unit]]
  /** Hides the contextual tip (it will still be in the DOM). */
  def remove(): Unit
  /* urlbar.contextualTip functions */
  /**
    * Sets the contextual tip in the most recent browser winodw with the given icon, title, button title, and link
    * title. If the urlbar's view is not already open, then it will be opened so the contextual tip will be visible.
    * Note that when the urlbar's view is closed, the contextual tip is hidden and will not appear again.
    * `browser.urlbar.contextualTip.set` must be called each time a contextual tip should appear.
    * @param details Specifies the contextual tip's texts.
    */
  def set(details: ContextualTip): Unit
}

object TypeofcontextualTip {
  @scala.inline
  def apply(
    onButtonClicked: WebExtEvent[js.Function1[/* windowId */ Double, Unit]],
    onLinkClicked: WebExtEvent[js.Function1[/* windowId */ Double, Unit]],
    remove: () => Unit,
    set: ContextualTip => Unit
  ): TypeofcontextualTip = {
    val __obj = js.Dynamic.literal(onButtonClicked = onButtonClicked.asInstanceOf[js.Any], onLinkClicked = onLinkClicked.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[TypeofcontextualTip]
  }
}

