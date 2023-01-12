package typings.firebaseInstallations

import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcInterfacesPublicTypesMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Installations] (val x: Self) extends AnyVal {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var installations: Installations
      
      var `installations-internal`: FirebaseInstallationsInternal
    }
    object NameServiceMapping {
      
      inline def apply(installations: Installations, `installations-internal`: FirebaseInstallationsInternal): NameServiceMapping = {
        val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any])
        __obj.updateDynamic("installations-internal")(`installations-internal`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        inline def setInstallations(value: Installations): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
        
        inline def `setInstallations-internal`(value: FirebaseInstallationsInternal): Self = StObject.set(x, "installations-internal", value.asInstanceOf[js.Any])
      }
    }
  }
}
