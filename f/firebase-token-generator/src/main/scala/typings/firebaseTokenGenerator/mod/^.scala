package typings.firebaseTokenGenerator.mod

import typings.firebaseTokenGenerator.FirebaseTokenGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase-token-generator", JSImport.Namespace)
@js.native
class ^ protected () extends FirebaseTokenGenerator {
  /**
    * Builds a new object that can generate Firebase authentication tokens.
    * @constructor
    * @param { String } secret The secret for the Firebase being used (get yours from the Firebase Admin Console).
    */
  def this(secret: String) = this()
}
