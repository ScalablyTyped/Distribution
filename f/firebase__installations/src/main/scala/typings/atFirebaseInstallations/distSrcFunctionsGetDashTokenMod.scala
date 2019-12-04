package typings.atFirebaseInstallations

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/functions/get-token", JSImport.Namespace)
@js.native
object distSrcFunctionsGetDashTokenMod extends js.Object {
  def getToken(app: FirebaseApp): js.Promise[String] = js.native
  def getToken(app: FirebaseApp, forceRefresh: Boolean): js.Promise[String] = js.native
}

