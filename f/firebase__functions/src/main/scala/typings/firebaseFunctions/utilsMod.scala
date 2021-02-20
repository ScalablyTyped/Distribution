package typings.firebaseFunctions

import typings.firebaseComponent.mod.Provider
import typings.firebaseFunctions.firebaseFunctionsStrings.`auth-internal`
import typings.firebaseFunctions.firebaseFunctionsStrings.messaging
import typings.firebaseFunctions.mod.FirebaseApp
import typings.firebaseFunctions.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@firebase/functions/dist/test/utils", "createTestService")
  @js.native
  def createTestService(app: FirebaseApp): Service = js.native
  @JSImport("@firebase/functions/dist/test/utils", "createTestService")
  @js.native
  def createTestService(
    app: FirebaseApp,
    regionOrCustomDomain: js.UndefOr[scala.Nothing],
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  @JSImport("@firebase/functions/dist/test/utils", "createTestService")
  @js.native
  def createTestService(app: FirebaseApp, regionOrCustomDomain: String): Service = js.native
  @JSImport("@firebase/functions/dist/test/utils", "createTestService")
  @js.native
  def createTestService(
    app: FirebaseApp,
    regionOrCustomDomain: String,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  @JSImport("@firebase/functions/dist/test/utils", "createTestService")
  @js.native
  def createTestService_authinternal(
    app: FirebaseApp,
    regionOrCustomDomain: js.UndefOr[scala.Nothing],
    authProvider: Provider[`auth-internal`]
  ): Service = js.native
  @JSImport("@firebase/functions/dist/test/utils", "createTestService")
  @js.native
  def createTestService_authinternal(app: FirebaseApp, regionOrCustomDomain: String, authProvider: Provider[`auth-internal`]): Service = js.native
  @JSImport("@firebase/functions/dist/test/utils", "createTestService")
  @js.native
  def createTestService_messaging(
    app: FirebaseApp,
    regionOrCustomDomain: js.UndefOr[scala.Nothing],
    authProvider: js.UndefOr[scala.Nothing],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  @JSImport("@firebase/functions/dist/test/utils", "createTestService")
  @js.native
  def createTestService_messaging(
    app: FirebaseApp,
    regionOrCustomDomain: String,
    authProvider: js.UndefOr[scala.Nothing],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  
  @JSImport("@firebase/functions/dist/test/utils", "makeFakeApp")
  @js.native
  def makeFakeApp(): FirebaseApp = js.native
  @JSImport("@firebase/functions/dist/test/utils", "makeFakeApp")
  @js.native
  def makeFakeApp(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseApp = js.native
}
