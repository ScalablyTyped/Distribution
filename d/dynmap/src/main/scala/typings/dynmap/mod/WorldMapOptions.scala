package typings.dynmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldMapOptions extends StObject {
  
  var append_to_world: js.UndefOr[String] = js.undefined
  
  var dynmap: js.UndefOr[WorldMap] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var world: js.UndefOr[World] = js.undefined
}
object WorldMapOptions {
  
  inline def apply(): WorldMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldMapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorldMapOptions] (val x: Self) extends AnyVal {
    
    inline def setAppend_to_world(value: String): Self = StObject.set(x, "append_to_world", value.asInstanceOf[js.Any])
    
    inline def setAppend_to_worldUndefined: Self = StObject.set(x, "append_to_world", js.undefined)
    
    inline def setDynmap(value: WorldMap): Self = StObject.set(x, "dynmap", value.asInstanceOf[js.Any])
    
    inline def setDynmapUndefined: Self = StObject.set(x, "dynmap", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWorld(value: World): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    
    inline def setWorldUndefined: Self = StObject.set(x, "world", js.undefined)
  }
}
