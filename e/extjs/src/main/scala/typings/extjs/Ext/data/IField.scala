package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IField extends IBase {
  /** [Config Option] (Function) */
  var convert: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dateReadFormat: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dateWriteFormat: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Number) */
  var mapping: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var persist: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var serialize: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var sortDir: js.UndefOr[String] = js.native
  /** [Config Option] (Function/String) */
  var sortType: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object) */
  var `type`: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var useNull: js.UndefOr[Boolean] = js.native
}

object IField {
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
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
    def setConvert(value: js.Any): Self = this.set("convert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDateReadFormat(value: String): Self = this.set("dateReadFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateReadFormat: Self = this.set("dateReadFormat", js.undefined)
    @scala.inline
    def setDateWriteFormat(value: String): Self = this.set("dateWriteFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateWriteFormat: Self = this.set("dateWriteFormat", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setMapping(value: js.Any): Self = this.set("mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    @scala.inline
    def setSerialize(value: js.Any): Self = this.set("serialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    @scala.inline
    def setSortDir(value: String): Self = this.set("sortDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDir: Self = this.set("sortDir", js.undefined)
    @scala.inline
    def setSortType(value: js.Any): Self = this.set("sortType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortType: Self = this.set("sortType", js.undefined)
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUseNull(value: Boolean): Self = this.set("useNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNull: Self = this.set("useNull", js.undefined)
  }
  
}

