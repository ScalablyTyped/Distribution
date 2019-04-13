package typings
package gmLib.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStatistics extends js.Object {
  var Maximum: java.lang.String
  var Mean: java.lang.String
  var Minimum: java.lang.String
  var `Standard Deviation`: java.lang.String
}

object ColorStatistics {
  @scala.inline
  def apply(
    Maximum: java.lang.String,
    Mean: java.lang.String,
    Minimum: java.lang.String,
    `Standard Deviation`: java.lang.String
  ): ColorStatistics = {
    val __obj = js.Dynamic.literal(Maximum = Maximum, Mean = Mean, Minimum = Minimum)
    __obj.updateDynamic("Standard Deviation")(`Standard Deviation`)
    __obj.asInstanceOf[ColorStatistics]
  }
}

