package typings.firebaseInstallations

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseInstallations.apiOnIdChangeMod.IdChangeCallbackFn
import typings.firebaseInstallations.apiOnIdChangeMod.IdChangeUnsubscribeFn
import typings.firebaseInstallations.interfacesPublicTypesMod.Installations
import typings.firebaseInstallations.publicTypesMod.FirebaseInstallationsInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMod {
  
  @JSImport("@firebase/installations/dist/src", JSImport.Namespace)
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
      
      var installations: typings.firebaseInstallations.publicTypesMod.Installations
      
      var `installations-internal`: FirebaseInstallationsInternal
    }
    object NameServiceMapping {
      
      inline def apply(
        installations: typings.firebaseInstallations.publicTypesMod.Installations,
        `installations-internal`: FirebaseInstallationsInternal
      ): NameServiceMapping = {
        val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any])
        __obj.updateDynamic("installations-internal")(`installations-internal`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setInstallations(value: typings.firebaseInstallations.publicTypesMod.Installations): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
        
        inline def `setInstallations-internal`(value: FirebaseInstallationsInternal): Self = StObject.set(x, "installations-internal", value.asInstanceOf[js.Any])
      }
    }
  }
}
