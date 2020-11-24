package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelSettings extends js.Object {
  
  /** Options for customizing the higher level labels in range navigator.
    */
  var higherLevel: js.UndefOr[LabelSettingsHigherLevel] = js.native
  
  /** Options for customizing the labels in lower level.
    */
  var lowerLevel: js.UndefOr[LabelSettingsLowerLevel] = js.native
  
  /** Options for customizing the style of labels in range navigator.
    */
  var style: js.UndefOr[LabelSettingsStyle] = js.native
}
object LabelSettings {
  
  @scala.inline
  def apply(): LabelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettings]
  }
  
  @scala.inline
  implicit class LabelSettingsOps[Self <: LabelSettings] (val x: Self) extends AnyVal {
    
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
    def setHigherLevel(value: LabelSettingsHigherLevel): Self = this.set("higherLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherLevel: Self = this.set("higherLevel", js.undefined)
    
    @scala.inline
    def setLowerLevel(value: LabelSettingsLowerLevel): Self = this.set("lowerLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerLevel: Self = this.set("lowerLevel", js.undefined)
    
    @scala.inline
    def setStyle(value: LabelSettingsStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
