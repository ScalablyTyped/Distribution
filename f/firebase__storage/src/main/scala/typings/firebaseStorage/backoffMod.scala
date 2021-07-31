package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backoffMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/backoff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def start(
    f: js.Function2[/* p1 */ js.Function1[/* success */ Boolean, Unit], /* canceled */ Boolean, Unit],
    callback: js.Function1[/* repeated */ js.Any, js.Any],
    timeout: Double
  ): id = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(f.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[id]
  
  @scala.inline
  def stop(id: id): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type id = js.Function1[/* p1 */ Boolean, Unit]
}
