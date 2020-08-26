package typings.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlWriter
  extends typings.extjs.Ext.data.writer.IWriter {
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
}

object IXmlWriter {
  @scala.inline
  def apply(): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlWriter]
  }
  @scala.inline
  implicit class IXmlWriterOps[Self <: IXmlWriter] (val x: Self) extends AnyVal {
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
    def setDefaultDocumentRoot(value: String): Self = this.set("defaultDocumentRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDocumentRoot: Self = this.set("defaultDocumentRoot", js.undefined)
    @scala.inline
    def setDocumentRoot(value: String): Self = this.set("documentRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentRoot: Self = this.set("documentRoot", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setRecord(value: String): Self = this.set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
  }
  
}

