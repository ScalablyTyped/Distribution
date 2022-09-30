package typings.dynmap.mod

import typings.dynmap.mod.global.Array
import typings.leaflet.mod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerLine extends StObject {
  
  var color: HexColor
  
  var desc: js.UndefOr[String] = js.undefined
  
  var label: String
  
  var markup: Boolean
  
  var maxzoom: Double
  
  var minzoom: Double
  
  var opacity: Double
  
  var our_layer: Layer
  
  var timestamp: Double
  
  var weight: Double
  
  var x: Array[Double]
  
  var y: Array[Double]
  
  var z: Array[Double]
}
object MarkerLine {
  
  inline def apply(
    color: HexColor,
    label: String,
    markup: Boolean,
    maxzoom: Double,
    minzoom: Double,
    opacity: Double,
    our_layer: Layer,
    timestamp: Double,
    weight: Double,
    x: Array[Double],
    y: Array[Double],
    z: Array[Double]
  ): MarkerLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], markup = markup.asInstanceOf[js.Any], maxzoom = maxzoom.asInstanceOf[js.Any], minzoom = minzoom.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], our_layer = our_layer.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerLine]
  }
  
  extension [Self <: MarkerLine](x: Self) {
    
    inline def setColor(value: HexColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMarkup(value: Boolean): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOur_layer(value: Layer): Self = StObject.set(x, "our_layer", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setX(value: Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Array[Double]): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
