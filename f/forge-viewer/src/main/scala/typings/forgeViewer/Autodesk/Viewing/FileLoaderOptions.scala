package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileLoaderOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var ids: js.UndefOr[String] = js.undefined
  
  var sharedPropertyDbPath: js.UndefOr[String] = js.undefined
}
object FileLoaderOptions {
  
  @scala.inline
  def apply(): FileLoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileLoaderOptions]
  }
  
  @scala.inline
  implicit class FileLoaderOptionsMutableBuilder[Self <: FileLoaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setSharedPropertyDbPath(value: String): Self = StObject.set(x, "sharedPropertyDbPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedPropertyDbPathUndefined: Self = StObject.set(x, "sharedPropertyDbPath", js.undefined)
  }
}
