package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardPanel extends js.Object {
  def add(widget: googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.Widget): DashboardPanel
  def getId(): java.lang.String
  def getType(): java.lang.String
  def setId(id: java.lang.String): DashboardPanel
}

object DashboardPanel {
  @scala.inline
  def apply(
    add: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.Widget, DashboardPanel],
    getId: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setId: js.Function1[java.lang.String, DashboardPanel]
  ): DashboardPanel = {
    val __obj = js.Dynamic.literal(add = add, getId = getId, getType = getType, setId = setId)
  
    __obj.asInstanceOf[DashboardPanel]
  }
}

