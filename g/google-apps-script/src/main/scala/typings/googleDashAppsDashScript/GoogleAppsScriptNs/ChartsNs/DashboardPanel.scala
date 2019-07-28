package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardPanel extends js.Object {
  def add(widget: Widget): DashboardPanel
  def getId(): String
  def getType(): String
  def setId(id: String): DashboardPanel
}

object DashboardPanel {
  @scala.inline
  def apply(
    add: Widget => DashboardPanel,
    getId: () => String,
    getType: () => String,
    setId: String => DashboardPanel
  ): DashboardPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getId = js.Any.fromFunction0(getId), getType = js.Any.fromFunction0(getType), setId = js.Any.fromFunction1(setId))
  
    __obj.asInstanceOf[DashboardPanel]
  }
}

