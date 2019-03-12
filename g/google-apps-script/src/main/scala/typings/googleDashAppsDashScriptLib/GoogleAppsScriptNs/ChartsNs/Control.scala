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
  def apply(getId: () => java.lang.String, getType: () => java.lang.String, setId: java.lang.String => Control): Control = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getType = js.Any.fromFunction0(getType), setId = js.Any.fromFunction1(setId))
  
    __obj.asInstanceOf[Control]
  }
}

