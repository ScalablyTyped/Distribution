package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.error
import typings.devextreme.devextremeStrings.info
import typings.devextreme.devextremeStrings.success
import typings.devextreme.devextremeStrings.warning
import typings.devextreme.mod.DevExpress.positionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxToastOptions extends dxOverlayOptions[dxToast] {
  
  /**
    * [descr:dxToast.Options.animation]
    */
  @JSName("animation")
  var animation_dxToastOptions: js.UndefOr[dxToastAnimation] = js.native
  
  /**
    * [descr:dxToast.Options.closeOnClick]
    */
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxToast.Options.closeOnSwipe]
    */
  var closeOnSwipe: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxToast.Options.displayTime]
    */
  var displayTime: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxToast.Options.message]
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxToast.Options.position]
    */
  @JSName("position")
  var position_dxToastOptions: js.UndefOr[positionConfig | String] = js.native
  
  /**
    * [descr:dxToast.Options.type]
    */
  var `type`: js.UndefOr[custom | error | info | success | warning] = js.native
}
object dxToastOptions {
  
  @scala.inline
  def apply(): dxToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxToastOptions]
  }
  
  @scala.inline
  implicit class dxToastOptionsOps[Self <: dxToastOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: dxToastAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    
    @scala.inline
    def setCloseOnSwipe(value: Boolean): Self = this.set("closeOnSwipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnSwipe: Self = this.set("closeOnSwipe", js.undefined)
    
    @scala.inline
    def setDisplayTime(value: Double): Self = this.set("displayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayTime: Self = this.set("displayTime", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setPosition(value: positionConfig | String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setType(value: custom | error | info | success | warning): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
