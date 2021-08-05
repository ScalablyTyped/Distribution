package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing the object returned from a
  * {@link auth.Auth.listUsers `listUsers()`} operation. Contains the list
  * of users for the current batch and the next page token if available.
  */
trait ListUsersResult extends StObject {
  
  /**
    * The next page token if available. This is needed for the next batch download.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of {@link auth.UserRecord `UserRecord`} objects for the
    * current downloaded batch.
    */
  var users: js.Array[UserRecord]
}
object ListUsersResult {
  
  inline def apply(users: js.Array[UserRecord]): ListUsersResult = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersResult]
  }
  
  extension [Self <: ListUsersResult](x: Self) {
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setUsers(value: js.Array[UserRecord]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: UserRecord*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
