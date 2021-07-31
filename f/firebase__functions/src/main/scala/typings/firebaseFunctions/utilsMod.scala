package typings.firebaseFunctions

import typings.firebaseComponent.mod.Provider
import typings.firebaseFunctions.firebaseFunctionsStrings.`auth-internal`
import typings.firebaseFunctions.firebaseFunctionsStrings.messaging
import typings.firebaseFunctions.mod.FirebaseApp
import typings.firebaseFunctions.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@firebase/functions/dist/test/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createTestService(app: FirebaseApp): Service = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any]).asInstanceOf[Service]
  @scala.inline
  def createTestService(app: FirebaseApp, regionOrCustomDomain: String): Service = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any])).asInstanceOf[Service]
  @scala.inline
  def createTestService(
    app: FirebaseApp,
    regionOrCustomDomain: String,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[messaging]
  ): Service = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any])).asInstanceOf[Service]
  @scala.inline
  def createTestService(
    app: FirebaseApp,
    regionOrCustomDomain: Unit,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[messaging]
  ): Service = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any])).asInstanceOf[Service]
  
  @scala.inline
  def createTestService_authinternal(app: FirebaseApp, regionOrCustomDomain: String, authProvider: Provider[`auth-internal`]): Service = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any])).asInstanceOf[Service]
  @scala.inline
  def createTestService_authinternal(app: FirebaseApp, regionOrCustomDomain: Unit, authProvider: Provider[`auth-internal`]): Service = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any])).asInstanceOf[Service]
  
  @scala.inline
  def createTestService_messaging(
    app: FirebaseApp,
    regionOrCustomDomain: String,
    authProvider: Unit,
    messagingProvider: Provider[messaging]
  ): Service = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any])).asInstanceOf[Service]
  @scala.inline
  def createTestService_messaging(
    app: FirebaseApp,
    regionOrCustomDomain: Unit,
    authProvider: Unit,
    messagingProvider: Provider[messaging]
  ): Service = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestService")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], messagingProvider.asInstanceOf[js.Any])).asInstanceOf[Service]
  
  @scala.inline
  def makeFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeApp")().asInstanceOf[FirebaseApp]
  @scala.inline
  def makeFakeApp(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFakeApp")(options.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
}
