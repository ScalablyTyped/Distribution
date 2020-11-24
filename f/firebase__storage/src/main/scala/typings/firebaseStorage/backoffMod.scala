package typings.firebaseStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/backoff", JSImport.Namespace)
@js.native
object backoffMod extends js.Object {
  
  def start(
    f: js.Function2[/* p1 */ js.Function1[/* success */ Boolean, Unit], /* canceled */ Boolean, Unit],
    callback: js.Function1[/* repeated */ js.Any, _],
    timeout: Double
  ): id = js.native
  
  def stop(id: id): Unit = js.native
  
  type id = js.Function1[/* p1 */ Boolean, Unit]
}
