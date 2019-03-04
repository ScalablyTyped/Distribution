package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  def getId(): java.lang.String
  def getType(): java.lang.String
}

object Component {
  @scala.inline
  def apply(getId: js.Function0[java.lang.String], getType: js.Function0[java.lang.String]): Component = {
    val __obj = js.Dynamic.literal(getId = getId, getType = getType)
  
    __obj.asInstanceOf[Component]
  }
}

