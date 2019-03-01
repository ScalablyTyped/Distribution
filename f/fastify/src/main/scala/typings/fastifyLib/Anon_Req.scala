package typings
package fastifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  var req: nodeLib.NodeJSNs.ReadableStream
  var res: nodeLib.httpMod.ServerResponse
}

object Anon_Req {
  @scala.inline
  def apply(req: nodeLib.NodeJSNs.ReadableStream, res: nodeLib.httpMod.ServerResponse): Anon_Req = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("req")(req)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Req]
  }
}

