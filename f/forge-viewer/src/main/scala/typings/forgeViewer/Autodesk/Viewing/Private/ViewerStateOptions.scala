package typings.forgeViewer.Autodesk.Viewing.Private

import typings.forgeViewer.anon.AmbientOcclusion
import typings.forgeViewer.anon.AspectRatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewerStateOptions extends StObject {
  
  var cutplanes: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var guid: js.UndefOr[String] = js.undefined
  
  var objectSet: js.UndefOr[js.Array[ObjectSetItem]] = js.undefined
  
  var overrides: js.UndefOr[js.Array[Any]] = js.undefined
  
  var renderOptions: js.UndefOr[AmbientOcclusion] = js.undefined
  
  var seedURN: js.UndefOr[String] = js.undefined
  
  var viewport: js.UndefOr[AspectRatio] = js.undefined
}
object ViewerStateOptions {
  
  inline def apply(): ViewerStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewerStateOptions]
  }
  
  extension [Self <: ViewerStateOptions](x: Self) {
    
    inline def setCutplanes(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "cutplanes", value.asInstanceOf[js.Any])
    
    inline def setCutplanesUndefined: Self = StObject.set(x, "cutplanes", js.undefined)
    
    inline def setCutplanesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "cutplanes", js.Array(value*))
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setObjectSet(value: js.Array[ObjectSetItem]): Self = StObject.set(x, "objectSet", value.asInstanceOf[js.Any])
    
    inline def setObjectSetUndefined: Self = StObject.set(x, "objectSet", js.undefined)
    
    inline def setObjectSetVarargs(value: ObjectSetItem*): Self = StObject.set(x, "objectSet", js.Array(value*))
    
    inline def setOverrides(value: js.Array[Any]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: Any*): Self = StObject.set(x, "overrides", js.Array(value*))
    
    inline def setRenderOptions(value: AmbientOcclusion): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
    
    inline def setSeedURN(value: String): Self = StObject.set(x, "seedURN", value.asInstanceOf[js.Any])
    
    inline def setSeedURNUndefined: Self = StObject.set(x, "seedURN", js.undefined)
    
    inline def setViewport(value: AspectRatio): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
