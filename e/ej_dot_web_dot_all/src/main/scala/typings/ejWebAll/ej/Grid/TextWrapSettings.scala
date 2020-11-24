package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextWrapSettings extends js.Object {
  
  /** This specifies the grid to apply the auto wrap for grid content or header or both.
    * @Default {ej.Grid.WrapMode.Both}
    */
  var wrapMode: js.UndefOr[WrapMode | String] = js.native
}
object TextWrapSettings {
  
  @scala.inline
  def apply(): TextWrapSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextWrapSettings]
  }
  
  @scala.inline
  implicit class TextWrapSettingsOps[Self <: TextWrapSettings] (val x: Self) extends AnyVal {
    
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
    def setWrapMode(value: WrapMode | String): Self = this.set("wrapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapMode: Self = this.set("wrapMode", js.undefined)
  }
}
