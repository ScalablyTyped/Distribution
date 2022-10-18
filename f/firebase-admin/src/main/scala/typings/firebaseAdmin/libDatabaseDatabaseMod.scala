package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseDatabaseMod {
  
  @JSImport("firebase-admin/lib/database/database", "DatabaseService")
  @js.native
  open class DatabaseService protected () extends StObject {
    def this(app: App) = this()
    
    /**
      * Returns the app associated with this DatabaseService instance.
      *
      * @returns The app associated with this DatabaseService instance.
      */
    def app: App = js.native
    
    /* private */ val appInternal: Any = js.native
    
    /* private */ var databases: Any = js.native
    
    /* private */ var ensureUrl: Any = js.native
    
    /* private */ def firebaseApp: Any = js.native
    
    def getDatabase(): Database = js.native
    def getDatabase(url: String): Database = js.native
    
    /* private */ var onTokenChange: Any = js.native
    
    /* private */ var scheduleTokenRefresh: Any = js.native
    
    /* private */ var tokenListener: Any = js.native
    
    /* private */ var tokenRefreshTimeout: Any = js.native
  }
  
  @js.native
  trait Database extends FirebaseDatabase {
    
    /**
      * Gets the currently applied security rules as a string. The return value consists of
      * the rules source including comments.
      *
      * @returns A promise fulfilled with the rules as a raw string.
      */
    def getRules(): js.Promise[String] = js.native
    
    /**
      * Gets the currently applied security rules as a parsed JSON object. Any comments in
      * the original source are stripped away.
      *
      * @returns A promise fulfilled with the parsed rules object.
      */
    def getRulesJSON(): js.Promise[js.Object] = js.native
    
    /**
      * Sets the specified rules on the Firebase Realtime Database instance. If the rules source is
      * specified as a string or a Buffer, it may include comments.
      *
      * @param source - Source of the rules to apply. Must not be `null` or empty.
      * @returns Resolves when the rules are set on the Realtime Database.
      */
    def setRules(source: String): js.Promise[Unit] = js.native
    def setRules(source: js.Object): js.Promise[Unit] = js.native
    def setRules(source: Buffer): js.Promise[Unit] = js.native
  }
}
