package typings.gm.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStatistics extends js.Object {
  var Maximum: String
  var Mean: String
  var Minimum: String
  var `Standard Deviation`: String
}

object ColorStatistics {
  @scala.inline
  def apply(Maximum: String, Mean: String, Minimum: String, `Standard Deviation`: String): ColorStatistics = {
    val __obj = js.Dynamic.literal(Maximum = Maximum, Mean = Mean, Minimum = Minimum)
    __obj.updateDynamic("Standard Deviation")(`Standard Deviation`)
    __obj.asInstanceOf[ColorStatistics]
  }
}

