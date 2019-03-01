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
  def apply(getId: js.Function0[java.lang.String], getType: js.Function0[java.lang.String]): Widget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getType")(getType)
    __obj.asInstanceOf[Widget]
  }
}

