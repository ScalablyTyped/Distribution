package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines custom loading panel members.
  */
@js.native
trait ICustomLoadingPanel extends js.Object {
  
  /**
    * Hides the loading panel.
    */
  def hide(): Unit = js.native
  
  /**
    * Shows the loading panel.
    */
  def show(): Unit = js.native
  
  /**
    * Specifies whether the panel is visible.
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object ICustomLoadingPanel {
  
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): ICustomLoadingPanel = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ICustomLoadingPanel]
  }
  
  @scala.inline
  implicit class ICustomLoadingPanelOps[Self <: ICustomLoadingPanel] (val x: Self) extends AnyVal {
    
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
