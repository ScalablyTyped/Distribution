package typings.extjs.Ext.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewport extends IContainer {
  
  /** [Property] (Boolean) */
  var isViewport: js.UndefOr[Boolean] = js.native
  
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IViewport: js.UndefOr[js.Function0[Unit]] = js.native
}
object IViewport {
  
  @scala.inline
  def apply(): IViewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewport]
  }
  
  @scala.inline
  implicit class IViewportOps[Self <: IViewport] (val x: Self) extends AnyVal {
    
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
    def setIsViewport(value: Boolean): Self = this.set("isViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsViewport: Self = this.set("isViewport", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
  }
}
