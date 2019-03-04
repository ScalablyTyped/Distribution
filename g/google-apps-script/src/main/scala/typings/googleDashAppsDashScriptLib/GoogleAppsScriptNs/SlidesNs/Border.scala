package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  def getDashStyle(): DashStyle
  def getLineFill(): LineFill
  def getWeight(): stdLib.Number
  def isVisible(): scala.Boolean
  def setDashStyle(style: DashStyle): Border
  def setTransparent(): Border
  def setWeight(points: stdLib.Number): Border
}

object Border {
  @scala.inline
  def apply(
    getDashStyle: js.Function0[DashStyle],
    getLineFill: js.Function0[LineFill],
    getWeight: js.Function0[stdLib.Number],
    isVisible: js.Function0[scala.Boolean],
    setDashStyle: js.Function1[DashStyle, Border],
    setTransparent: js.Function0[Border],
    setWeight: js.Function1[stdLib.Number, Border]
  ): Border = {
    val __obj = js.Dynamic.literal(getDashStyle = getDashStyle, getLineFill = getLineFill, getWeight = getWeight, isVisible = isVisible, setDashStyle = setDashStyle, setTransparent = setTransparent, setWeight = setWeight)
  
    __obj.asInstanceOf[Border]
  }
}

