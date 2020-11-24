package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeSettings extends js.Object {
  
  /** Gets or sets a value that indicates whether to define the mode of resizing.
    * @Default {ej.Grid.ResizeMode.Normal}
    */
  var resizeMode: js.UndefOr[ResizeMode | String] = js.native
}
object ResizeSettings {
  
  @scala.inline
  def apply(): ResizeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeSettings]
  }
  
  @scala.inline
  implicit class ResizeSettingsOps[Self <: ResizeSettings] (val x: Self) extends AnyVal {
    
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
    def setResizeMode(value: ResizeMode | String): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMode: Self = this.set("resizeMode", js.undefined)
  }
}
