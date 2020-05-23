package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the loading panel functionality.
  */
trait LoadingPanel extends js.Object {
  /**
    * Allows you to provide a custom loading panel.
    */
  var customPanel: js.UndefOr[ICustomLoadingPanel] = js.undefined
  /**
    * Specifies whether the loading panel is enabled in the control.
    */
  var enabled: Boolean
  /**
    * Hides the loading panel.
    */
  def hide(): Unit
  /**
    * Shows the loading panel.
    */
  def show(): Unit
}

object LoadingPanel {
  @scala.inline
  def apply(enabled: Boolean, hide: () => Unit, show: () => Unit, customPanel: ICustomLoadingPanel = null): LoadingPanel = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    if (customPanel != null) __obj.updateDynamic("customPanel")(customPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingPanel]
  }
}

