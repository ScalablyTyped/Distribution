package typings.documentdb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthOptions extends js.Object {
  /** The authorization master key to use to create the client. */
  var masterKey: js.UndefOr[String] = js.native
  /** An array of {@link Permission} objects. */
  var permissionFeed: js.UndefOr[js.Array[Permission]] = js.native
  /** An object that contains resources tokens. Keys for the object are resource Ids and values are the resource tokens. */
  var resourceTokens: js.UndefOr[StringDictionary[String]] = js.native
}

object AuthOptions {
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
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
    def setMasterKey(value: String): Self = this.set("masterKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterKey: Self = this.set("masterKey", js.undefined)
    @scala.inline
    def setPermissionFeedVarargs(value: Permission*): Self = this.set("permissionFeed", js.Array(value :_*))
    @scala.inline
    def setPermissionFeed(value: js.Array[Permission]): Self = this.set("permissionFeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionFeed: Self = this.set("permissionFeed", js.undefined)
    @scala.inline
    def setResourceTokens(value: StringDictionary[String]): Self = this.set("resourceTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTokens: Self = this.set("resourceTokens", js.undefined)
  }
  
}

