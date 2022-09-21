package typings.firebaseApp

import typings.firebaseApp.publicTypesMod.FirebaseApp
import typings.firebaseApp.typesMod.HeartbeatsInIndexedDB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexeddbMod {
  
  @JSImport("@firebase/app/dist/app/src/indexeddb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readHeartbeatsFromIndexedDB(app: FirebaseApp): js.Promise[js.UndefOr[HeartbeatsInIndexedDB]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readHeartbeatsFromIndexedDB")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[HeartbeatsInIndexedDB]]]
  
  inline def writeHeartbeatsToIndexedDB(app: FirebaseApp, heartbeatObject: HeartbeatsInIndexedDB): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeHeartbeatsToIndexedDB")(app.asInstanceOf[js.Any], heartbeatObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
