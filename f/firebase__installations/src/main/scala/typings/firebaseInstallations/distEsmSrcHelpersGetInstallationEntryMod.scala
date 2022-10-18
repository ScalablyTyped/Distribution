package typings.firebaseInstallations

import typings.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.InstallationEntry
import typings.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.distEsmSrcInterfacesInstallationImplMod.FirebaseInstallationsImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcHelpersGetInstallationEntryMod {
  
  @JSImport("@firebase/installations/dist/esm/src/helpers/get-installation-entry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstallationEntry(installations: FirebaseInstallationsImpl): js.Promise[InstallationEntryWithRegistrationPromise] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallationEntry")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InstallationEntryWithRegistrationPromise]]
  
  trait InstallationEntryWithRegistrationPromise extends StObject {
    
    var installationEntry: InstallationEntry
    
    /** Exist iff the installationEntry is not registered. */
    var registrationPromise: js.UndefOr[js.Promise[RegisteredInstallationEntry]] = js.undefined
  }
  object InstallationEntryWithRegistrationPromise {
    
    inline def apply(installationEntry: InstallationEntry): InstallationEntryWithRegistrationPromise = {
      val __obj = js.Dynamic.literal(installationEntry = installationEntry.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallationEntryWithRegistrationPromise]
    }
    
    extension [Self <: InstallationEntryWithRegistrationPromise](x: Self) {
      
      inline def setInstallationEntry(value: InstallationEntry): Self = StObject.set(x, "installationEntry", value.asInstanceOf[js.Any])
      
      inline def setRegistrationPromise(value: js.Promise[RegisteredInstallationEntry]): Self = StObject.set(x, "registrationPromise", value.asInstanceOf[js.Any])
      
      inline def setRegistrationPromiseUndefined: Self = StObject.set(x, "registrationPromise", js.undefined)
    }
  }
}
