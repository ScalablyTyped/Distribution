package typings.firebaseFunctions

import typings.firebaseComponent.mod.Provider
import typings.firebaseFunctions.firebaseFunctionsStrings.`auth-internal`
import typings.firebaseFunctions.firebaseFunctionsStrings.messaging
import typings.firebaseFunctions.mod.FirebaseApp
import typings.firebaseFunctions.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/functions/dist/test/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def createTestService(app: FirebaseApp): Service = js.native
  def createTestService(
    app: FirebaseApp,
    regionOrCustomDomain: js.UndefOr[scala.Nothing],
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  def createTestService(app: FirebaseApp, regionOrCustomDomain: String): Service = js.native
  def createTestService(
    app: FirebaseApp,
    regionOrCustomDomain: String,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  @JSName("createTestService")
  def createTestService_authinternal(
    app: FirebaseApp,
    regionOrCustomDomain: js.UndefOr[scala.Nothing],
    authProvider: Provider[`auth-internal`]
  ): Service = js.native
  @JSName("createTestService")
  def createTestService_authinternal(app: FirebaseApp, regionOrCustomDomain: String, authProvider: Provider[`auth-internal`]): Service = js.native
  @JSName("createTestService")
  def createTestService_messaging(
    app: FirebaseApp,
    regionOrCustomDomain: js.UndefOr[scala.Nothing],
    authProvider: js.UndefOr[scala.Nothing],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  @JSName("createTestService")
  def createTestService_messaging(
    app: FirebaseApp,
    regionOrCustomDomain: String,
    authProvider: js.UndefOr[scala.Nothing],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  
  def makeFakeApp(): FirebaseApp = js.native
  def makeFakeApp(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseApp = js.native
}
