package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The managed configuration resources for the user.
  */
@js.native
trait SchemaManagedConfigurationsForUserListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsForUserListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A managed configuration for an app for a specific user.
    */
  var managedConfigurationForUser: js.UndefOr[js.Array[SchemaManagedConfiguration]] = js.native
}
object SchemaManagedConfigurationsForUserListResponse {
  
  @scala.inline
  def apply(): SchemaManagedConfigurationsForUserListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsForUserListResponse]
  }
  
  @scala.inline
  implicit class SchemaManagedConfigurationsForUserListResponseOps[Self <: SchemaManagedConfigurationsForUserListResponse] (val x: Self) extends AnyVal {
    
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
    def setManagedConfigurationForUserVarargs(value: SchemaManagedConfiguration*): Self = this.set("managedConfigurationForUser", js.Array(value :_*))
    
    @scala.inline
    def setManagedConfigurationForUser(value: js.Array[SchemaManagedConfiguration]): Self = this.set("managedConfigurationForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedConfigurationForUser: Self = this.set("managedConfigurationForUser", js.undefined)
  }
}
