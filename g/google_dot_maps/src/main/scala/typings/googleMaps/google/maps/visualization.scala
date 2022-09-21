package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualization {
  
  /**
    * A layer that provides a client-side rendered heatmap, depicting the
    * intensity of data at geographical points.
    */
  @js.native
  trait HeatmapLayer
    extends StObject
       with MVCObject {
    
    /**
      * Returns the data points currently displayed by this heatmap.
      */
    def getData(): MVCArray[LatLng | WeightedLocation] = js.native
    
    def getMap(): js.UndefOr[Map] = js.native
    
    def setData(data: js.Array[LatLng | WeightedLocation]): Unit = js.native
    /**
      * Sets the data points to be displayed by this heatmap.
      */
    def setData(data: MVCArray[LatLng | WeightedLocation]): Unit = js.native
    
    /**
      * Renders the heatmap on the specified map. If map is set to
      * <code>null</code>, the heatmap will be removed.
      */
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    def setOptions(): Unit = js.native
    def setOptions(options: HeatmapLayerOptions): Unit = js.native
  }
  
  /**
    * This object defines the properties that can be set on a
    * <code>HeatmapLayer</code> object.
    */
  trait HeatmapLayerOptions extends StObject {
    
    /**
      * The data points to display. Required.
      */
    var data: js.UndefOr[
        (MVCArray[LatLng | WeightedLocation]) | Null | (js.Array[LatLng | WeightedLocation])
      ] = js.undefined
    
    /**
      * Specifies whether heatmaps dissipate on zoom. By default, the radius of
      * influence of a data point is specified by the radius option only. When
      * dissipating is disabled, the radius option is interpreted as a radius at
      * zoom level 0.
      */
    var dissipating: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * The color gradient of the heatmap, specified as an array of CSS color
      * strings. All CSS3 colors are supported except for extended named colors.
      */
    var gradient: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * The map on which to display the layer.
      */
    var map: js.UndefOr[Map | Null] = js.undefined
    
    /**
      * The maximum intensity of the heatmap. By default, heatmap colors are
      * dynamically scaled according to the greatest concentration of points at
      * any particular pixel on the map. This property allows you to specify a
      * fixed maximum.
      */
    var maxIntensity: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The opacity of the heatmap, expressed as a number between 0 and 1.
      * @defaultValue <code>0.6</code>
      */
    var opacity: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The radius of influence for each data point, in pixels.
      */
    var radius: js.UndefOr[Double | Null] = js.undefined
  }
  object HeatmapLayerOptions {
    
    inline def apply(): HeatmapLayerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeatmapLayerOptions]
    }
    
    extension [Self <: HeatmapLayerOptions](x: Self) {
      
      inline def setData(value: (MVCArray[LatLng | WeightedLocation]) | (js.Array[LatLng | WeightedLocation])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: (LatLng | WeightedLocation)*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDissipating(value: Boolean): Self = StObject.set(x, "dissipating", value.asInstanceOf[js.Any])
      
      inline def setDissipatingNull: Self = StObject.set(x, "dissipating", null)
      
      inline def setDissipatingUndefined: Self = StObject.set(x, "dissipating", js.undefined)
      
      inline def setGradient(value: js.Array[String]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setGradientNull: Self = StObject.set(x, "gradient", null)
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setGradientVarargs(value: String*): Self = StObject.set(x, "gradient", js.Array(value*))
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMaxIntensity(value: Double): Self = StObject.set(x, "maxIntensity", value.asInstanceOf[js.Any])
      
      inline def setMaxIntensityNull: Self = StObject.set(x, "maxIntensity", null)
      
      inline def setMaxIntensityUndefined: Self = StObject.set(x, "maxIntensity", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusNull: Self = StObject.set(x, "radius", null)
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  /**
    * A data point entry for a heatmap. This is a geographical data point with a
    * weight attribute.
    */
  trait WeightedLocation extends StObject {
    
    /**
      * The location of the data point.
      */
    var location: LatLng | Null
    
    /**
      * The weighting value of the data point.
      */
    var weight: Double
  }
  object WeightedLocation {
    
    inline def apply(weight: Double): WeightedLocation = {
      val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any], location = null)
      __obj.asInstanceOf[WeightedLocation]
    }
    
    extension [Self <: WeightedLocation](x: Self) {
      
      inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
