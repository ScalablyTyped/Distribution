package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardSettings extends js.Object {
  
  /** To customize the card border color based on assigned task. Colors and corresponding values defined here will be mapped with colorField mapped data source column.
    * @Default {Object}
    */
  var colorMapping: js.UndefOr[js.Any] = js.native
  
  /** This specifies the Kanban card to drop into particular target element.
    */
  var externalDropTarget: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates to add the template for card .
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
}
object CardSettings {
  
  @scala.inline
  def apply(): CardSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardSettings]
  }
  
  @scala.inline
  implicit class CardSettingsOps[Self <: CardSettings] (val x: Self) extends AnyVal {
    
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
    def setColorMapping(value: js.Any): Self = this.set("colorMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorMapping: Self = this.set("colorMapping", js.undefined)
    
    @scala.inline
    def setExternalDropTarget(value: String): Self = this.set("externalDropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalDropTarget: Self = this.set("externalDropTarget", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
