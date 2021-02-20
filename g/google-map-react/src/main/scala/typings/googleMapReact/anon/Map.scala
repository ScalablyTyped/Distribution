package typings.googleMapReact.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map extends StObject {
  
  var map: js.Any = js.native
  
  var maps: js.Any = js.native
  
  var ref: Element | Null = js.native
}
object Map {
  
  @scala.inline
  def apply(map: js.Any, maps: js.Any): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  @scala.inline
  implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaps(value: js.Any): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: Element): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
  }
}
