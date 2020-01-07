package typings.googleapis.buildSrcApisTpuV1Mod.tpu_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A network endpoint over which a TPU worker can be reached.
  */
@js.native
trait Schema$NetworkEndpoint extends js.Object {
  /**
    * The IP address of this network endpoint.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The port of this network endpoint.
    */
  var port: js.UndefOr[Double] = js.native
}

object Schema$NetworkEndpoint {
  @scala.inline
  def apply(ipAddress: String = null, port: Int | Double = null): Schema$NetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkEndpoint]
  }
}

