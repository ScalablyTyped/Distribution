package typings.firebaseInstallationsCompat

import typings.firebaseInstallations.mod.Installations
import typings.firebaseInstallationsCompat.mod.FirebaseApp
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installationsCompatMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @JSImport("@firebase/installations-compat/dist/src/installationsCompat", "InstallationsCompat")
  @js.native
  open class InstallationsCompat protected ()
    extends StObject
       with FirebaseInstallations {
    def this(app: FirebaseApp, _delegate: Installations) = this()
    
    val _delegate: Installations = js.native
    
    var app: FirebaseApp = js.native
  }
}
