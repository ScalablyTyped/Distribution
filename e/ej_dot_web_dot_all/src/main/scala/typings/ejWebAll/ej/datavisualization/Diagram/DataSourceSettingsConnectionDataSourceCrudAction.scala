package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsConnectionDataSourceCrudAction extends js.Object {
  /** Specifies the create method which is used to get the connectors to be added from client side to the server side
    * @Default {null}
    */
  var create: js.UndefOr[String] = js.native
  /** Specifies the destroy method which is used to get the deleted items data from client side to the server side
    * @Default {null}
    */
  var destroy: js.UndefOr[String] = js.native
  /** Specifies the read method which is used to get the data from client side to the server side
    * @Default {null}
    */
  var read: js.UndefOr[String] = js.native
  /** Specifies the update method which is used to get the updated connectors from client side to the server side
    * @Default {null}
    */
  var update: js.UndefOr[String] = js.native
}

object DataSourceSettingsConnectionDataSourceCrudAction {
  @scala.inline
  def apply(): DataSourceSettingsConnectionDataSourceCrudAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsConnectionDataSourceCrudAction]
  }
  @scala.inline
  implicit class DataSourceSettingsConnectionDataSourceCrudActionOps[Self <: DataSourceSettingsConnectionDataSourceCrudAction] (val x: Self) extends AnyVal {
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
    def setCreate(value: String): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDestroy(value: String): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setRead(value: String): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setUpdate(value: String): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

