package typings.extjs.Ext.data.writer

import typings.extjs.Ext.IBase
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IOperation
import typings.extjs.Ext.data.IRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWriter extends IBase {
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.native
  /** [Method] Formats the data for each record before sending it to the server
    * @param record Ext.data.Model The record that we are writing to the server.
    * @param operation Ext.data.Operation An operation object.
    * @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
    */
  var getRecordData: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation], _]
  ] = js.native
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[String] = js.native
  /** [Method] Prepares a Proxy s Ext data Request object
    * @param request Ext.data.Request The request object
    * @returns Ext.data.Request The modified request object
    */
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.native
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var writeRecordId: js.UndefOr[Boolean] = js.native
}

object IWriter {
  @scala.inline
  def apply(): IWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriter]
  }
  @scala.inline
  implicit class IWriterOps[Self <: IWriter] (val x: Self) extends AnyVal {
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
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setGetRecordData(value: (/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation]) => _): Self = this.set("getRecordData", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetRecordData: Self = this.set("getRecordData", js.undefined)
    @scala.inline
    def setNameProperty(value: String): Self = this.set("nameProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameProperty: Self = this.set("nameProperty", js.undefined)
    @scala.inline
    def setWrite(value: /* request */ js.UndefOr[IRequest] => IRequest): Self = this.set("write", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
    @scala.inline
    def setWriteAllFields(value: Boolean): Self = this.set("writeAllFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteAllFields: Self = this.set("writeAllFields", js.undefined)
    @scala.inline
    def setWriteRecordId(value: Boolean): Self = this.set("writeRecordId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteRecordId: Self = this.set("writeRecordId", js.undefined)
  }
  
}

