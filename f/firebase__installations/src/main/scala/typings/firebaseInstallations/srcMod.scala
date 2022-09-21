package typings.firebaseInstallations

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseInstallations.onIdChangeMod.IdChangeCallbackFn
import typings.firebaseInstallations.onIdChangeMod.IdChangeUnsubscribeFn
import typings.firebaseInstallations.publicTypesMod.FirebaseInstallationsInternal
import typings.firebaseInstallations.publicTypesMod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@firebase/installations/dist/esm/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteInstallations(installations: Installations): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteInstallations")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getId(installations: Installations): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getInstallations(): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")().asInstanceOf[Installations]
  inline def getInstallations(app: FirebaseApp): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")(app.asInstanceOf[js.Any]).asInstanceOf[Installations]
  
  inline def getToken(installations: Installations): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getToken(installations: Installations, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(installations.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def onIdChange(installations: Installations, callback: IdChangeCallbackFn): IdChangeUnsubscribeFn = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdChange")(installations.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IdChangeUnsubscribeFn]
  
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
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setInstallations(value: Installations): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
        
        inline def `setInstallations-internal`(value: FirebaseInstallationsInternal): Self = StObject.set(x, "installations-internal", value.asInstanceOf[js.Any])
      }
    }
  }
}
