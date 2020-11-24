package typings.firebase.mod.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
@JSImport("firebase", "firebase.installations")
@js.native
object installations extends js.Object {
  
  @js.native
  trait Installations extends js.Object {
    
    /**
      * Deletes the Firebase Installation and all associated data.
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Creates a Firebase Installation if there isn't one for the app and
      * returns the Installation ID.
      *
      * @return Firebase Installation ID
      */
    def getId(): js.Promise[String] = js.native
    
    /**
      * Returns an Authentication Token for the current Firebase Installation.
      *
      * @return Firebase Installation Authentication Token
      */
    def getToken(): js.Promise[String] = js.native
    def getToken(forceRefresh: Boolean): js.Promise[String] = js.native
    
    /**
      * Sets a new callback that will get called when Installlation ID changes.
      * Returns an unsubscribe function that will remove the callback when called.
      */
    def onIdChange(callback: js.Function1[/* installationId */ String, Unit]): js.Function0[Unit] = js.native
  }
}
