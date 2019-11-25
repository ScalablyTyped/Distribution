package typings.googleDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimingCategory extends js.Object {
  var timingCategory: String
  var timingValue: Double
  var timingVar: String
}

object Anon_TimingCategory {
  @scala.inline
  def apply(timingCategory: String, timingValue: Double, timingVar: String): Anon_TimingCategory = {
    val __obj = js.Dynamic.literal(timingCategory = timingCategory.asInstanceOf[js.Any], timingValue = timingValue.asInstanceOf[js.Any], timingVar = timingVar.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TimingCategory]
  }
}

