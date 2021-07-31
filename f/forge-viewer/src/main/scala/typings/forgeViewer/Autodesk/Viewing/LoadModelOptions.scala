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
  
  @scala.inline
  def apply(): LoadModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadModelOptions]
  }
  
  @scala.inline
  implicit class LoadModelOptionsMutableBuilder[Self <: LoadModelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileLoader(value: FileLoader): Self = StObject.set(x, "fileLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileLoaderUndefined: Self = StObject.set(x, "fileLoader", js.undefined)
    
    @scala.inline
    def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setLoadOptions(value: js.Object): Self = StObject.set(x, "loadOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadOptionsUndefined: Self = StObject.set(x, "loadOptions", js.undefined)
    
    @scala.inline
    def setSharedPropertyDbPath(value: String): Self = StObject.set(x, "sharedPropertyDbPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedPropertyDbPathUndefined: Self = StObject.set(x, "sharedPropertyDbPath", js.undefined)
  }
}
