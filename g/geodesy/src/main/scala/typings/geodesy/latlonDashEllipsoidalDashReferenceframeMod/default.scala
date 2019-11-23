package typings.geodesy.latlonDashEllipsoidalDashReferenceframeMod

import typings.geodesy.geodesyMod.Ellipsoids
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/latlon-ellipsoidal-referenceframe", "default")
@js.native
class default protected () extends LatLonEllipsoidal_ReferenceFrame {
  def this(lat: Double, lon: Double) = this()
  def this(lat: Double, lon: Double, height: Double) = this()
  def this(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame) = this()
  def this(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double) = this()
}

/* static members */
@JSImport("geodesy/latlon-ellipsoidal-referenceframe", "default")
@js.native
object default extends js.Object {
  def ellipsoids(): Ellipsoids = js.native
  def parse(lat: String): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: String, lon: Double): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: String, lon: Double, height: Double): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: String, lon: Double, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: String, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: js.Object): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: js.Object, lon: Double): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: js.Object, lon: Double, height: Double): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: js.Object, lon: Double, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: js.Object, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: Double): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: Double, lon: Double): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: Double, lon: Double, height: Double): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidal_ReferenceFrame = js.native
  def parse(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidal_ReferenceFrame = js.native
  def referenceFrames(): ReferenceFrames = js.native
  def transformParameters(): TxParams = js.native
}

