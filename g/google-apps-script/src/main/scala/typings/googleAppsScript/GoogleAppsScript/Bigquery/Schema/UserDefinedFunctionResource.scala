package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDefinedFunctionResource extends js.Object {
  var inlineCode: js.UndefOr[String] = js.native
  var resourceUri: js.UndefOr[String] = js.native
}

object UserDefinedFunctionResource {
  @scala.inline
  def apply(): UserDefinedFunctionResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedFunctionResource]
  }
  @scala.inline
  implicit class UserDefinedFunctionResourceOps[Self <: UserDefinedFunctionResource] (val x: Self) extends AnyVal {
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
    def setInlineCode(value: String): Self = this.set("inlineCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineCode: Self = this.set("inlineCode", js.undefined)
    @scala.inline
    def setResourceUri(value: String): Self = this.set("resourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceUri: Self = this.set("resourceUri", js.undefined)
  }
  
}

