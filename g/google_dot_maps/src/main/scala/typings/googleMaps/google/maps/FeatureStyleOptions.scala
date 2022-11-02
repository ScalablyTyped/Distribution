package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * These options specify the way the style of a <code>Feature</code> should be
  * modified on a map.
  */
trait FeatureStyleOptions extends StObject {
  
  /**
    * Hex RGB string (like &quot;#00FF00&quot; for green). Only applies to
    * polygon geometries.
    */
  var fillColor: js.UndefOr[String] = js.undefined
  
  /**
    * The fill opacity between 0.0 and 1.0. Only applies to polygon geometries.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Hex RGB string (like &quot;#00FF00&quot; for green).
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  
  /**
    * The stroke opacity between 0.0 and 1.0. Only applies to line and polygon
    * geometries.
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The stroke width in pixels. Only applies to line and polygon geometries.
    */
  var strokeWeight: js.UndefOr[Double] = js.undefined
}
object FeatureStyleOptions {
  
  inline def apply(): FeatureStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureStyleOptions]
  }
  
  extension [Self <: FeatureStyleOptions](x: Self) {
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
  }
}
