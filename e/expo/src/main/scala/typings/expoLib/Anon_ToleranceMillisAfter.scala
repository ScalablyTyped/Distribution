package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToleranceMillisAfter extends js.Object {
  var toleranceMillisAfter: scala.Double
  var toleranceMillisBefore: scala.Double
}

object Anon_ToleranceMillisAfter {
  @scala.inline
  def apply(toleranceMillisAfter: scala.Double, toleranceMillisBefore: scala.Double): Anon_ToleranceMillisAfter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toleranceMillisAfter")(toleranceMillisAfter)
    __obj.updateDynamic("toleranceMillisBefore")(toleranceMillisBefore)
    __obj.asInstanceOf[Anon_ToleranceMillisAfter]
  }
}

