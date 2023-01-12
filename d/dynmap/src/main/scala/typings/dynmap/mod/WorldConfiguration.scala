package typings.dynmap.mod

import typings.dynmap.dynmapInts.`256`
import typings.dynmap.mod.global.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldConfiguration extends StObject {
  
  var append_to_world: js.UndefOr[String] = js.undefined
  
  var center: Location[String | World | Null, Double, Double, Double]
  
  var extrazoomout: Double
  
  var maps: Array[WorldMapConfiguration]
  
  var name: String
  
  var `protected`: Boolean
  
  var sealevel: Double
  
  var title: String
  
  var worldheight: `256`
}
object WorldConfiguration {
  
  inline def apply(
    center: Location[String | World | Null, Double, Double, Double],
    extrazoomout: Double,
    maps: Array[WorldMapConfiguration],
    name: String,
    `protected`: Boolean,
    sealevel: Double,
    title: String
  ): WorldConfiguration = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], extrazoomout = extrazoomout.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sealevel = sealevel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], worldheight = 256)
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorldConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAppend_to_world(value: String): Self = StObject.set(x, "append_to_world", value.asInstanceOf[js.Any])
    
    inline def setAppend_to_worldUndefined: Self = StObject.set(x, "append_to_world", js.undefined)
    
    inline def setCenter(value: Location[String | World | Null, Double, Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setExtrazoomout(value: Double): Self = StObject.set(x, "extrazoomout", value.asInstanceOf[js.Any])
    
    inline def setMaps(value: Array[WorldMapConfiguration]): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setSealevel(value: Double): Self = StObject.set(x, "sealevel", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWorldheight(value: `256`): Self = StObject.set(x, "worldheight", value.asInstanceOf[js.Any])
  }
}
