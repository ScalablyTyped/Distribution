package typings.firebaseTokenGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("firebase-token-generator", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with FirebaseTokenGenerator {
    /**
      * Builds a new object that can generate Firebase authentication tokens.
      * @constructor
      * @param { String } secret The secret for the Firebase being used (get yours from the Firebase Admin Console).
      */
    def this(secret: String) = this()
  }
}
