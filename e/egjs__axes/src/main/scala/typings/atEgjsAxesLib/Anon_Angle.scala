package typings
package atEgjsAxesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Angle
  extends org.scalablytyped.runtime.Instantiable2[
      (/* el */ stdLib.HTMLElement) | (/* el */ java.lang.String), 
      /* options */ atEgjsAxesLib.inputTypePanInputMod.PanInputOption, 
      atEgjsAxesLib.inputTypePanInputMod.PanInput
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* el */ stdLib.HTMLElement) | (/* el */ java.lang.String), 
      atEgjsAxesLib.inputTypePanInputMod.PanInput
    ] {
  def getDirectionByAngle(angle: scala.Double, thresholdAngle: scala.Double): atEgjsAxesLib.constMod.DIRECTION = js.native
  def getNextOffset(speeds: js.Array[scala.Double], deceleration: scala.Double): js.Array[scala.Double] = js.native
  def useDirection(checkType: atEgjsAxesLib.constMod.DIRECTION, direction: atEgjsAxesLib.constMod.DIRECTION): scala.Boolean = js.native
  def useDirection(
    checkType: atEgjsAxesLib.constMod.DIRECTION,
    direction: atEgjsAxesLib.constMod.DIRECTION,
    userDirection: atEgjsAxesLib.constMod.DIRECTION
  ): scala.Boolean = js.native
}

