package typings
package discordDashRpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoThreshold extends js.Object {
  var autoThreshold: scala.Boolean
  var delay: scala.Double
  var shortcut: js.Array[Anon_Code]
  var threshold: scala.Double
}

object Anon_AutoThreshold {
  @scala.inline
  def apply(
    autoThreshold: scala.Boolean,
    delay: scala.Double,
    shortcut: js.Array[Anon_Code],
    threshold: scala.Double
  ): Anon_AutoThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoThreshold")(autoThreshold)
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("shortcut")(shortcut)
    __obj.updateDynamic("threshold")(threshold)
    __obj.asInstanceOf[Anon_AutoThreshold]
  }
}

