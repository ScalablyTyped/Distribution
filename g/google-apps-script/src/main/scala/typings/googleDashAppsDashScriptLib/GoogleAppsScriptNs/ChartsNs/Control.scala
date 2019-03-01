package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Control extends js.Object {
  def getId(): java.lang.String
  def getType(): java.lang.String
  def setId(id: java.lang.String): Control
}

object Control {
  @scala.inline
  def apply(
    getId: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setId: js.Function1[java.lang.String, Control]
  ): Control = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setId")(setId)
    __obj.asInstanceOf[Control]
  }
}

