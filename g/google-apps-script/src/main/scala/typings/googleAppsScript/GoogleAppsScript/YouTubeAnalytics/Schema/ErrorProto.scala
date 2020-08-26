package typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorProto extends js.Object {
  var argument: js.UndefOr[js.Array[String]] = js.native
  var code: js.UndefOr[String] = js.native
  var debugInfo: js.UndefOr[String] = js.native
  var domain: js.UndefOr[String] = js.native
  var externalErrorMessage: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var locationType: js.UndefOr[String] = js.native
}

object ErrorProto {
  @scala.inline
  def apply(): ErrorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorProto]
  }
  @scala.inline
  implicit class ErrorProtoOps[Self <: ErrorProto] (val x: Self) extends AnyVal {
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
    def setArgumentVarargs(value: String*): Self = this.set("argument", js.Array(value :_*))
    @scala.inline
    def setArgument(value: js.Array[String]): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgument: Self = this.set("argument", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDebugInfo(value: String): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugInfo: Self = this.set("debugInfo", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setExternalErrorMessage(value: String): Self = this.set("externalErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalErrorMessage: Self = this.set("externalErrorMessage", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
  }
  
}

