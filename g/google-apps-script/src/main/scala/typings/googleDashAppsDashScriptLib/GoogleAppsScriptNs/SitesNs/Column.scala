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
    deleteColumn: () => scala.Unit,
    getName: () => java.lang.String,
    getParent: () => Page,
    setName: java.lang.String => Column
  ): Column = {
    val __obj = js.Dynamic.literal(deleteColumn = js.Any.fromFunction0(deleteColumn), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[Column]
  }
}

