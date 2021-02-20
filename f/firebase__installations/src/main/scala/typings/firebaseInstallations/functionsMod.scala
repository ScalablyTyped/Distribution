package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import typings.firebaseInstallations.onIdChangeMod.IdChangeCallbackFn
import typings.firebaseInstallations.onIdChangeMod.IdChangeUnsubscribeFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("@firebase/installations/dist/src/functions", "deleteInstallation")
  @js.native
  def deleteInstallation(dependencies: FirebaseDependencies): js.Promise[Unit] = js.native
  
  @JSImport("@firebase/installations/dist/src/functions", "getId")
  @js.native
  def getId(dependencies: FirebaseDependencies): js.Promise[String] = js.native
  
  @JSImport("@firebase/installations/dist/src/functions", "getToken")
  @js.native
  def getToken(dependencies: FirebaseDependencies): js.Promise[String] = js.native
  @JSImport("@firebase/installations/dist/src/functions", "getToken")
  @js.native
  def getToken(dependencies: FirebaseDependencies, forceRefresh: Boolean): js.Promise[String] = js.native
  
  @JSImport("@firebase/installations/dist/src/functions", "onIdChange")
  @js.native
  def onIdChange(hasAppConfig: FirebaseDependencies, callback: IdChangeCallbackFn): IdChangeUnsubscribeFn = js.native
}
