package typings.geodesy.latlonDashEllipsoidalDashReferenceframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cartesian_ReferenceFrame
  extends typings.geodesy.latlonDashEllipsoidalMod.Cartesian {
  def convertReferenceFrame(toReferenceFrame: ReferenceFrame): Cartesian_ReferenceFrame = js.native
  def epoch(): Double = js.native
  def referenceFrame(): ReferenceFrame = js.native
  def toLatLon(): LatLonEllipsoidal_ReferenceFrame = js.native
}

