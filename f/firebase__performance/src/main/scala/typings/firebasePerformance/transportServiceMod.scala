package typings.firebasePerformance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/performance/dist/src/services/transport_service", JSImport.Namespace)
@js.native
object transportServiceMod extends js.Object {
  def resetTransportService(): Unit = js.native
  def setupTransportService(): Unit = js.native
  def transportHandler(serializer: js.Function1[/* repeated */ js.Any, String]): js.Function1[/* repeated */ js.Any, Unit] = js.native
}

