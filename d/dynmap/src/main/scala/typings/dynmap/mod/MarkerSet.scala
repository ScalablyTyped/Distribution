package typings.dynmap.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerSet extends StObject {
  
  var areas: StringDictionary[js.UndefOr[MarkerArea]]
  
  var circles: StringDictionary[js.UndefOr[MarkerCircle]]
  
  var hide: Boolean
  
  var id: String
  
  var label: String
  
  var layergroup: MarkerLayerGroup
  
  var layerprio: Double
  
  var lines: StringDictionary[js.UndefOr[MarkerLine]]
  
  var markers: Record[String, js.UndefOr[Marker]]
  
  var maxzoom: Double
  
  var minzoom: Double
  
  var showlabels: Boolean
  
  var timestamp: Double
}
object MarkerSet {
  
  inline def apply(
    areas: StringDictionary[js.UndefOr[MarkerArea]],
    circles: StringDictionary[js.UndefOr[MarkerCircle]],
    hide: Boolean,
    id: String,
    label: String,
    layergroup: MarkerLayerGroup,
    layerprio: Double,
    lines: StringDictionary[js.UndefOr[MarkerLine]],
    markers: Record[String, js.UndefOr[Marker]],
    maxzoom: Double,
    minzoom: Double,
    showlabels: Boolean,
    timestamp: Double
  ): MarkerSet = {
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any], circles = circles.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], layergroup = layergroup.asInstanceOf[js.Any], layerprio = layerprio.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], maxzoom = maxzoom.asInstanceOf[js.Any], minzoom = minzoom.asInstanceOf[js.Any], showlabels = showlabels.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSet]
  }
  
  extension [Self <: MarkerSet](x: Self) {
    
    inline def setAreas(value: StringDictionary[js.UndefOr[MarkerArea]]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
    
    inline def setCircles(value: StringDictionary[js.UndefOr[MarkerCircle]]): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
    
    inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLayergroup(value: MarkerLayerGroup): Self = StObject.set(x, "layergroup", value.asInstanceOf[js.Any])
    
    inline def setLayerprio(value: Double): Self = StObject.set(x, "layerprio", value.asInstanceOf[js.Any])
    
    inline def setLines(value: StringDictionary[js.UndefOr[MarkerLine]]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setMarkers(value: Record[String, js.UndefOr[Marker]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setShowlabels(value: Boolean): Self = StObject.set(x, "showlabels", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
