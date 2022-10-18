package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcAuthUserMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/auth/user", "User")
  @js.native
  open class User () extends StObject {
    def this(uid: String) = this()
    
    def isAuthenticated(): Boolean = js.native
    
    def isEqual(otherUser: User): Boolean = js.native
    
    /**
      * Returns a key representing this user, suitable for inclusion in a
      * dictionary.
      */
    def toKey(): String = js.native
    
    val uid: String | Null = js.native
  }
  /* static members */
  object User {
    
    @JSImport("@firebase/firestore/dist/firestore/src/auth/user", "User.FIRST_PARTY")
    @js.native
    val FIRST_PARTY: User = js.native
    
    @JSImport("@firebase/firestore/dist/firestore/src/auth/user", "User.GOOGLE_CREDENTIALS")
    @js.native
    val GOOGLE_CREDENTIALS: User = js.native
    
    @JSImport("@firebase/firestore/dist/firestore/src/auth/user", "User.MOCK_USER")
    @js.native
    val MOCK_USER: User = js.native
    
    /** A user with a null UID. */
    @JSImport("@firebase/firestore/dist/firestore/src/auth/user", "User.UNAUTHENTICATED")
    @js.native
    val UNAUTHENTICATED: User = js.native
  }
}
