package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the permissions required by a specific app and whether
  * they have been accepted by the enterprise.
  */
@js.native
trait SchemaProductPermissions extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#productPermissions&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The permissions required by the app.
    */
  var permission: js.UndefOr[js.Array[SchemaProductPermission]] = js.native
  
  /**
    * The ID of the app that the permissions relate to, e.g.
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.native
}
object SchemaProductPermissions {
  
  @scala.inline
  def apply(): SchemaProductPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPermissions]
  }
  
  @scala.inline
  implicit class SchemaProductPermissionsMutableBuilder[Self <: SchemaProductPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPermission(value: js.Array[SchemaProductPermission]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setPermissionVarargs(value: SchemaProductPermission*): Self = StObject.set(x, "permission", js.Array(value :_*))
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
