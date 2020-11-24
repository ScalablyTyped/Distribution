package typings.ejWebAll.ej.PivotTreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceMethodSettings extends js.Object {
  
  /** Allows the user to set the custom name for the service method responsible for drilling up/down operation in PivotTreeMap.
    * @Default {DrillTreeMap}
    */
  var drillDown: js.UndefOr[String] = js.native
  
  /** Allows the user to set the custom name for the service method responsible for initializing PivotTreeMap.
    * @Default {InitializeTreemap}
    */
  var initialize: js.UndefOr[String] = js.native
}
object ServiceMethodSettings {
  
  @scala.inline
  def apply(): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceMethodSettings]
  }
  
  @scala.inline
  implicit class ServiceMethodSettingsOps[Self <: ServiceMethodSettings] (val x: Self) extends AnyVal {
    
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
    def setDrillDown(value: String): Self = this.set("drillDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrillDown: Self = this.set("drillDown", js.undefined)
    
    @scala.inline
    def setInitialize(value: String): Self = this.set("initialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
  }
}
