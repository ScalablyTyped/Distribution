package typings.firebaseAuth.distNodeIndexDotnodeMod

import typings.firebaseAuth.firebaseAuthStrings.link
import typings.firebaseAuth.firebaseAuthStrings.reauthenticate
import typings.firebaseAuth.firebaseAuthStrings.signIn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OperationType {
  
  /** Operation involving linking an additional provider to an already signed-in user. */
  @JSImport("@firebase/auth/dist/node/index.node", "OperationType.LINK")
  @js.native
  val LINK: link = js.native
  
  /** Operation involving using a provider to reauthenticate an already signed-in user. */
  @JSImport("@firebase/auth/dist/node/index.node", "OperationType.REAUTHENTICATE")
  @js.native
  val REAUTHENTICATE: reauthenticate = js.native
  
  /** Operation involving signing in a user. */
  @JSImport("@firebase/auth/dist/node/index.node", "OperationType.SIGN_IN")
  @js.native
  val SIGN_IN: signIn = js.native
}
