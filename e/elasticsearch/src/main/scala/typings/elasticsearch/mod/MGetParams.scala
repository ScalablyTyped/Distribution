package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MGetParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.native
  var _sourceExclude: js.UndefOr[NameList] = js.native
  var _sourceInclude: js.UndefOr[NameList] = js.native
  var index: js.UndefOr[String] = js.native
  var preference: js.UndefOr[String] = js.native
  var realtime: js.UndefOr[Boolean] = js.native
  var refresh: js.UndefOr[Boolean] = js.native
  var routing: js.UndefOr[String] = js.native
  var storedFields: js.UndefOr[NameList] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object MGetParams {
  @scala.inline
  def apply(): MGetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MGetParams]
  }
  @scala.inline
  implicit class MGetParamsOps[Self <: MGetParams] (val x: Self) extends AnyVal {
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
    def set_sourceVarargs(value: String*): Self = this.set("_source", js.Array(value :_*))
    @scala.inline
    def set_source(value: NameList): Self = this.set("_source", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    @scala.inline
    def set_sourceExcludeVarargs(value: String*): Self = this.set("_sourceExclude", js.Array(value :_*))
    @scala.inline
    def set_sourceExclude(value: NameList): Self = this.set("_sourceExclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sourceExclude: Self = this.set("_sourceExclude", js.undefined)
    @scala.inline
    def set_sourceIncludeVarargs(value: String*): Self = this.set("_sourceInclude", js.Array(value :_*))
    @scala.inline
    def set_sourceInclude(value: NameList): Self = this.set("_sourceInclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sourceInclude: Self = this.set("_sourceInclude", js.undefined)
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    @scala.inline
    def setRealtime(value: Boolean): Self = this.set("realtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealtime: Self = this.set("realtime", js.undefined)
    @scala.inline
    def setRefresh(value: Boolean): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setStoredFieldsVarargs(value: String*): Self = this.set("storedFields", js.Array(value :_*))
    @scala.inline
    def setStoredFields(value: NameList): Self = this.set("storedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoredFields: Self = this.set("storedFields", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

