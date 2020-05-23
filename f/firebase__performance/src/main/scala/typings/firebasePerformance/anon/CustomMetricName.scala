package typings.firebasePerformance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetricName extends js.Object {
  var customMetricName: String
}

object CustomMetricName {
  @scala.inline
  def apply(customMetricName: String): CustomMetricName = {
    val __obj = js.Dynamic.literal(customMetricName = customMetricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMetricName]
  }
}

