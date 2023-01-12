package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedViewInitOptions extends StObject {
  
  var cameraValidator: js.UndefOr[Boolean] = js.undefined
  
  var clusterfck: js.UndefOr[Any] = js.undefined
  
  var createModelAlignmentService: js.UndefOr[Any] = js.undefined
  
  var disableBookmarks: js.UndefOr[Boolean] = js.undefined
  
  var getCustomLoadOptions: js.UndefOr[Any] = js.undefined
  
  var ignoreGlobalOffset: js.UndefOr[Boolean] = js.undefined
  
  var multiViewerFactory: js.UndefOr[Any] = js.undefined
  
  var propagateInputEventTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var unloadUnfinishedModels: js.UndefOr[Boolean] = js.undefined
  
  var useConsolidation: js.UndefOr[Boolean] = js.undefined
  
  var useDynamicGlobalOffset: js.UndefOr[Boolean] = js.undefined
  
  var viewerConfig: js.UndefOr[Any] = js.undefined
  
  var viewerStartOptions: js.UndefOr[Any] = js.undefined
  
  var viewerUnits: js.UndefOr[String] = js.undefined
}
object AggregatedViewInitOptions {
  
  inline def apply(): AggregatedViewInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedViewInitOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedViewInitOptions] (val x: Self) extends AnyVal {
    
    inline def setCameraValidator(value: Boolean): Self = StObject.set(x, "cameraValidator", value.asInstanceOf[js.Any])
    
    inline def setCameraValidatorUndefined: Self = StObject.set(x, "cameraValidator", js.undefined)
    
    inline def setClusterfck(value: Any): Self = StObject.set(x, "clusterfck", value.asInstanceOf[js.Any])
    
    inline def setClusterfckUndefined: Self = StObject.set(x, "clusterfck", js.undefined)
    
    inline def setCreateModelAlignmentService(value: Any): Self = StObject.set(x, "createModelAlignmentService", value.asInstanceOf[js.Any])
    
    inline def setCreateModelAlignmentServiceUndefined: Self = StObject.set(x, "createModelAlignmentService", js.undefined)
    
    inline def setDisableBookmarks(value: Boolean): Self = StObject.set(x, "disableBookmarks", value.asInstanceOf[js.Any])
    
    inline def setDisableBookmarksUndefined: Self = StObject.set(x, "disableBookmarks", js.undefined)
    
    inline def setGetCustomLoadOptions(value: Any): Self = StObject.set(x, "getCustomLoadOptions", value.asInstanceOf[js.Any])
    
    inline def setGetCustomLoadOptionsUndefined: Self = StObject.set(x, "getCustomLoadOptions", js.undefined)
    
    inline def setIgnoreGlobalOffset(value: Boolean): Self = StObject.set(x, "ignoreGlobalOffset", value.asInstanceOf[js.Any])
    
    inline def setIgnoreGlobalOffsetUndefined: Self = StObject.set(x, "ignoreGlobalOffset", js.undefined)
    
    inline def setMultiViewerFactory(value: Any): Self = StObject.set(x, "multiViewerFactory", value.asInstanceOf[js.Any])
    
    inline def setMultiViewerFactoryUndefined: Self = StObject.set(x, "multiViewerFactory", js.undefined)
    
    inline def setPropagateInputEventTypes(value: js.Array[String]): Self = StObject.set(x, "propagateInputEventTypes", value.asInstanceOf[js.Any])
    
    inline def setPropagateInputEventTypesUndefined: Self = StObject.set(x, "propagateInputEventTypes", js.undefined)
    
    inline def setPropagateInputEventTypesVarargs(value: String*): Self = StObject.set(x, "propagateInputEventTypes", js.Array(value*))
    
    inline def setUnloadUnfinishedModels(value: Boolean): Self = StObject.set(x, "unloadUnfinishedModels", value.asInstanceOf[js.Any])
    
    inline def setUnloadUnfinishedModelsUndefined: Self = StObject.set(x, "unloadUnfinishedModels", js.undefined)
    
    inline def setUseConsolidation(value: Boolean): Self = StObject.set(x, "useConsolidation", value.asInstanceOf[js.Any])
    
    inline def setUseConsolidationUndefined: Self = StObject.set(x, "useConsolidation", js.undefined)
    
    inline def setUseDynamicGlobalOffset(value: Boolean): Self = StObject.set(x, "useDynamicGlobalOffset", value.asInstanceOf[js.Any])
    
    inline def setUseDynamicGlobalOffsetUndefined: Self = StObject.set(x, "useDynamicGlobalOffset", js.undefined)
    
    inline def setViewerConfig(value: Any): Self = StObject.set(x, "viewerConfig", value.asInstanceOf[js.Any])
    
    inline def setViewerConfigUndefined: Self = StObject.set(x, "viewerConfig", js.undefined)
    
    inline def setViewerStartOptions(value: Any): Self = StObject.set(x, "viewerStartOptions", value.asInstanceOf[js.Any])
    
    inline def setViewerStartOptionsUndefined: Self = StObject.set(x, "viewerStartOptions", js.undefined)
    
    inline def setViewerUnits(value: String): Self = StObject.set(x, "viewerUnits", value.asInstanceOf[js.Any])
    
    inline def setViewerUnitsUndefined: Self = StObject.set(x, "viewerUnits", js.undefined)
  }
}
