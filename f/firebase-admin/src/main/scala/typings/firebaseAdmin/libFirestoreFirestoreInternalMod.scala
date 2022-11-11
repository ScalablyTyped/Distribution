package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import typings.googleCloudFirestore.FirebaseFirestore.Settings
import typings.googleCloudFirestore.mod.Firestore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFirestoreFirestoreInternalMod {
  
  @JSImport("firebase-admin/lib/firestore/firestore-internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/firestore/firestore-internal", "FirestoreService")
  @js.native
  open class FirestoreService protected () extends StObject {
    def this(app: App) = this()
    
    /**
      * Returns the app associated with this Storage instance.
      *
      * @returns The app associated with this Storage instance.
      */
    def app: App = js.native
    
    /* private */ val appInternal: Any = js.native
    
    /* private */ val databases: Any = js.native
    
    def getDatabase(databaseId: String): Firestore = js.native
  }
  
  inline def getFirestoreOptions(app: App): Settings = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestoreOptions")(app.asInstanceOf[js.Any]).asInstanceOf[Settings]
}
