package typings.geodesy.utmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLon_Utm
  extends typings.geodesy.latlonDashEllipsoidalDashDatumMod.default {
  def toUtm(): Utm = js.native
  def toUtm(zoneOverride: Double): Utm = js.native
}

