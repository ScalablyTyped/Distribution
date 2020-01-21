package typings.geodesy.utmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLonUtm
  extends typings.geodesy.latlonEllipsoidalDatumMod.default {
  def toUtm(): Utm = js.native
  def toUtm(zoneOverride: Double): Utm = js.native
}

