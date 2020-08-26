package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermvectorsParams extends GenericParams {
  var fieldStatistics: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[NameList] = js.native
  var id: js.UndefOr[String] = js.native
  var index: String = js.native
  var offsets: js.UndefOr[Boolean] = js.native
  var parent: js.UndefOr[String] = js.native
  var payloads: js.UndefOr[Boolean] = js.native
  var positions: js.UndefOr[Boolean] = js.native
  var preference: js.UndefOr[String] = js.native
  var realtime: js.UndefOr[Boolean] = js.native
  var routing: js.UndefOr[String] = js.native
  var termStatistics: js.UndefOr[Boolean] = js.native
  var `type`: String = js.native
  var version: js.UndefOr[Double] = js.native
  var versionType: js.UndefOr[VersionType] = js.native
}

object TermvectorsParams {
  @scala.inline
  def apply(index: String, `type`: String): TermvectorsParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermvectorsParams]
  }
  @scala.inline
  implicit class TermvectorsParamsOps[Self <: TermvectorsParams] (val x: Self) extends AnyVal {
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldStatistics(value: Boolean): Self = this.set("fieldStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldStatistics: Self = this.set("fieldStatistics", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: NameList): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOffsets(value: Boolean): Self = this.set("offsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsets: Self = this.set("offsets", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPayloads(value: Boolean): Self = this.set("payloads", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloads: Self = this.set("payloads", js.undefined)
    @scala.inline
    def setPositions(value: Boolean): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    @scala.inline
    def setRealtime(value: Boolean): Self = this.set("realtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealtime: Self = this.set("realtime", js.undefined)
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setTermStatistics(value: Boolean): Self = this.set("termStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermStatistics: Self = this.set("termStatistics", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersionType(value: VersionType): Self = this.set("versionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionType: Self = this.set("versionType", js.undefined)
  }
  
}

