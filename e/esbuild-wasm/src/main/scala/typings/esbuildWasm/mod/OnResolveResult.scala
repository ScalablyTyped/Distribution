package typings.esbuildWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnResolveResult extends StObject {
  
  var errors: js.UndefOr[js.Array[PartialMessage]] = js.undefined
  
  var external: js.UndefOr[Boolean] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var pluginData: js.UndefOr[Any] = js.undefined
  
  var pluginName: js.UndefOr[String] = js.undefined
  
  var sideEffects: js.UndefOr[Boolean] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var warnings: js.UndefOr[js.Array[PartialMessage]] = js.undefined
  
  var watchDirs: js.UndefOr[js.Array[String]] = js.undefined
  
  var watchFiles: js.UndefOr[js.Array[String]] = js.undefined
}
object OnResolveResult {
  
  inline def apply(): OnResolveResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnResolveResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnResolveResult] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[PartialMessage]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: PartialMessage*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPluginData(value: Any): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
    
    inline def setPluginDataUndefined: Self = StObject.set(x, "pluginData", js.undefined)
    
    inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
    
    inline def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
    
    inline def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setWarnings(value: js.Array[PartialMessage]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: PartialMessage*): Self = StObject.set(x, "warnings", js.Array(value*))
    
    inline def setWatchDirs(value: js.Array[String]): Self = StObject.set(x, "watchDirs", value.asInstanceOf[js.Any])
    
    inline def setWatchDirsUndefined: Self = StObject.set(x, "watchDirs", js.undefined)
    
    inline def setWatchDirsVarargs(value: String*): Self = StObject.set(x, "watchDirs", js.Array(value*))
    
    inline def setWatchFiles(value: js.Array[String]): Self = StObject.set(x, "watchFiles", value.asInstanceOf[js.Any])
    
    inline def setWatchFilesUndefined: Self = StObject.set(x, "watchFiles", js.undefined)
    
    inline def setWatchFilesVarargs(value: String*): Self = StObject.set(x, "watchFiles", js.Array(value*))
  }
}
