package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod.ch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseId extends StObject {
  
  var app: Any
  
  var databaseId: Any
  
  var settings: ch
}
object DatabaseId {
  
  inline def apply(app: Any, databaseId: Any, settings: ch): DatabaseId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], databaseId = databaseId.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseId] (val x: Self) extends AnyVal {
    
    inline def setApp(value: Any): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setDatabaseId(value: Any): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: ch): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
