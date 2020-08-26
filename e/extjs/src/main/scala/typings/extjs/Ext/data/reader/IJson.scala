package typings.extjs.Ext.data.reader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJson extends IReader {
  /** [Property] (Object) */
  var jsonData: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var metaProperty: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var useSimpleAccessors: js.UndefOr[Boolean] = js.native
}

object IJson {
  @scala.inline
  def apply(): IJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJson]
  }
  @scala.inline
  implicit class IJsonOps[Self <: IJson] (val x: Self) extends AnyVal {
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
    def setJsonData(value: js.Any): Self = this.set("jsonData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonData: Self = this.set("jsonData", js.undefined)
    @scala.inline
    def setMetaProperty(value: String): Self = this.set("metaProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaProperty: Self = this.set("metaProperty", js.undefined)
    @scala.inline
    def setRecord(value: String): Self = this.set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
    @scala.inline
    def setUseSimpleAccessors(value: Boolean): Self = this.set("useSimpleAccessors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSimpleAccessors: Self = this.set("useSimpleAccessors", js.undefined)
  }
  
}

