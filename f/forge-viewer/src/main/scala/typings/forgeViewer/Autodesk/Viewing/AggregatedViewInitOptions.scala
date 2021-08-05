package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedViewInitOptions extends StObject {
  
  var headlessViewer: js.UndefOr[Boolean] = js.undefined
  
  var ignoreGlobalOffset: js.UndefOr[Boolean] = js.undefined
  
  var useDynamicGlobalOffset: js.UndefOr[Boolean] = js.undefined
}
object AggregatedViewInitOptions {
  
  inline def apply(): AggregatedViewInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedViewInitOptions]
  }
  
  extension [Self <: AggregatedViewInitOptions](x: Self) {
    
    inline def setHeadlessViewer(value: Boolean): Self = StObject.set(x, "headlessViewer", value.asInstanceOf[js.Any])
    
    inline def setHeadlessViewerUndefined: Self = StObject.set(x, "headlessViewer", js.undefined)
    
    inline def setIgnoreGlobalOffset(value: Boolean): Self = StObject.set(x, "ignoreGlobalOffset", value.asInstanceOf[js.Any])
    
    inline def setIgnoreGlobalOffsetUndefined: Self = StObject.set(x, "ignoreGlobalOffset", js.undefined)
    
    inline def setUseDynamicGlobalOffset(value: Boolean): Self = StObject.set(x, "useDynamicGlobalOffset", value.asInstanceOf[js.Any])
    
    inline def setUseDynamicGlobalOffsetUndefined: Self = StObject.set(x, "useDynamicGlobalOffset", js.undefined)
  }
}
