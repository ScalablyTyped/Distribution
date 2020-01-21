package typings.gm.mod

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
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Mean = Mean.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any])
    __obj.updateDynamic("Standard Deviation")(`Standard Deviation`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStatistics]
  }
}

