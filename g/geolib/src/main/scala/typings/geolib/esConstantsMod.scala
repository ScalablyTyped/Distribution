package typings.geolib

import org.scalablytyped.runtime.StringDictionary
import typings.geolib.esTypesMod.AltitudeKeys
import typings.geolib.esTypesMod.LatitudeKeys
import typings.geolib.esTypesMod.LongitudeKeys
import typings.geolib.geolibNumbers.`-180`
import typings.geolib.geolibNumbers.`-90`
import typings.geolib.geolibNumbers.`180`
import typings.geolib.geolibNumbers.`6378137`
import typings.geolib.geolibNumbers.`90`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/constants", JSImport.Namespace)
@js.native
object esConstantsMod extends js.Object {
  val MAXLAT: `90` = js.native
  val MAXLON: `180` = js.native
  val MINLAT: `-90` = js.native
  val MINLON: `-180` = js.native
  val altitudeKeys: js.Array[AltitudeKeys] = js.native
  val areaConversion: unitObject = js.native
  val distanceConversion: unitObject = js.native
  val earthRadius: `6378137` = js.native
  val latitudeKeys: js.Array[LatitudeKeys] = js.native
  val longitudeKeys: js.Array[LongitudeKeys] = js.native
  val sexagesimalPattern: RegExp = js.native
  val timeConversion: unitObject = js.native
  type unitObject = StringDictionary[Double]
}

