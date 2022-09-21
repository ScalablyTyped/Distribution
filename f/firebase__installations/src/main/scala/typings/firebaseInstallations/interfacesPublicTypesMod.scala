package typings.firebaseInstallations

import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesPublicTypesMod {
  
  @js.native
  trait FirebaseInstallationsInternal extends StObject {
    
    /**
      * Creates a Firebase Installation if there isn't one for the app and
      * returns the Installation ID.
      */
    def getId(): js.Promise[String] = js.native
    
    /**
      * Returns an Authentication Token for the current Firebase Installation.
      */
    def getToken(): js.Promise[String] = js.native
    def getToken(forceRefresh: Boolean): js.Promise[String] = js.native
  }
  
  trait Installations extends StObject {
    
    /**
      * The {@link @firebase/app#FirebaseApp} this `Installations` instance is associated with.
      */
    var app: FirebaseApp
  }
  object Installations {
    
    inline def apply(app: FirebaseApp): Installations = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[Installations]
    }
    
    extension [Self <: Installations](x: Self) {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    }
  }
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var installations: typings.firebaseInstallations.publicTypesMod.Installations
      
      var `installations-internal`: typings.firebaseInstallations.publicTypesMod.FirebaseInstallationsInternal
    }
    object NameServiceMapping {
      
      inline def apply(
        installations: typings.firebaseInstallations.publicTypesMod.Installations,
        `installations-internal`: typings.firebaseInstallations.publicTypesMod.FirebaseInstallationsInternal
      ): NameServiceMapping = {
        val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any])
        __obj.updateDynamic("installations-internal")(`installations-internal`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setInstallations(value: typings.firebaseInstallations.publicTypesMod.Installations): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
        
        inline def `setInstallations-internal`(value: typings.firebaseInstallations.publicTypesMod.FirebaseInstallationsInternal): Self = StObject.set(x, "installations-internal", value.asInstanceOf[js.Any])
      }
    }
  }
}
