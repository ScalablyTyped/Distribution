package typings.firebaseInstallations

import typings.firebaseInstallations.distSrcApiOnIdChangeMod.IdChangeCallbackFn
import typings.firebaseInstallations.distSrcInterfacesInstallationImplMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersFidChangedMod {
  
  @JSImport("@firebase/installations/dist/src/helpers/fid-changed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCallback(appConfig: AppConfig, callback: IdChangeCallbackFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCallback")(appConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fidChanged(appConfig: AppConfig, fid: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fidChanged")(appConfig.asInstanceOf[js.Any], fid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeCallback(appConfig: AppConfig, callback: IdChangeCallbackFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCallback")(appConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
