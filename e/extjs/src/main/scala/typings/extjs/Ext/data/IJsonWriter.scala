package typings.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonWriter
  extends typings.extjs.Ext.data.writer.IWriter {
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var expandData: js.UndefOr[Boolean] = js.native
  /** [Method] The Reader classes support dot delimited data mappings for extracting nested raw data into fields so the writer must
    * @param data Object
    */
  var getExpandedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
}

object IJsonWriter {
  @scala.inline
  def apply(): IJsonWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonWriter]
  }
  @scala.inline
  implicit class IJsonWriterOps[Self <: IJsonWriter] (val x: Self) extends AnyVal {
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
    def setAllowSingle(value: Boolean): Self = this.set("allowSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSingle: Self = this.set("allowSingle", js.undefined)
    @scala.inline
    def setEncode(value: Boolean): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setExpandData(value: Boolean): Self = this.set("expandData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandData: Self = this.set("expandData", js.undefined)
    @scala.inline
    def setGetExpandedData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("getExpandedData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetExpandedData: Self = this.set("getExpandedData", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

