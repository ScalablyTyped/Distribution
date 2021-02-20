package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backoffMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/backoff", "start")
  @js.native
  def start(
    f: js.Function2[/* p1 */ js.Function1[/* success */ Boolean, Unit], /* canceled */ Boolean, Unit],
    callback: js.Function1[/* repeated */ js.Any, _],
    timeout: Double
  ): id = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/backoff", "stop")
  @js.native
  def stop(id: id): Unit = js.native
  
  type id = js.Function1[/* p1 */ Boolean, Unit]
}
