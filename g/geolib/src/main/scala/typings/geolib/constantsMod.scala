package typings.geolib

import org.scalablytyped.runtime.StringDictionary
import typings.geolib.typesMod.AltitudeKeys
import typings.geolib.typesMod.LatitudeKeys
import typings.geolib.typesMod.LongitudeKeys
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geolib/es/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  val MAXLAT: /* 90 */ Double = js.native
  
  val MAXLON: /* 180 */ Double = js.native
  
  val MINLAT: /* -90 */ Double = js.native
  
  val MINLON: /* -180 */ Double = js.native
  
  val altitudeKeys: js.Array[AltitudeKeys] = js.native
  
  val areaConversion: unitObject = js.native
  
  val distanceConversion: unitObject = js.native
  
  val earthRadius: /* 6378137 */ Double = js.native
  
  val latitudeKeys: js.Array[LatitudeKeys] = js.native
  
  val longitudeKeys: js.Array[LongitudeKeys] = js.native
  
  val sexagesimalPattern: RegExp = js.native
  
  val timeConversion: unitObject = js.native
  
  type unitObject = StringDictionary[Double]
}
