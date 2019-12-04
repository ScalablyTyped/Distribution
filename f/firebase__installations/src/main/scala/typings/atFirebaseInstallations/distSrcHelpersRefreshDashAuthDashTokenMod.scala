package typings.atFirebaseInstallations

import typings.atFirebaseInstallations.distSrcInterfacesAppDashConfigMod.AppConfig
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.CompletedAuthToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/helpers/refresh-auth-token", JSImport.Namespace)
@js.native
object distSrcHelpersRefreshDashAuthDashTokenMod extends js.Object {
  def refreshAuthToken(appConfig: AppConfig): js.Promise[CompletedAuthToken] = js.native
  def refreshAuthToken(appConfig: AppConfig, forceRefresh: Boolean): js.Promise[CompletedAuthToken] = js.native
}

