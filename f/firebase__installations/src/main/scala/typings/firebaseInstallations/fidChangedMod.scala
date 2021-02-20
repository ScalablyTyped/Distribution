package typings.firebaseInstallations

import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.firebaseInstallations.onIdChangeMod.IdChangeCallbackFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fidChangedMod {
  
  @JSImport("@firebase/installations/dist/src/helpers/fid-changed", "addCallback")
  @js.native
  def addCallback(appConfig: AppConfig, callback: IdChangeCallbackFn): Unit = js.native
  
  @JSImport("@firebase/installations/dist/src/helpers/fid-changed", "fidChanged")
  @js.native
  def fidChanged(appConfig: AppConfig, fid: String): Unit = js.native
  
  @JSImport("@firebase/installations/dist/src/helpers/fid-changed", "removeCallback")
  @js.native
  def removeCallback(appConfig: AppConfig, callback: IdChangeCallbackFn): Unit = js.native
}
