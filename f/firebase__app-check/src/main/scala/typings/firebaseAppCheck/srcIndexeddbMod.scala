package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.srcTypesMod.AppCheckTokenInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndexeddbMod {
  
  @JSImport("@firebase/app-check/dist/src/indexeddb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readDebugTokenFromIndexedDB(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDebugTokenFromIndexedDB")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def readTokenFromIndexedDB(app: FirebaseApp): js.Promise[js.UndefOr[AppCheckTokenInternal]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readTokenFromIndexedDB")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[AppCheckTokenInternal]]]
  
  inline def writeDebugTokenToIndexedDB(token: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeDebugTokenToIndexedDB")(token.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def writeTokenToIndexedDB(app: FirebaseApp, token: AppCheckTokenInternal): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTokenToIndexedDB")(app.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
