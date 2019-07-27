package typings
package atElasticElasticsearchLib.libTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportSniffOptions extends js.Object {
  var reason: java.lang.String
  var requestId: js.UndefOr[java.lang.String] = js.undefined
}

object TransportSniffOptions {
  @scala.inline
  def apply(reason: java.lang.String, requestId: java.lang.String = null): TransportSniffOptions = {
    val __obj = js.Dynamic.literal(reason = reason)
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[TransportSniffOptions]
  }
}

