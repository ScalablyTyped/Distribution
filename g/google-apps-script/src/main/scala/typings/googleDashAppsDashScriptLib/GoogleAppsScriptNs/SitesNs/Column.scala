package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  def deleteColumn(): scala.Unit
  def getName(): java.lang.String
  def getParent(): Page
  def setName(name: java.lang.String): Column
}

object Column {
  @scala.inline
  def apply(
    deleteColumn: js.Function0[scala.Unit],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[Page],
    setName: js.Function1[java.lang.String, Column]
  ): Column = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteColumn")(deleteColumn)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("setName")(setName)
    __obj.asInstanceOf[Column]
  }
}

