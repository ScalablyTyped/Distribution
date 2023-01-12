package typings.firebaseDatabaseCompat

import typings.firebaseDatabaseCompat.anon.Database
import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appCompatMod {
  
  trait FirebaseApp extends StObject {
    
    var database: js.UndefOr[js.Function0[FirebaseDatabase]] = js.undefined
  }
  object FirebaseApp {
    
    inline def apply(): FirebaseApp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseApp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirebaseApp] (val x: Self) extends AnyVal {
      
      inline def setDatabase(value: () => FirebaseDatabase): Self = StObject.set(x, "database", js.Any.fromFunction0(value))
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    }
  }
  
  trait FirebaseNamespace extends StObject {
    
    var database: js.UndefOr[Database] = js.undefined
  }
  object FirebaseNamespace {
    
    inline def apply(): FirebaseNamespace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirebaseNamespace] (val x: Self) extends AnyVal {
      
      inline def setDatabase(value: Database): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    }
  }
}
