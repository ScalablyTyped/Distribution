package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The managed configuration resources for the user.
  */
@js.native
trait SchemaManagedConfigurationsForUserListResponse extends StObject {
  
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
  implicit class SchemaManagedConfigurationsForUserListResponseMutableBuilder[Self <: SchemaManagedConfigurationsForUserListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setManagedConfigurationForUser(value: js.Array[SchemaManagedConfiguration]): Self = StObject.set(x, "managedConfigurationForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationForUserUndefined: Self = StObject.set(x, "managedConfigurationForUser", js.undefined)
    
    @scala.inline
    def setManagedConfigurationForUserVarargs(value: SchemaManagedConfiguration*): Self = StObject.set(x, "managedConfigurationForUser", js.Array(value :_*))
  }
}
