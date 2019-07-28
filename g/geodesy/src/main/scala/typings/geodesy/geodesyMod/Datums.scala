package typings.geodesy.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datums extends js.Object {
  var ED50: Datum
  var Irl1975: Datum
  var NAD27: Datum
  var NAD83: Datum
  var NTF: Datum
  var OSGB36: Datum
  var Potsdam: Datum
  var TokyoJapan: Datum
  var WGS72: Datum
  var WGS84: Datum
}

object Datums {
  @scala.inline
  def apply(
    ED50: Datum,
    Irl1975: Datum,
    NAD27: Datum,
    NAD83: Datum,
    NTF: Datum,
    OSGB36: Datum,
    Potsdam: Datum,
    TokyoJapan: Datum,
    WGS72: Datum,
    WGS84: Datum
  ): Datums = {
    val __obj = js.Dynamic.literal(ED50 = ED50, Irl1975 = Irl1975, NAD27 = NAD27, NAD83 = NAD83, NTF = NTF, OSGB36 = OSGB36, Potsdam = Potsdam, TokyoJapan = TokyoJapan, WGS72 = WGS72, WGS84 = WGS84)
  
    __obj.asInstanceOf[Datums]
  }
}

