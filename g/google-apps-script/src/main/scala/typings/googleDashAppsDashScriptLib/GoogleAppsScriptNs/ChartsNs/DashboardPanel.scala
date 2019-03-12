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
    add: googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.Widget => DashboardPanel,
    getId: () => java.lang.String,
    getType: () => java.lang.String,
    setId: java.lang.String => DashboardPanel
  ): DashboardPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getId = js.Any.fromFunction0(getId), getType = js.Any.fromFunction0(getType), setId = js.Any.fromFunction1(setId))
  
    __obj.asInstanceOf[DashboardPanel]
  }
}

