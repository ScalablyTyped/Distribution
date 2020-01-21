package typings.elasticElasticsearch.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportSniffOptions extends js.Object {
  var reason: String
  var requestId: js.UndefOr[String] = js.undefined
}

object TransportSniffOptions {
  @scala.inline
  def apply(reason: String, requestId: String = null): TransportSniffOptions = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportSniffOptions]
  }
}

