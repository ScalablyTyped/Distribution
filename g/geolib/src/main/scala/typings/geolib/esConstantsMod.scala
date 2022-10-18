package typings.geolib

import org.scalablytyped.runtime.StringDictionary
import typings.geolib.esTypesMod.AltitudeKeys
import typings.geolib.esTypesMod.LatitudeKeys
import typings.geolib.esTypesMod.LongitudeKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConstantsMod {
  
  @JSImport("geolib/es/constants", "MAXLAT")
  @js.native
  val MAXLAT: /* 90 */ Double = js.native
  
  @JSImport("geolib/es/constants", "MAXLON")
  @js.native
  val MAXLON: /* 180 */ Double = js.native
  
  @JSImport("geolib/es/constants", "MINLAT")
  @js.native
  val MINLAT: /* -90 */ Double = js.native
  
  @JSImport("geolib/es/constants", "MINLON")
  @js.native
  val MINLON: /* -180 */ Double = js.native
  
  @JSImport("geolib/es/constants", "altitudeKeys")
  @js.native
  val altitudeKeys: js.Array[AltitudeKeys] = js.native
  
  @JSImport("geolib/es/constants", "areaConversion")
  @js.native
  val areaConversion: unitObject = js.native
  
  @JSImport("geolib/es/constants", "distanceConversion")
  @js.native
  val distanceConversion: unitObject = js.native
  
  @JSImport("geolib/es/constants", "earthRadius")
  @js.native
  val earthRadius: /* 6378137 */ Double = js.native
  
  @JSImport("geolib/es/constants", "latitudeKeys")
  @js.native
  val latitudeKeys: js.Array[LatitudeKeys] = js.native
  
  @JSImport("geolib/es/constants", "longitudeKeys")
  @js.native
  val longitudeKeys: js.Array[LongitudeKeys] = js.native
  
  @JSImport("geolib/es/constants", "sexagesimalPattern")
  @js.native
  val sexagesimalPattern: js.RegExp = js.native
  
  @JSImport("geolib/es/constants", "timeConversion")
  @js.native
  val timeConversion: unitObject = js.native
  
  type unitObject = StringDictionary[Double]
}
