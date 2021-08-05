package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadModelOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var fileLoader: js.UndefOr[FileLoader] = js.undefined
  
  var ids: js.UndefOr[String] = js.undefined
  
  var loadOptions: js.UndefOr[js.Object] = js.undefined
  
  var sharedPropertyDbPath: js.UndefOr[String] = js.undefined
}
object LoadModelOptions {
  
  inline def apply(): LoadModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadModelOptions]
  }
  
  extension [Self <: LoadModelOptions](x: Self) {
    
    inline def setFileLoader(value: FileLoader): Self = StObject.set(x, "fileLoader", value.asInstanceOf[js.Any])
    
    inline def setFileLoaderUndefined: Self = StObject.set(x, "fileLoader", js.undefined)
    
    inline def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setLoadOptions(value: js.Object): Self = StObject.set(x, "loadOptions", value.asInstanceOf[js.Any])
    
    inline def setLoadOptionsUndefined: Self = StObject.set(x, "loadOptions", js.undefined)
    
    inline def setSharedPropertyDbPath(value: String): Self = StObject.set(x, "sharedPropertyDbPath", value.asInstanceOf[js.Any])
    
    inline def setSharedPropertyDbPathUndefined: Self = StObject.set(x, "sharedPropertyDbPath", js.undefined)
  }
}
