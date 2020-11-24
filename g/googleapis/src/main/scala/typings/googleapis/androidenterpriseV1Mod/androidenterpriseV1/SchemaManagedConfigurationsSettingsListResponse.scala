package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The managed configurations settings for a product.
  */
@js.native
trait SchemaManagedConfigurationsSettingsListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsSettingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A managed configurations settings for an app that may be assigned to a
    * group of users in an enterprise.
    */
  var managedConfigurationsSettings: js.UndefOr[js.Array[SchemaManagedConfigurationsSettings]] = js.native
}
object SchemaManagedConfigurationsSettingsListResponse {
  
  @scala.inline
  def apply(): SchemaManagedConfigurationsSettingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsSettingsListResponse]
  }
  
  @scala.inline
  implicit class SchemaManagedConfigurationsSettingsListResponseOps[Self <: SchemaManagedConfigurationsSettingsListResponse] (val x: Self) extends AnyVal {
    
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
    def setManagedConfigurationsSettingsVarargs(value: SchemaManagedConfigurationsSettings*): Self = this.set("managedConfigurationsSettings", js.Array(value :_*))
    
    @scala.inline
    def setManagedConfigurationsSettings(value: js.Array[SchemaManagedConfigurationsSettings]): Self = this.set("managedConfigurationsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedConfigurationsSettings: Self = this.set("managedConfigurationsSettings", js.undefined)
  }
}
