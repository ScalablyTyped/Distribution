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
  
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  
  @scala.inline
  implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasterKey(value: String): Self = StObject.set(x, "masterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterKeyUndefined: Self = StObject.set(x, "masterKey", js.undefined)
    
    @scala.inline
    def setPermissionFeed(value: js.Array[Permission]): Self = StObject.set(x, "permissionFeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionFeedUndefined: Self = StObject.set(x, "permissionFeed", js.undefined)
    
    @scala.inline
    def setPermissionFeedVarargs(value: Permission*): Self = StObject.set(x, "permissionFeed", js.Array(value :_*))
    
    @scala.inline
    def setResourceTokens(value: StringDictionary[String]): Self = StObject.set(x, "resourceTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTokensUndefined: Self = StObject.set(x, "resourceTokens", js.undefined)
  }
}
