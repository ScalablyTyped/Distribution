package typings
package googleDashTranslateDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoCorrected extends js.Object {
  var autoCorrected: scala.Boolean
  var didYouMean: scala.Boolean
  var value: java.lang.String
}

object Anon_AutoCorrected {
  @scala.inline
  def apply(autoCorrected: scala.Boolean, didYouMean: scala.Boolean, value: java.lang.String): Anon_AutoCorrected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoCorrected")(autoCorrected)
    __obj.updateDynamic("didYouMean")(didYouMean)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_AutoCorrected]
  }
}

