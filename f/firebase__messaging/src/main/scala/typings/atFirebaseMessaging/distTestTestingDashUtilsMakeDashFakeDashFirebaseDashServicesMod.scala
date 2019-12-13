package typings.atFirebaseMessaging

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseOptions
import typings.atFirebaseComponent.atFirebaseComponentMod.Provider
import typings.atFirebaseInstallationsDashTypes.atFirebaseInstallationsDashTypesMod.FirebaseInstallations
import typings.atFirebaseMessaging.distSrcInterfacesInternalDashServicesMod.FirebaseInternalServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/test/testing-utils/make-fake-firebase-services", JSImport.Namespace)
@js.native
object distTestTestingDashUtilsMakeDashFakeDashFirebaseDashServicesMod extends js.Object {
  def makeFakeAnalyticsProvider(): Provider[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
  ] = js.native
  def makeFakeApp(): FirebaseApp = js.native
  def makeFakeApp(options: FirebaseOptions): FirebaseApp = js.native
  def makeFakeFirebaseInternalServices(): FirebaseInternalServices = js.native
  def makeFakeFirebaseInternalServices(options: FirebaseOptions): FirebaseInternalServices = js.native
  def makeFakeInstallations(): FirebaseInstallations = js.native
}

