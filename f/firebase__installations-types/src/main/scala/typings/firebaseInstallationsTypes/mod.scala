package typings.firebaseInstallationsTypes

import typings.firebaseInstallationsTypes.firebaseInstallationsTypesStrings.installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait FirebaseInstallations extends StObject {
    
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
  
  type FirebaseInstallationsName = installations
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `installations-compat`: FirebaseInstallations
    }
    object NameServiceMapping {
      
      inline def apply(`installations-compat`: FirebaseInstallations): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("installations-compat")(`installations-compat`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setInstallations-compat`(value: FirebaseInstallations): Self = StObject.set(x, "installations-compat", value.asInstanceOf[js.Any])
      }
    }
  }
}
