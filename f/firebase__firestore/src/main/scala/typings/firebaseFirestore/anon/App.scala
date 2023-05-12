package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod.En
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var app: Any
  
  var databaseId: Any
  
  var settings: En
}
object App {
  
  inline def apply(app: Any, databaseId: Any, settings: En): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], databaseId = databaseId.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    inline def setApp(value: Any): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setDatabaseId(value: Any): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: En): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
