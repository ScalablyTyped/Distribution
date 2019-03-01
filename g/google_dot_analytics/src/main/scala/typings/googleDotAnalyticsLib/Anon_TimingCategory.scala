package typings
package googleDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimingCategory extends js.Object {
  var timingCategory: java.lang.String
  var timingValue: scala.Double
  var timingVar: java.lang.String
}

object Anon_TimingCategory {
  @scala.inline
  def apply(timingCategory: java.lang.String, timingValue: scala.Double, timingVar: java.lang.String): Anon_TimingCategory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("timingCategory")(timingCategory)
    __obj.updateDynamic("timingValue")(timingValue)
    __obj.updateDynamic("timingVar")(timingVar)
    __obj.asInstanceOf[Anon_TimingCategory]
  }
}

