package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseDatabaseNamespaceMod {
  
  object database {
    
    inline def apply(): Database = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Database]
    inline def apply(app: App): Database = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Database]
    
    @JSImport("firebase-admin/lib/database/database-namespace", "database")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * {@link https://firebase.google.com/docs/reference/js/firebase.database.ServerValue | ServerValue}
      * constant from the `@firebase/database` package.
      */
    @JSImport("firebase-admin/lib/database/database-namespace", "database.ServerValue")
    @js.native
    val ServerValue: typings.firebaseDatabaseTypes.mod.ServerValue = js.native
    
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")().asInstanceOf[Any]
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(logger: js.Function1[/* a */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(logger: js.Function1[/* a */ String, Any], persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(logger: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(logger: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
    /* was `typeof rtdb.enableLogging` */
    inline def enableLogging(logger: Unit, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Type alias to {@link https://firebase.google.com/docs/reference/js/firebase.database.DataSnapshot | DataSnapshot}
      * type from the `@firebase/database` package.
      */
    type DataSnapshot = typings.firebaseDatabaseTypes.mod.DataSnapshot
    
    /**
      * Type alias to {@link firebase-admin.database#Database}.
      */
    type Database = typings.firebaseAdmin.libDatabaseDatabaseMod.Database
    
    /**
      * Type alias to the {@link https://firebase.google.com/docs/reference/js/firebase.database#eventtype | EventType}
      * type from the `@firebase/database` package.
      */
    type EventType = typings.firebaseDatabaseTypes.mod.EventType
    
    /**
      * Type alias to {@link https://firebase.google.com/docs/reference/js/firebase.database.OnDisconnect | OnDisconnect}
      * type from the `@firebase/database` package.
      */
    type OnDisconnect = typings.firebaseDatabaseTypes.mod.OnDisconnect
    
    /**
      * Type alias to {@link https://firebase.google.com/docs/reference/js/firebase.database.Query | Query}
      * type from the `@firebase/database` package.
      */
    type Query = typings.firebaseDatabaseTypes.mod.Query
    
    /**
      * Type alias to {@link https://firebase.google.com/docs/reference/js/firebase.database.Reference | Reference}
      * type from the `@firebase/database` package.
      */
    type Reference = typings.firebaseDatabaseTypes.mod.Reference
    
    /**
      * Type alias to {@link https://firebase.google.com/docs/reference/js/firebase.database.ThenableReference |
      * ThenableReference} type from the `@firebase/database` package.
      */
    type ThenableReference = typings.firebaseDatabaseTypes.mod.ThenableReference
  }
}
