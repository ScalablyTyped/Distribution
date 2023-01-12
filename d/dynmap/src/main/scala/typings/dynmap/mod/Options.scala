package typings.dynmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with Configuration {
  
  @JSName("container")
  var container_Options: js.UndefOr[String] = js.undefined
  
  var defaultzoom: js.UndefOr[Double] = js.undefined
  
  var followmap: js.UndefOr[String] = js.undefined
  
  var followzoom: js.UndefOr[String] = js.undefined
  
  var showDynmapLayerControl: js.UndefOr[SidebarState] = js.undefined
}
object Options {
  
  inline def apply(url: typings.dynmap.anon.Configuration): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDefaultzoom(value: Double): Self = StObject.set(x, "defaultzoom", value.asInstanceOf[js.Any])
    
    inline def setDefaultzoomUndefined: Self = StObject.set(x, "defaultzoom", js.undefined)
    
    inline def setFollowmap(value: String): Self = StObject.set(x, "followmap", value.asInstanceOf[js.Any])
    
    inline def setFollowmapUndefined: Self = StObject.set(x, "followmap", js.undefined)
    
    inline def setFollowzoom(value: String): Self = StObject.set(x, "followzoom", value.asInstanceOf[js.Any])
    
    inline def setFollowzoomUndefined: Self = StObject.set(x, "followzoom", js.undefined)
    
    inline def setShowDynmapLayerControl(value: SidebarState): Self = StObject.set(x, "showDynmapLayerControl", value.asInstanceOf[js.Any])
    
    inline def setShowDynmapLayerControlUndefined: Self = StObject.set(x, "showDynmapLayerControl", js.undefined)
  }
}
