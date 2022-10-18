package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcImplementationBackoffMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/backoff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def start(
    doRequest: js.Function2[
      /* onRequestComplete */ js.Function1[/* success */ Boolean, Unit], 
      /* canceled */ Boolean, 
      Unit
    ],
    backoffCompleteCb: js.Function1[/* repeated */ Any, Any],
    timeout: Double
  ): id = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(doRequest.asInstanceOf[js.Any], backoffCompleteCb.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[id]
  
  inline def stop(id: id): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type id = js.Function1[/* p1 */ Boolean, Unit]
}
