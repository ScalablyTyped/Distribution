package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of the {@link auth.Auth.getUsers} API. */
trait GetUsersResult extends StObject {
  
  /** Set of identifiers that were requested, but not found. */
  var notFound: js.Array[UserIdentifier]
  
  /**
    * Set of user records, corresponding to the set of users that were
    * requested. Only users that were found are listed here. The result set is
    * unordered.
    */
  var users: js.Array[UserRecord]
}
object GetUsersResult {
  
  @scala.inline
  def apply(notFound: js.Array[UserIdentifier], users: js.Array[UserRecord]): GetUsersResult = {
    val __obj = js.Dynamic.literal(notFound = notFound.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsersResult]
  }
  
  @scala.inline
  implicit class GetUsersResultMutableBuilder[Self <: GetUsersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotFound(value: js.Array[UserIdentifier]): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundVarargs(value: UserIdentifier*): Self = StObject.set(x, "notFound", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[UserRecord]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: UserRecord*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
