package typings.extjs.Ext.data.reader

import typings.extjs.Ext.data.IResultSet
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReader extends IObservable {
  /** [Method] Takes a raw response object as passed to the read method and returns the useful data segment from it
    * @param response Object The response object
    * @returns Ext.data.ResultSet A ResultSet object
    */
  var getResponseData: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.native
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var implicitIncludes: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var messageProperty: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var metaData: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var rawData: js.UndefOr[js.Any] = js.native
  /** [Method] Reads the given response object
    * @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
    * @returns Ext.data.ResultSet The parsed or default ResultSet object
    */
  var read: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.native
  /** [Method] Abstracts common functionality used by all Reader subclasses
    * @param data Object The raw data object
    * @returns Ext.data.ResultSet A ResultSet object
    */
  var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], IResultSet]] = js.native
  /** [Config Option] (Boolean) */
  var readRecordsOnFailure: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var successProperty: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var totalProperty: js.UndefOr[String] = js.native
}

object IReader {
  @scala.inline
  def apply(): IReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReader]
  }
  @scala.inline
  implicit class IReaderOps[Self <: IReader] (val x: Self) extends AnyVal {
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
    def setGetResponseData(value: /* response */ js.UndefOr[js.Any] => IResultSet): Self = this.set("getResponseData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetResponseData: Self = this.set("getResponseData", js.undefined)
    @scala.inline
    def setIdProperty(value: String): Self = this.set("idProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdProperty: Self = this.set("idProperty", js.undefined)
    @scala.inline
    def setImplicitIncludes(value: Boolean): Self = this.set("implicitIncludes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplicitIncludes: Self = this.set("implicitIncludes", js.undefined)
    @scala.inline
    def setMessageProperty(value: String): Self = this.set("messageProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageProperty: Self = this.set("messageProperty", js.undefined)
    @scala.inline
    def setMetaData(value: js.Any): Self = this.set("metaData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaData: Self = this.set("metaData", js.undefined)
    @scala.inline
    def setRawData(value: js.Any): Self = this.set("rawData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawData: Self = this.set("rawData", js.undefined)
    @scala.inline
    def setRead(value: /* response */ js.UndefOr[js.Any] => IResultSet): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setReadRecords(value: /* data */ js.UndefOr[js.Any] => IResultSet): Self = this.set("readRecords", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReadRecords: Self = this.set("readRecords", js.undefined)
    @scala.inline
    def setReadRecordsOnFailure(value: Boolean): Self = this.set("readRecordsOnFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadRecordsOnFailure: Self = this.set("readRecordsOnFailure", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSuccessProperty(value: String): Self = this.set("successProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessProperty: Self = this.set("successProperty", js.undefined)
    @scala.inline
    def setTotalProperty(value: String): Self = this.set("totalProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalProperty: Self = this.set("totalProperty", js.undefined)
  }
  
}

