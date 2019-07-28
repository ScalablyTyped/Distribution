package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widget extends js.Object {
  def getId(): String
  def getType(): String
}

object Widget {
  @scala.inline
  def apply(getId: () => String, getType: () => String): Widget = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[Widget]
  }
}

