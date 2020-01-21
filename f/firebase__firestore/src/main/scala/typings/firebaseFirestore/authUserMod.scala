package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/auth/user", JSImport.Namespace)
@js.native
object authUserMod extends js.Object {
  @js.native
  class User () extends js.Object {
    def this(uid: String) = this()
    val uid: String | Null = js.native
    def isAuthenticated(): Boolean = js.native
    def isEqual(otherUser: User): Boolean = js.native
    /**
      * Returns a key representing this user, suitable for inclusion in a
      * dictionary.
      */
    def toKey(): String = js.native
  }
  
  /* static members */
  @js.native
  object User extends js.Object {
    val FIRST_PARTY: User = js.native
    val GOOGLE_CREDENTIALS: User = js.native
    /** A user with a null UID. */
    val UNAUTHENTICATED: User = js.native
  }
  
}

