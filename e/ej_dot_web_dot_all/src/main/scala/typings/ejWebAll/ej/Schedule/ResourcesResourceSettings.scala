package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcesResourceSettings extends js.Object {
  
  /** Binds appointmentClass field name in the dataSource. It applies custom CSS class name to appointments depicting to the resource it belongs.
    * @Default {null}
    */
  var appointmentClass: js.UndefOr[String] = js.native
  
  /** Binds color field name in the dataSource to resourceSettings color. The color specified here gets applied to the Schedule appointments denoting to the resource it belongs.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** The dataSource option accepts either JSON object collection or DataManager (ejDataManager) instance that contains the resources related data.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  
  /** Binds the end work hour field name in the dataSource. It's optional, but providing it with some numeric value will set the end work hour for specific resources.
    * @Default {null}
    */
  var end: js.UndefOr[String] = js.native
  
  /** Binds groupId field name in the dataSource to resourceSettings groupId.
    * @Default {null}
    */
  var groupId: js.UndefOr[String] = js.native
  
  /** Binds id field name in the dataSource to resourceSettings id.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  
  /** Binds the starting work hour field name in the dataSource. It's optional, but providing it with some numeric value will set the starting work hour for specific resources.
    * @Default {null}
    */
  var start: js.UndefOr[String] = js.native
  
  /** Binds text field name in the dataSource to resourceSettings text. These text gets listed out in resources field of the appointment window.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  
  /** Binds the resources working days field name in the dataSource. It's optional, and accepts the array of strings (week day names). When provided with specific collection of days
    * (array of day names), only those days will render for the specific resources.
    * @Default {null}
    */
  var workWeek: js.UndefOr[String] = js.native
}
object ResourcesResourceSettings {
  
  @scala.inline
  def apply(): ResourcesResourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesResourceSettings]
  }
  
  @scala.inline
  implicit class ResourcesResourceSettingsOps[Self <: ResourcesResourceSettings] (val x: Self) extends AnyVal {
    
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
    def setAppointmentClass(value: String): Self = this.set("appointmentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointmentClass: Self = this.set("appointmentClass", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Any | js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setWorkWeek(value: String): Self = this.set("workWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkWeek: Self = this.set("workWeek", js.undefined)
  }
}
