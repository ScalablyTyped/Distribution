package typings.googleMapReact.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map extends StObject {
  
  var map: js.Any
  
  var maps: js.Any
  
  var ref: Element | Null
}
object Map {
  
  inline def apply(map: js.Any, maps: js.Any): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[Map]
  }
  
  extension [Self <: Map](x: Self) {
    
    inline def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMaps(value: js.Any): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
    
    inline def setRef(value: Element): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
  }
}
