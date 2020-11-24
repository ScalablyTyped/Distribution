package typings.geodesy.latlonEllipsoidalReferenceframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CartesianReferenceFrame
  extends typings.geodesy.latlonEllipsoidalMod.Cartesian {
  
  def convertReferenceFrame(toReferenceFrame: ReferenceFrame): CartesianReferenceFrame = js.native
  
  def epoch: Double = js.native
  
  def referenceFrame: ReferenceFrame = js.native
  
  def toLatLon(): LatLonEllipsoidalReferenceFrame = js.native
}
