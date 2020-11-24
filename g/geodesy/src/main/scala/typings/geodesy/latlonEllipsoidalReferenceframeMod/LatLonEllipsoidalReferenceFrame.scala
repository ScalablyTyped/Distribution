package typings.geodesy.latlonEllipsoidalReferenceframeMod

import typings.geodesy.mod.Dp
import typings.geodesy.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LatLonEllipsoidalReferenceFrame
  extends typings.geodesy.latlonEllipsoidalMod.default {
  
  def convertReferenceFrame(toReferenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = js.native
  
  def epoch: Double = js.native
  
  def referenceFrame: ReferenceFrame = js.native
  
  def toString(format: Format): String = js.native
  def toString(
    format: Format,
    dp: js.UndefOr[scala.Nothing],
    dpHeight: js.UndefOr[scala.Nothing],
    referenceFrame: ReferenceFrame
  ): String = js.native
  def toString(format: Format, dp: js.UndefOr[scala.Nothing], dpHeight: Double): String = js.native
  def toString(format: Format, dp: js.UndefOr[scala.Nothing], dpHeight: Double, referenceFrame: ReferenceFrame): String = js.native
  def toString(format: Format, dp: Dp): String = js.native
  def toString(format: Format, dp: Dp, dpHeight: js.UndefOr[scala.Nothing], referenceFrame: ReferenceFrame): String = js.native
  def toString(format: Format, dp: Dp, dpHeight: Double): String = js.native
  def toString(format: Format, dp: Dp, dpHeight: Double, referenceFrame: ReferenceFrame): String = js.native
}
