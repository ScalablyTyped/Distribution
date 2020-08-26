package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedConfigurationsForUserListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#managedConfigurationsForUserListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** A managed configuration for an app for a specific user. */
  var managedConfigurationForUser: js.UndefOr[js.Array[ManagedConfiguration]] = js.native
}

object ManagedConfigurationsForUserListResponse {
  @scala.inline
  def apply(): ManagedConfigurationsForUserListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsForUserListResponse]
  }
  @scala.inline
  implicit class ManagedConfigurationsForUserListResponseOps[Self <: ManagedConfigurationsForUserListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setManagedConfigurationForUserVarargs(value: ManagedConfiguration*): Self = this.set("managedConfigurationForUser", js.Array(value :_*))
    @scala.inline
    def setManagedConfigurationForUser(value: js.Array[ManagedConfiguration]): Self = this.set("managedConfigurationForUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedConfigurationForUser: Self = this.set("managedConfigurationForUser", js.undefined)
  }
  
}

