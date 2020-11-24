package typings.firebaseFunctions.contextMod

import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseMessagingTypes.mod.FirebaseMessagingName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/functions/dist/src/context", "ContextProvider")
@js.native
class ContextProvider protected () extends js.Object {
  def this(
    authProvider: Provider[FirebaseAuthInternalName],
    messagingProvider: Provider[FirebaseMessagingName]
  ) = this()
  
  var auth: js.Any = js.native
  
  def getAuthToken(): js.Promise[js.UndefOr[String]] = js.native
  
  def getContext(): js.Promise[Context] = js.native
  
  def getInstanceIdToken(): js.Promise[js.UndefOr[String]] = js.native
  
  var messaging: js.Any = js.native
}
