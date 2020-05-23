package typings.dynogels.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollingInterval extends js.Object {
  var pollingInterval: Double
}

object PollingInterval {
  @scala.inline
  def apply(pollingInterval: Double): PollingInterval = {
    val __obj = js.Dynamic.literal(pollingInterval = pollingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollingInterval]
  }
}

