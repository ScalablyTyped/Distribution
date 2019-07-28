package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  def getId(): String
  def getType(): String
}

object Component {
  @scala.inline
  def apply(getId: () => String, getType: () => String): Component = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[Component]
  }
}

