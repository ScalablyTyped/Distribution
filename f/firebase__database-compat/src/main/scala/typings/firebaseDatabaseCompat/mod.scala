package typings.firebaseDatabaseCompat

import typings.firebaseDatabaseCompat.anon.Call
import typings.firebaseDatabaseCompat.anon.Database
import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait FirebaseApp extends StObject {
    
    var database: js.UndefOr[js.Function0[FirebaseDatabase]] & (js.UndefOr[js.Function1[/* databaseURL */ js.UndefOr[String], FirebaseDatabase]])
  }
  object FirebaseApp {
    
    inline def apply(
      database: js.UndefOr[js.Function0[FirebaseDatabase]] & (js.UndefOr[js.Function1[/* databaseURL */ js.UndefOr[String], FirebaseDatabase]])
    ): FirebaseApp = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setDatabase(
        value: js.UndefOr[js.Function0[FirebaseDatabase]] & (js.UndefOr[js.Function1[/* databaseURL */ js.UndefOr[String], FirebaseDatabase]])
      ): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    }
  }
  
  trait FirebaseNamespace extends StObject {
    
    var database: js.UndefOr[Database] & js.UndefOr[Call]
  }
  object FirebaseNamespace {
    
    inline def apply(database: js.UndefOr[Database] & js.UndefOr[Call]): FirebaseNamespace = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    extension [Self <: FirebaseNamespace](x: Self) {
      
      inline def setDatabase(value: js.UndefOr[Database] & js.UndefOr[Call]): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    }
  }
}
