package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSettings extends js.Object {
  
  /** Defines the data source either as a collection of objects or as an instance of ej.DataManager
    * @Default {null}
    */
  var connectionDataSource: js.UndefOr[DataSourceSettingsConnectionDataSource] = js.native
  
  /** Specifies the method name which is used to get the updated data from client side to the server side
    * @Default {null}
    */
  var crudAction: js.UndefOr[DataSourceSettingsCrudAction] = js.native
  
  /** Specifies the custom fields to get the updated data from client side to the server side
    * @Default {[]}
    */
  var customFields: js.UndefOr[js.Array[_]] = js.native
  
  /** Defines the data source either as a collection of objects or as an instance of ej.DataManager
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Sets the unique id of the data source items
    */
  var id: js.UndefOr[String] = js.native
  
  /** Defines the parent id of the data source item
    * @Default {''}
    */
  var parent: js.UndefOr[String] = js.native
  
  /** Describes query to retrieve a set of data from the specified datasource
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.native
  
  /** Sets the unique id of the root data source item
    */
  var root: js.UndefOr[String] = js.native
  
  /** Describes the name of the table on which the specified query has to be executed
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.native
}
object DataSourceSettings {
  
  @scala.inline
  def apply(): DataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettings]
  }
  
  @scala.inline
  implicit class DataSourceSettingsOps[Self <: DataSourceSettings] (val x: Self) extends AnyVal {
    
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
    def setConnectionDataSource(value: DataSourceSettingsConnectionDataSource): Self = this.set("connectionDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionDataSource: Self = this.set("connectionDataSource", js.undefined)
    
    @scala.inline
    def setCrudAction(value: DataSourceSettingsCrudAction): Self = this.set("crudAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrudAction: Self = this.set("crudAction", js.undefined)
    
    @scala.inline
    def setCustomFieldsVarargs(value: js.Any*): Self = this.set("customFields", js.Array(value :_*))
    
    @scala.inline
    def setCustomFields(value: js.Array[_]): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
  }
}
