package typings.firebaseMessaging

import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseDependenciesMod {
  
  @JSImport("@firebase/messaging/dist/testing/fakes/firebase-dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")().asInstanceOf[FirebaseApp]
  @scala.inline
  def getFakeApp(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")(options.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  
  @scala.inline
  def getFakeFirebaseDependencies(): FirebaseInternalDependencies = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeFirebaseDependencies")().asInstanceOf[FirebaseInternalDependencies]
  @scala.inline
  def getFakeFirebaseDependencies(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseInternalDependencies = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeFirebaseDependencies")(options.asInstanceOf[js.Any]).asInstanceOf[FirebaseInternalDependencies]
}
