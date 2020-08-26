package typings.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlReader
  extends typings.extjs.Ext.data.reader.IReader {
  /** [Method] Normalizes the data object
    * @param data Object The raw data object
    * @returns Object The documentElement property of the data object if present, or the same object if not.
    */
  var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (String) */
  var namespace: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var xmlData: js.UndefOr[js.Any] = js.native
}

object IXmlReader {
  @scala.inline
  def apply(): IXmlReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlReader]
  }
  @scala.inline
  implicit class IXmlReaderOps[Self <: IXmlReader] (val x: Self) extends AnyVal {
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
    def setGetData(value: /* data */ js.UndefOr[js.Any] => _): Self = this.set("getData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setRecord(value: String): Self = this.set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
    @scala.inline
    def setXmlData(value: js.Any): Self = this.set("xmlData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlData: Self = this.set("xmlData", js.undefined)
  }
  
}

