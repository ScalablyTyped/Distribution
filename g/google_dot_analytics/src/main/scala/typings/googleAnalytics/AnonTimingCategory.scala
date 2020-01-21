package typings.googleAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimingCategory extends js.Object {
  var timingCategory: String
  var timingValue: Double
  var timingVar: String
}

object AnonTimingCategory {
  @scala.inline
  def apply(timingCategory: String, timingValue: Double, timingVar: String): AnonTimingCategory = {
    val __obj = js.Dynamic.literal(timingCategory = timingCategory.asInstanceOf[js.Any], timingValue = timingValue.asInstanceOf[js.Any], timingVar = timingVar.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTimingCategory]
  }
}

