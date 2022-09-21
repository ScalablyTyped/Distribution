package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcCoreDatabaseInfoMod.DatabaseId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreSrcApiParseContextMod {
  
  trait ParseContext extends StObject {
    
    val databaseId: DatabaseId
    
    val ignoreUndefinedProperties: Boolean
  }
  object ParseContext {
    
    inline def apply(databaseId: DatabaseId, ignoreUndefinedProperties: Boolean): ParseContext = {
      val __obj = js.Dynamic.literal(databaseId = databaseId.asInstanceOf[js.Any], ignoreUndefinedProperties = ignoreUndefinedProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseContext]
    }
    
    extension [Self <: ParseContext](x: Self) {
      
      inline def setDatabaseId(value: DatabaseId): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefinedProperties(value: Boolean): Self = StObject.set(x, "ignoreUndefinedProperties", value.asInstanceOf[js.Any])
    }
  }
}
