package typings.firebaseFirestore.anon

import typings.firebaseFirestore.indexBrowserEsm2017Mod.cn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var app: Any
  
  var databaseId: Any
  
  var settings: cn
}
object App {
  
  inline def apply(app: Any, databaseId: Any, settings: cn): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], databaseId = databaseId.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setApp(value: Any): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setDatabaseId(value: Any): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: cn): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
