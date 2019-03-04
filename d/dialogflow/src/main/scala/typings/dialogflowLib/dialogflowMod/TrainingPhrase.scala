package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingPhrase extends js.Object {
  var name: java.lang.String
  var parts: js.Array[Part]
  var timesAddedCount: js.UndefOr[scala.Double] = js.undefined
  var `type`: java.lang.String
}

object TrainingPhrase {
  @scala.inline
  def apply(
    name: java.lang.String,
    parts: js.Array[Part],
    `type`: java.lang.String,
    timesAddedCount: scala.Int | scala.Double = null
  ): TrainingPhrase = {
    val __obj = js.Dynamic.literal(name = name, parts = parts)
    __obj.updateDynamic("type")(`type`)
    if (timesAddedCount != null) __obj.updateDynamic("timesAddedCount")(timesAddedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingPhrase]
  }
}

