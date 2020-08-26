package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatCommonParams extends GenericParams {
  var format: String = js.native
  var h: js.UndefOr[NameList] = js.native
  var help: js.UndefOr[Boolean] = js.native
  var local: js.UndefOr[Boolean] = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var v: js.UndefOr[Boolean] = js.native
}

object CatCommonParams {
  @scala.inline
  def apply(format: String): CatCommonParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatCommonParams]
  }
  @scala.inline
  implicit class CatCommonParamsOps[Self <: CatCommonParams] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setHVarargs(value: String*): Self = this.set("h", js.Array(value :_*))
    @scala.inline
    def setH(value: NameList): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setHelp(value: Boolean): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
    @scala.inline
    def setV(value: Boolean): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
  
}

