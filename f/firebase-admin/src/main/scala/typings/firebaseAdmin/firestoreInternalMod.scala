package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import typings.googleCloudFirestore.FirebaseFirestore.Settings
import typings.googleCloudFirestore.mod.Firestore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreInternalMod {
  
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
    
    /* private */ var appInternal: Any = js.native
    
    def client: Firestore = js.native
    
    /* private */ var firestoreClient: Any = js.native
  }
  
  inline def getFirestoreOptions(app: App): Settings = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestoreOptions")(app.asInstanceOf[js.Any]).asInstanceOf[Settings]
}
