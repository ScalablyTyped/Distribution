package typings.expressStatusMonitor.mod

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
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], retention = retention.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetentionSpan]
  }
}

