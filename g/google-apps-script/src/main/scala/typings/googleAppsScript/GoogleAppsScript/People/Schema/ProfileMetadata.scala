package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileMetadata extends js.Object {
  var objectType: js.UndefOr[String] = js.native
  var userTypes: js.UndefOr[js.Array[String]] = js.native
}

object ProfileMetadata {
  @scala.inline
  def apply(): ProfileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileMetadata]
  }
  @scala.inline
  implicit class ProfileMetadataOps[Self <: ProfileMetadata] (val x: Self) extends AnyVal {
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
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setUserTypesVarargs(value: String*): Self = this.set("userTypes", js.Array(value :_*))
    @scala.inline
    def setUserTypes(value: js.Array[String]): Self = this.set("userTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserTypes: Self = this.set("userTypes", js.undefined)
  }
  
}

