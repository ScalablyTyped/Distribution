package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The user resources for the group license.
  */
@js.native
trait SchemaGroupLicenseUsersListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#groupLicenseUsersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A user of an enterprise.
    */
  var user: js.UndefOr[js.Array[SchemaUser]] = js.native
}
object SchemaGroupLicenseUsersListResponse {
  
  @scala.inline
  def apply(): SchemaGroupLicenseUsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupLicenseUsersListResponse]
  }
  
  @scala.inline
  implicit class SchemaGroupLicenseUsersListResponseMutableBuilder[Self <: SchemaGroupLicenseUsersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUser(value: js.Array[SchemaUser]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setUserVarargs(value: SchemaUser*): Self = StObject.set(x, "user", js.Array(value :_*))
  }
}
