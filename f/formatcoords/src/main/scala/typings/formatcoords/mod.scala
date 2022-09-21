package typings.formatcoords

import typings.formatcoords.anon.FnCall
import typings.formatcoords.anon.Lat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(coords: String): CoordsObject = ^.asInstanceOf[js.Dynamic].apply(coords.asInstanceOf[js.Any]).asInstanceOf[CoordsObject]
  inline def apply(coords: Lat): CoordsObject = ^.asInstanceOf[js.Dynamic].apply(coords.asInstanceOf[js.Any]).asInstanceOf[CoordsObject]
  inline def apply(hasLatLon: js.Tuple2[Double, Double]): CoordsObject = ^.asInstanceOf[js.Dynamic].apply(hasLatLon.asInstanceOf[js.Any]).asInstanceOf[CoordsObject]
  inline def apply(hasLatLon: js.Tuple2[Double, Double], latlonSwapped: Boolean): CoordsObject = (^.asInstanceOf[js.Dynamic].apply(hasLatLon.asInstanceOf[js.Any], latlonSwapped.asInstanceOf[js.Any])).asInstanceOf[CoordsObject]
  inline def apply(lat: Double): CoordsObject = ^.asInstanceOf[js.Dynamic].apply(lat.asInstanceOf[js.Any]).asInstanceOf[CoordsObject]
  inline def apply(lat: Double, lon: Double): CoordsObject = (^.asInstanceOf[js.Dynamic].apply(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[CoordsObject]
  inline def apply(lat: Double, lon: Double, latlonSwapped: Boolean): CoordsObject = (^.asInstanceOf[js.Dynamic].apply(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], latlonSwapped.asInstanceOf[js.Any])).asInstanceOf[CoordsObject]
  inline def apply(lat: Double, lon: Unit, latlonSwapped: Boolean): CoordsObject = (^.asInstanceOf[js.Dynamic].apply(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], latlonSwapped.asInstanceOf[js.Any])).asInstanceOf[CoordsObject]
  
  @JSImport("formatcoords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CoordsFormatOptions extends StObject {
    
    var decimalPlaces: js.UndefOr[Double] = js.undefined
    
    var latLonSeparator: js.UndefOr[String] = js.undefined
  }
  object CoordsFormatOptions {
    
    inline def apply(): CoordsFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoordsFormatOptions]
    }
    
    extension [Self <: CoordsFormatOptions](x: Self) {
      
      inline def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
      
      inline def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
      
      inline def setLatLonSeparator(value: String): Self = StObject.set(x, "latLonSeparator", value.asInstanceOf[js.Any])
      
      inline def setLatLonSeparatorUndefined: Self = StObject.set(x, "latLonSeparator", js.undefined)
    }
  }
  
  trait CoordsObject extends StObject {
    
    var east: Boolean
    
    def format(): String
    def format(formatString: String): String
    def format(formatString: String, latLonSeparator: String): String
    def format(formatString: String, options: CoordsFormatOptions): String
    def format(formatString: Unit, options: CoordsFormatOptions): String
    def format(options: CoordsFormatOptions): String
    @JSName("format")
    var format_Original: FnCall
    
    var latValues: LonLatValues
    
    var lonValues: LonLatValues
    
    var north: Boolean
  }
  object CoordsObject {
    
    inline def apply(east: Boolean, format: FnCall, latValues: LonLatValues, lonValues: LonLatValues, north: Boolean): CoordsObject = {
      val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], latValues = latValues.asInstanceOf[js.Any], lonValues = lonValues.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordsObject]
    }
    
    extension [Self <: CoordsObject](x: Self) {
      
      inline def setEast(value: Boolean): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: FnCall): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setLatValues(value: LonLatValues): Self = StObject.set(x, "latValues", value.asInstanceOf[js.Any])
      
      inline def setLonValues(value: LonLatValues): Self = StObject.set(x, "lonValues", value.asInstanceOf[js.Any])
      
      inline def setNorth(value: Boolean): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
    }
  }
  
  trait LonLatValues extends StObject {
    
    var degrees: Double
    
    var degreesFrac: Double
    
    var degreesInt: Double
    
    var initValue: Double
    
    var minutes: Double
    
    var minutesInt: Double
    
    var seconds: Double
    
    var secondsTotal: Double
  }
  object LonLatValues {
    
    inline def apply(
      degrees: Double,
      degreesFrac: Double,
      degreesInt: Double,
      initValue: Double,
      minutes: Double,
      minutesInt: Double,
      seconds: Double,
      secondsTotal: Double
    ): LonLatValues = {
      val __obj = js.Dynamic.literal(degrees = degrees.asInstanceOf[js.Any], degreesFrac = degreesFrac.asInstanceOf[js.Any], degreesInt = degreesInt.asInstanceOf[js.Any], initValue = initValue.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], minutesInt = minutesInt.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], secondsTotal = secondsTotal.asInstanceOf[js.Any])
      __obj.asInstanceOf[LonLatValues]
    }
    
    extension [Self <: LonLatValues](x: Self) {
      
      inline def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
      
      inline def setDegreesFrac(value: Double): Self = StObject.set(x, "degreesFrac", value.asInstanceOf[js.Any])
      
      inline def setDegreesInt(value: Double): Self = StObject.set(x, "degreesInt", value.asInstanceOf[js.Any])
      
      inline def setInitValue(value: Double): Self = StObject.set(x, "initValue", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesInt(value: Double): Self = StObject.set(x, "minutesInt", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsTotal(value: Double): Self = StObject.set(x, "secondsTotal", value.asInstanceOf[js.Any])
    }
  }
}
