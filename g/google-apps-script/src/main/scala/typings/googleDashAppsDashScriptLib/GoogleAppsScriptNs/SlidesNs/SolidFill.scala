package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolidFill extends js.Object {
  def getAlpha(): stdLib.Number
  def getColor(): Color
}

object SolidFill {
  @scala.inline
  def apply(getAlpha: js.Function0[stdLib.Number], getColor: js.Function0[Color]): SolidFill = {
    val __obj = js.Dynamic.literal(getAlpha = getAlpha, getColor = getColor)
  
    __obj.asInstanceOf[SolidFill]
  }
}

