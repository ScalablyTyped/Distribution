package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockoutSettings extends js.Object {
  
  /** Binds the name of customStyle field in dataSource. It applies the custom CSS to the block intervals.
    * @Default {null}
    */
  var customStyle: js.UndefOr[String] = js.native
  
  /** The dataSource option accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule block intervals.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  
  /** When set to true, enables the blockout option to be applied on the Scheduler cells.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /** Binds the name of endTime field in dataSource with the end time of block time interval. It indicates the date and time, when the block interval actually ends in the Scheduler.
    * @Default {null}
    */
  var endTime: js.UndefOr[String] = js.native
  
  /** Binds the name of groupId field in dataSource. Specifies the id of the resource group, to which the time intervals are needed to be blocked.
    * @Default {null}
    */
  var groupId: js.UndefOr[String] = js.native
  
  /** Binds the id field name in dataSource to the id of block time interval. It denotes the unique id assigned to each of the block records.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  
  /** Binds the name of isAllDay field in dataSource. It indicates whether an entire day is blocked or not.
    * @Default {null}
    */
  var isAllDay: js.UndefOr[String] = js.native
  
  /** Binds the name of isBlockAppointment field in dataSource. When set to true, disables the appointments that lies on the blocked area and restrict to perform CRUD operations in it.
    * @Default {null}
    */
  var isBlockAppointment: js.UndefOr[String] = js.native
  
  /** It holds either the ej.Query() object or simply the query string that retrieves the specified records from the table.
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.native
  
  /** Binds the name of resourceId field in dataSource. Specifies the id of the resources, to which the time intervals are needed to be blocked.
    * @Default {null}
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /** Binds the name of startTime field in the dataSource with start time of block time interval. It indicates the date and time, when the block interval actually starts in the
    * Scheduler.
    * @Default {null}
    */
  var startTime: js.UndefOr[String] = js.native
  
  /** Binds the name of subject field in the dataSource to block time Subject. Indicates the Subject or title that gets displayed on the Schedule block intervals.
    * @Default {null}
    */
  var subject: js.UndefOr[String] = js.native
  
  /** Assign the table name from where the records are to be fetched for the Schedule.
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.native
  
  /** Template design that applies on the Schedule block intervals. All the field names that are mapped from dataSource to the appropriate field properties within the blockoutSettings
    * can be used within the template.
    * @Default {null}
    */
  var templateId: js.UndefOr[String] = js.native
}
object BlockoutSettings {
  
  @scala.inline
  def apply(): BlockoutSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockoutSettings]
  }
  
  @scala.inline
  implicit class BlockoutSettingsOps[Self <: BlockoutSettings] (val x: Self) extends AnyVal {
    
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
    def setCustomStyle(value: String): Self = this.set("customStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomStyle: Self = this.set("customStyle", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Any | js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsAllDay(value: String): Self = this.set("isAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAllDay: Self = this.set("isAllDay", js.undefined)
    
    @scala.inline
    def setIsBlockAppointment(value: String): Self = this.set("isBlockAppointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBlockAppointment: Self = this.set("isBlockAppointment", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
}
