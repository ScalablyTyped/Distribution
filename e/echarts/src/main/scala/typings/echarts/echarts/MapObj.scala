package typings.echarts.echarts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapObj extends StObject {
  
  /**
    * geoJson data for map
    */
  var geoJson: js.Object
  
  /**
    * special areas fro map
    */
  var specialAreas: js.Object
}
object MapObj {
  
  @scala.inline
  def apply(geoJson: js.Object, specialAreas: js.Object): MapObj = {
    val __obj = js.Dynamic.literal(geoJson = geoJson.asInstanceOf[js.Any], specialAreas = specialAreas.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapObj]
  }
  
  @scala.inline
  implicit class MapObjMutableBuilder[Self <: MapObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoJson(value: js.Object): Self = StObject.set(x, "geoJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialAreas(value: js.Object): Self = StObject.set(x, "specialAreas", value.asInstanceOf[js.Any])
  }
}
