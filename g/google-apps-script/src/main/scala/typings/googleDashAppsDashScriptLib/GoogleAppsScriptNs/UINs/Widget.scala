package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widget extends js.Object {
  def getId(): java.lang.String
  def getType(): java.lang.String
}

object Widget {
  @scala.inline
  def apply(getId: () => java.lang.String, getType: () => java.lang.String): Widget = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[Widget]
  }
}

