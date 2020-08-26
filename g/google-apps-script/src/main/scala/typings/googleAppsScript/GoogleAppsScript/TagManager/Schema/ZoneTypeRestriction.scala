package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneTypeRestriction extends js.Object {
  var enable: js.UndefOr[Boolean] = js.native
  var whitelistedTypeId: js.UndefOr[js.Array[String]] = js.native
}

object ZoneTypeRestriction {
  @scala.inline
  def apply(): ZoneTypeRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneTypeRestriction]
  }
  @scala.inline
  implicit class ZoneTypeRestrictionOps[Self <: ZoneTypeRestriction] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setWhitelistedTypeIdVarargs(value: String*): Self = this.set("whitelistedTypeId", js.Array(value :_*))
    @scala.inline
    def setWhitelistedTypeId(value: js.Array[String]): Self = this.set("whitelistedTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelistedTypeId: Self = this.set("whitelistedTypeId", js.undefined)
  }
  
}

