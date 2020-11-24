package typings.firebaseTokenGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class FirebaseTokenGenerator protected ()
    extends typings.firebaseTokenGenerator.FirebaseTokenGenerator {
    /**
      * Builds a new object that can generate Firebase authentication tokens.
      * @constructor
      * @param { String } secret The secret for the Firebase being used (get yours from the Firebase Admin Console).
      */
    def this(secret: String) = this()
  }
}
