package typings.expressDashStatusDashMonitor.expressDashStatusDashMonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetentionSpan extends js.Object {
  var interval: Double
  var retention: Double
}

object RetentionSpan {
  @scala.inline
  def apply(interval: Double, retention: Double): RetentionSpan = {
    val __obj = js.Dynamic.literal(interval = interval, retention = retention)
  
    __obj.asInstanceOf[RetentionSpan]
  }
}

