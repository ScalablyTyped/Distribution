package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcUtilNodeApiMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/util/node_api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nodePromise[R](action: js.Function1[/* callback */ NodeCallback[R], Unit]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodePromise")(action.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  
  type NodeCallback[R] = js.Function2[/* error */ js.UndefOr[Any], /* value */ js.UndefOr[R], Unit]
}
