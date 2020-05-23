package typings.egjsAxes.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.egjsAxes.constMod.DIRECTION
import typings.egjsAxes.panInputMod.PanInput
import typings.egjsAxes.panInputMod.PanInputOption
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPanInput
  extends Instantiable1[(/* el */ HTMLElement) | (/* el */ String), PanInput]
     with Instantiable2[(/* el */ HTMLElement) | (/* el */ String), /* options */ PanInputOption, PanInput] {
  def getDirectionByAngle(angle: Double, thresholdAngle: Double): DIRECTION = js.native
  def getNextOffset(speeds: js.Array[Double], deceleration: Double): js.Array[Double] = js.native
  def useDirection(checkType: DIRECTION, direction: DIRECTION): Boolean = js.native
  def useDirection(checkType: DIRECTION, direction: DIRECTION, userDirection: DIRECTION): Boolean = js.native
}

