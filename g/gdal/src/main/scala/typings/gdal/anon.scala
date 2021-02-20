package typings.gdal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GeoTransform extends StObject {
    
    var geoTransform: js.Any = js.native
    
    var rasterSize: js.Any = js.native
  }
  object GeoTransform {
    
    @scala.inline
    def apply(geoTransform: js.Any, rasterSize: js.Any): GeoTransform = {
      val __obj = js.Dynamic.literal(geoTransform = geoTransform.asInstanceOf[js.Any], rasterSize = rasterSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoTransform]
    }
    
    @scala.inline
    implicit class GeoTransformMutableBuilder[Self <: GeoTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeoTransform(value: js.Any): Self = StObject.set(x, "geoTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRasterSize(value: js.Any): Self = StObject.set(x, "rasterSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Unit extends StObject {
    
    var unit: js.Any = js.native
    
    var value: js.Any = js.native
  }
  object Unit {
    
    @scala.inline
    def apply(unit: js.Any, value: js.Any): Unit = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit class UnitMutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnit(value: js.Any): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
