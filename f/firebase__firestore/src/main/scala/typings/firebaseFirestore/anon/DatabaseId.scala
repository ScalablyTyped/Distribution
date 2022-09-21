package typings.firebaseFirestore.anon

import typings.firebaseFirestore.indexEsm2017Mod.ya
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseId extends StObject {
  
  var app: Any
  
  var databaseId: Any
  
  var settings: ya
}
object DatabaseId {
  
  inline def apply(app: Any, databaseId: Any, settings: ya): DatabaseId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], databaseId = databaseId.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseId]
  }
  
  extension [Self <: DatabaseId](x: Self) {
    
    inline def setApp(value: Any): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setDatabaseId(value: Any): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: ya): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
