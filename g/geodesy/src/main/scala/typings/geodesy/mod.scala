package typings.geodesy

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Datum extends StObject {
    
    var ellipsoid: Ellipsoid = js.native
    
    var transform: Transform = js.native
  }
  object Datum {
    
    @scala.inline
    def apply(ellipsoid: Ellipsoid, transform: Transform): Datum = {
      val __obj = js.Dynamic.literal(ellipsoid = ellipsoid.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datum]
    }
    
    @scala.inline
    implicit class DatumMutableBuilder[Self <: Datum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  type Datums = Plural[Datum]
  
  type Dp = Double
  
  @js.native
  trait Ellipsoid extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var f: Double = js.native
  }
  object Ellipsoid {
    
    @scala.inline
    def apply(a: Double, b: Double, f: Double): Ellipsoid = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ellipsoid]
    }
    
    @scala.inline
    implicit class EllipsoidMutableBuilder[Self <: Ellipsoid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def d: typings.geodesy.geodesyStrings.d = "d".asInstanceOf[typings.geodesy.geodesyStrings.d]
    
    @scala.inline
    def dm: typings.geodesy.geodesyStrings.dm = "dm".asInstanceOf[typings.geodesy.geodesyStrings.dm]
    
    @scala.inline
    def dms: typings.geodesy.geodesyStrings.dms = "dms".asInstanceOf[typings.geodesy.geodesyStrings.dms]
  }
  
  @js.native
  trait GeoJSON extends StObject {
    
    var coordinates: js.Tuple2[Double, Double] = js.native
    
    var `type`: String = js.native
  }
  object GeoJSON {
    
    @scala.inline
    def apply(coordinates: js.Tuple2[Double, Double], `type`: String): GeoJSON = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJSON]
    }
    
    @scala.inline
    implicit class GeoJSONMutableBuilder[Self <: GeoJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Plural[T] = StringDictionary[T]
  
  type Polygon[T] = js.Array[T]
  
  type Transform = js.Tuple7[Double, Double, Double, Double, Double, Double, Double]
}
