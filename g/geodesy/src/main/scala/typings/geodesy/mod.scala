package typings.geodesy

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Datum extends StObject {
    
    var ellipsoid: Ellipsoid
    
    var transform: Transform
  }
  object Datum {
    
    inline def apply(ellipsoid: Ellipsoid, transform: Transform): Datum = {
      val __obj = js.Dynamic.literal(ellipsoid = ellipsoid.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datum]
    }
    
    extension [Self <: Datum](x: Self) {
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  type Datums = Plural[Datum]
  
  type Dp = Double
  
  trait Ellipsoid extends StObject {
    
    var a: Double
    
    var b: Double
    
    var f: Double
  }
  object Ellipsoid {
    
    inline def apply(a: Double, b: Double, f: Double): Ellipsoid = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ellipsoid]
    }
    
    extension [Self <: Ellipsoid](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    }
  }
  
  type Ellipsoids = Plural[Ellipsoid]
  
  /* Rewritten from type alias, can be one of: 
    - typings.geodesy.geodesyStrings.d
    - typings.geodesy.geodesyStrings.dm
    - typings.geodesy.geodesyStrings.dms
  */
  trait Format extends StObject
  object Format {
    
    inline def d: typings.geodesy.geodesyStrings.d = "d".asInstanceOf[typings.geodesy.geodesyStrings.d]
    
    inline def dm: typings.geodesy.geodesyStrings.dm = "dm".asInstanceOf[typings.geodesy.geodesyStrings.dm]
    
    inline def dms: typings.geodesy.geodesyStrings.dms = "dms".asInstanceOf[typings.geodesy.geodesyStrings.dms]
  }
  
  trait GeoJSON extends StObject {
    
    var coordinates: js.Tuple2[Double, Double]
    
    var `type`: String
  }
  object GeoJSON {
    
    inline def apply(coordinates: js.Tuple2[Double, Double], `type`: String): GeoJSON = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJSON]
    }
    
    extension [Self <: GeoJSON](x: Self) {
      
      inline def setCoordinates(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Plural[T] = StringDictionary[T]
  
  type Polygon[T] = js.Array[T]
  
  type Transform = js.Tuple7[Double, Double, Double, Double, Double, Double, Double]
}
