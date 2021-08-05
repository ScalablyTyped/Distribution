package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The managed configuration resources for the user.
  */
trait SchemaManagedConfigurationsForUserListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsForUserListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A managed configuration for an app for a specific user.
    */
  var managedConfigurationForUser: js.UndefOr[js.Array[SchemaManagedConfiguration]] = js.undefined
}
object SchemaManagedConfigurationsForUserListResponse {
  
  inline def apply(): SchemaManagedConfigurationsForUserListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsForUserListResponse]
  }
  
  extension [Self <: SchemaManagedConfigurationsForUserListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setManagedConfigurationForUser(value: js.Array[SchemaManagedConfiguration]): Self = StObject.set(x, "managedConfigurationForUser", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationForUserUndefined: Self = StObject.set(x, "managedConfigurationForUser", js.undefined)
    
    inline def setManagedConfigurationForUserVarargs(value: SchemaManagedConfiguration*): Self = StObject.set(x, "managedConfigurationForUser", js.Array(value :_*))
  }
}
