package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedItem extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * How the item is shared. One of:
    *
    * - `not_shared`
    * - `shared_to`
    * - `shared_from`
    * - `shared_to_and_from`
    */
  var shared: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the user who owns the shared item.
    */
  var user: js.UndefOr[UserInfo] = js.undefined
}
object SharedItem {
  
  inline def apply(): SharedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedItem] (val x: Self) extends AnyVal {
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setShared(value: String): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setUser(value: UserInfo): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
