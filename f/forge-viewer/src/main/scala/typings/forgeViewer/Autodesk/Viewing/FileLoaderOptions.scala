package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileLoaderOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var ids: js.UndefOr[String] = js.undefined
  
  var sharedPropertyDbPath: js.UndefOr[String] = js.undefined
}
object FileLoaderOptions {
  
  inline def apply(): FileLoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileLoaderOptions]
  }
  
  extension [Self <: FileLoaderOptions](x: Self) {
    
    inline def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setSharedPropertyDbPath(value: String): Self = StObject.set(x, "sharedPropertyDbPath", value.asInstanceOf[js.Any])
    
    inline def setSharedPropertyDbPathUndefined: Self = StObject.set(x, "sharedPropertyDbPath", js.undefined)
  }
}
