package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.distEsmSrcTypesMod.AppCheckTokenInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcStorageMod {
  
  @JSImport("@firebase/app-check/dist/esm/src/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readOrCreateDebugTokenFromStorage(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readOrCreateDebugTokenFromStorage")().asInstanceOf[js.Promise[String]]
  
  inline def readTokenFromStorage(app: FirebaseApp): js.Promise[js.UndefOr[AppCheckTokenInternal]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readTokenFromStorage")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[AppCheckTokenInternal]]]
  
  inline def writeTokenToStorage(app: FirebaseApp): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeTokenToStorage")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def writeTokenToStorage(app: FirebaseApp, token: AppCheckTokenInternal): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTokenToStorage")(app.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
