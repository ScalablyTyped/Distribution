package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcPlatformNodeLiteRandomBytesMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/platform/node_lite/random_bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def randomBytes(nBytes: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(nBytes.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
