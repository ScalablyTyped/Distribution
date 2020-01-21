package typings.geodesy.latlonEllipsoidalReferenceframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/latlon-ellipsoidal-referenceframe", "Cartesian")
@js.native
class Cartesian protected () extends CartesianReferenceFrame {
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, referenceFrame: ReferenceFrame) = this()
  def this(x: Double, y: Double, z: Double, referenceFrame: ReferenceFrame, epoch: Double) = this()
}

