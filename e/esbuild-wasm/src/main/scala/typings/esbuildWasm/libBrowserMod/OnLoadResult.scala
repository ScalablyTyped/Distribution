package typings.esbuildWasm.libBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnLoadResult extends StObject {
  
  var contents: js.UndefOr[String | js.typedarray.Uint8Array] = js.undefined
  
  var errors: js.UndefOr[js.Array[PartialMessage]] = js.undefined
  
  var loader: js.UndefOr[Loader] = js.undefined
  
  var pluginData: js.UndefOr[Any] = js.undefined
  
  var pluginName: js.UndefOr[String] = js.undefined
  
  var resolveDir: js.UndefOr[String] = js.undefined
  
  var warnings: js.UndefOr[js.Array[PartialMessage]] = js.undefined
  
  var watchDirs: js.UndefOr[js.Array[String]] = js.undefined
  
  var watchFiles: js.UndefOr[js.Array[String]] = js.undefined
}
object OnLoadResult {
  
  inline def apply(): OnLoadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnLoadResult]
  }
  
  extension [Self <: OnLoadResult](x: Self) {
    
    inline def setContents(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setErrors(value: js.Array[PartialMessage]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: PartialMessage*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setLoader(value: Loader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setPluginData(value: Any): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
    
    inline def setPluginDataUndefined: Self = StObject.set(x, "pluginData", js.undefined)
    
    inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
    
    inline def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
    
    inline def setResolveDir(value: String): Self = StObject.set(x, "resolveDir", value.asInstanceOf[js.Any])
    
    inline def setResolveDirUndefined: Self = StObject.set(x, "resolveDir", js.undefined)
    
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
