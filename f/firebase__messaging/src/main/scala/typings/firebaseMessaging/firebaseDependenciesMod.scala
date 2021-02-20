package typings.firebaseMessaging

import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseDependenciesMod {
  
  @JSImport("@firebase/messaging/dist/testing/fakes/firebase-dependencies", "getFakeApp")
  @js.native
  def getFakeApp(): FirebaseApp = js.native
  @JSImport("@firebase/messaging/dist/testing/fakes/firebase-dependencies", "getFakeApp")
  @js.native
  def getFakeApp(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseApp = js.native
  
  @JSImport("@firebase/messaging/dist/testing/fakes/firebase-dependencies", "getFakeFirebaseDependencies")
  @js.native
  def getFakeFirebaseDependencies(): FirebaseInternalDependencies = js.native
  @JSImport("@firebase/messaging/dist/testing/fakes/firebase-dependencies", "getFakeFirebaseDependencies")
  @js.native
  def getFakeFirebaseDependencies(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseInternalDependencies = js.native
}
