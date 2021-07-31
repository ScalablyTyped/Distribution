package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSharedItem extends StObject {
  
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
    *
    */
  var shared: js.UndefOr[String] = js.undefined
  
  /**
    * The user whose sharing information is being requested.
    */
  var user: js.UndefOr[UserInfo] = js.undefined
}
object UserSharedItem {
  
  @scala.inline
  def apply(): UserSharedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSharedItem]
  }
  
  @scala.inline
  implicit class UserSharedItemMutableBuilder[Self <: UserSharedItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setShared(value: String): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setUser(value: UserInfo): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
