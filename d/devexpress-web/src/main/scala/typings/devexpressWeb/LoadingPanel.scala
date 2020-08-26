package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the loading panel functionality.
  */
@js.native
trait LoadingPanel extends js.Object {
  /**
    * Allows you to provide a custom loading panel.
    */
  var customPanel: js.UndefOr[ICustomLoadingPanel] = js.native
  /**
    * Specifies whether the loading panel is enabled in the control.
    */
  var enabled: Boolean = js.native
  /**
    * Hides the loading panel.
    */
  def hide(): Unit = js.native
  /**
    * Shows the loading panel.
    */
  def show(): Unit = js.native
}

object LoadingPanel {
  @scala.inline
  def apply(enabled: Boolean, hide: () => Unit, show: () => Unit): LoadingPanel = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[LoadingPanel]
  }
  @scala.inline
  implicit class LoadingPanelOps[Self <: LoadingPanel] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setCustomPanel(value: ICustomLoadingPanel): Self = this.set("customPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPanel: Self = this.set("customPanel", js.undefined)
  }
  
}

