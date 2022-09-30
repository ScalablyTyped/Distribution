package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installationsInstallationsMod {
  
  @JSImport("firebase-admin/lib/installations/installations", "Installations")
  @js.native
  open class Installations () extends StObject {
    
    /**
      * Returns the app associated with this Installations instance.
      *
      * @returns The app associated with this Installations instance.
      */
    def app: App = js.native
    
    /* private */ var app_ : Any = js.native
    
    /**
      * Deletes the specified installation ID and the associated data from Firebase.
      *
      * @param fid - The Firebase installation ID to be deleted.
      *
      * @returns A promise fulfilled when the installation ID is deleted.
      */
    def deleteInstallation(fid: String): js.Promise[Unit] = js.native
    
    /* private */ var requestHandler: Any = js.native
  }
}
