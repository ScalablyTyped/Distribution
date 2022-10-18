package typings.firebaseInstallations

import typings.firebaseInstallations.distEsmSrcInterfacesPublicTypesMod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcApiOnIdChangeMod {
  
  @JSImport("@firebase/installations/dist/esm/src/api/on-id-change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onIdChange(installations: Installations, callback: IdChangeCallbackFn): IdChangeUnsubscribeFn = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdChange")(installations.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IdChangeUnsubscribeFn]
  
  type IdChangeCallbackFn = js.Function1[/* installationId */ String, Unit]
  
  type IdChangeUnsubscribeFn = js.Function0[Unit]
}
