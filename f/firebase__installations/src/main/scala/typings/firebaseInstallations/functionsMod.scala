package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import typings.firebaseInstallations.onIdChangeMod.IdChangeCallbackFn
import typings.firebaseInstallations.onIdChangeMod.IdChangeUnsubscribeFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("@firebase/installations/dist/src/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deleteInstallation(dependencies: FirebaseDependencies): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteInstallation")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def getId(dependencies: FirebaseDependencies): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def getToken(dependencies: FirebaseDependencies): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def getToken(dependencies: FirebaseDependencies, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(dependencies.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def onIdChange(hasAppConfig: FirebaseDependencies, callback: IdChangeCallbackFn): IdChangeUnsubscribeFn = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdChange")(hasAppConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IdChangeUnsubscribeFn]
}
