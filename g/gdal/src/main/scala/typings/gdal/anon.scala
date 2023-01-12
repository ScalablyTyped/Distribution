package typings.gdal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GeoTransform extends StObject {
    
    var geoTransform: Any
    
    var rasterSize: Any
  }
  object GeoTransform {
    
    inline def apply(geoTransform: Any, rasterSize: Any): GeoTransform = {
      val __obj = js.Dynamic.literal(geoTransform = geoTransform.asInstanceOf[js.Any], rasterSize = rasterSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoTransform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoTransform] (val x: Self) extends AnyVal {
      
      inline def setGeoTransform(value: Any): Self = StObject.set(x, "geoTransform", value.asInstanceOf[js.Any])
      
      inline def setRasterSize(value: Any): Self = StObject.set(x, "rasterSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unit extends StObject {
    
    var unit: Any
    
    var value: Any
  }
  object Unit {
    
    inline def apply(unit: Any, value: Any): Unit = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      inline def setUnit(value: Any): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
