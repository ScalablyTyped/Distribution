package typings.documentdb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthOptions extends StObject {
  
  /** The authorization master key to use to create the client. */
  var masterKey: js.UndefOr[String] = js.undefined
  
  /** An array of {@link Permission} objects. */
  var permissionFeed: js.UndefOr[js.Array[Permission]] = js.undefined
  
  /** An object that contains resources tokens. Keys for the object are resource Ids and values are the resource tokens. */
  var resourceTokens: js.UndefOr[StringDictionary[String]] = js.undefined
}
object AuthOptions {
  
  inline def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  
  extension [Self <: AuthOptions](x: Self) {
    
    inline def setMasterKey(value: String): Self = StObject.set(x, "masterKey", value.asInstanceOf[js.Any])
    
    inline def setMasterKeyUndefined: Self = StObject.set(x, "masterKey", js.undefined)
    
    inline def setPermissionFeed(value: js.Array[Permission]): Self = StObject.set(x, "permissionFeed", value.asInstanceOf[js.Any])
    
    inline def setPermissionFeedUndefined: Self = StObject.set(x, "permissionFeed", js.undefined)
    
    inline def setPermissionFeedVarargs(value: Permission*): Self = StObject.set(x, "permissionFeed", js.Array(value :_*))
    
    inline def setResourceTokens(value: StringDictionary[String]): Self = StObject.set(x, "resourceTokens", value.asInstanceOf[js.Any])
    
    inline def setResourceTokensUndefined: Self = StObject.set(x, "resourceTokens", js.undefined)
  }
}
