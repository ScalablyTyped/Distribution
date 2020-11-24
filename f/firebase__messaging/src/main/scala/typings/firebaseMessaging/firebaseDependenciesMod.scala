package typings.firebaseMessaging

import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/messaging/dist/testing/fakes/firebase-dependencies", JSImport.Namespace)
@js.native
object firebaseDependenciesMod extends js.Object {
  
  def getFakeApp(): FirebaseApp = js.native
  def getFakeApp(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseApp = js.native
  
  def getFakeFirebaseDependencies(): FirebaseInternalDependencies = js.native
  def getFakeFirebaseDependencies(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseInternalDependencies = js.native
}
