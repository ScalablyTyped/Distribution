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
  
  @scala.inline
  def apply(): AggregatedViewInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedViewInitOptions]
  }
  
  @scala.inline
  implicit class AggregatedViewInitOptionsMutableBuilder[Self <: AggregatedViewInitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadlessViewer(value: Boolean): Self = StObject.set(x, "headlessViewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlessViewerUndefined: Self = StObject.set(x, "headlessViewer", js.undefined)
    
    @scala.inline
    def setIgnoreGlobalOffset(value: Boolean): Self = StObject.set(x, "ignoreGlobalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreGlobalOffsetUndefined: Self = StObject.set(x, "ignoreGlobalOffset", js.undefined)
    
    @scala.inline
    def setUseDynamicGlobalOffset(value: Boolean): Self = StObject.set(x, "useDynamicGlobalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDynamicGlobalOffsetUndefined: Self = StObject.set(x, "useDynamicGlobalOffset", js.undefined)
  }
}
