package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRange extends js.Object {
  def getId(): java.lang.String
  def getName(): java.lang.String
  def getRange(): Range
  def remove(): scala.Unit
}

object NamedRange {
  @scala.inline
  def apply(
    getId: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getRange: js.Function0[Range],
    remove: js.Function0[scala.Unit]
  ): NamedRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getRange")(getRange)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[NamedRange]
  }
}

