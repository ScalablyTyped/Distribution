package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsConnectionDataSource extends js.Object {
  /** Specifies the method name which is used to get updated connectors from client side to the server side
    * @Default {null}
    */
  var crudAction: js.UndefOr[DataSourceSettingsConnectionDataSourceCrudAction] = js.native
  /** Specifies the custom fields to get the updated data from client side to the server side
    * @Default {[]}
    */
  var customFields: js.UndefOr[js.Array[_]] = js.native
  /** Sets the datasource for the connection datasource settings items.
    * @Default {null}
    */
  var dataSource: js.UndefOr[String] = js.native
  /** Sets the unique id of the connection data source item
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  /** Sets the source node of the connection data source item
    * @Default {null}
    */
  var sourceNode: js.UndefOr[String] = js.native
  /** Sets the sourcePointX value of the connection data source item
    * @Default {null}
    */
  var sourcePointX: js.UndefOr[String] = js.native
  /** Sets the sourcePointY value of the connection data source item
    * @Default {null}
    */
  var sourcePointY: js.UndefOr[String] = js.native
  /** Sets the target node of the connection data source item
    * @Default {null}
    */
  var targetNode: js.UndefOr[String] = js.native
  /** Sets the targetPoint-x value of the connection data source item
    * @Default {null}
    */
  var targetPointX: js.UndefOr[String] = js.native
  /** Sets the targetPoint-y value of the connection data source item
    * @Default {null}
    */
  var targetPointY: js.UndefOr[String] = js.native
}

object DataSourceSettingsConnectionDataSource {
  @scala.inline
  def apply(): DataSourceSettingsConnectionDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsConnectionDataSource]
  }
  @scala.inline
  implicit class DataSourceSettingsConnectionDataSourceOps[Self <: DataSourceSettingsConnectionDataSource] (val x: Self) extends AnyVal {
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
    def setCrudAction(value: DataSourceSettingsConnectionDataSourceCrudAction): Self = this.set("crudAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrudAction: Self = this.set("crudAction", js.undefined)
    @scala.inline
    def setCustomFieldsVarargs(value: js.Any*): Self = this.set("customFields", js.Array(value :_*))
    @scala.inline
    def setCustomFields(value: js.Array[_]): Self = this.set("customFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    @scala.inline
    def setDataSource(value: String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setSourceNode(value: String): Self = this.set("sourceNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceNode: Self = this.set("sourceNode", js.undefined)
    @scala.inline
    def setSourcePointX(value: String): Self = this.set("sourcePointX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePointX: Self = this.set("sourcePointX", js.undefined)
    @scala.inline
    def setSourcePointY(value: String): Self = this.set("sourcePointY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePointY: Self = this.set("sourcePointY", js.undefined)
    @scala.inline
    def setTargetNode(value: String): Self = this.set("targetNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetNode: Self = this.set("targetNode", js.undefined)
    @scala.inline
    def setTargetPointX(value: String): Self = this.set("targetPointX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetPointX: Self = this.set("targetPointX", js.undefined)
    @scala.inline
    def setTargetPointY(value: String): Self = this.set("targetPointY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetPointY: Self = this.set("targetPointY", js.undefined)
  }
  
}

