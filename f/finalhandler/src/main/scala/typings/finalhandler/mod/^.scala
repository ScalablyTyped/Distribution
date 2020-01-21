package typings.finalhandler.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("finalhandler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(req: IncomingMessage, res: ServerResponse): js.Function1[/* err */ js.Any, Unit] = js.native
  def apply(req: IncomingMessage, res: ServerResponse, options: Options): js.Function1[/* err */ js.Any, Unit] = js.native
}

