package typings.dynogels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPollingInterval extends js.Object {
  var pollingInterval: Double
}

object AnonPollingInterval {
  @scala.inline
  def apply(pollingInterval: Double): AnonPollingInterval = {
    val __obj = js.Dynamic.literal(pollingInterval = pollingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPollingInterval]
  }
}

