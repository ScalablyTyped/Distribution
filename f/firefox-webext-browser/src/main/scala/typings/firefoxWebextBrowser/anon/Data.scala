package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.browser.manifest.ExtensionID
import typings.firefoxWebextBrowser.browser.manifest.NativeManifest
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data
  extends StObject
     with NativeManifest {
  
  var data: StringDictionary[Any]
  
  var description: String
  
  var name: ExtensionID
  
  var `type`: storage
}
object Data {
  
  inline def apply(data: StringDictionary[Any], description: String, name: ExtensionID): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("storage")
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: ExtensionID): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: storage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
