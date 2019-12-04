package typings.atFirebaseInstallations

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/functions", JSImport.Namespace)
@js.native
object distSrcFunctionsMod extends js.Object {
  def deleteInstallation(app: FirebaseApp): js.Promise[Unit] = js.native
  def getId(app: FirebaseApp): js.Promise[String] = js.native
  def getToken(app: FirebaseApp): js.Promise[String] = js.native
  def getToken(app: FirebaseApp, forceRefresh: Boolean): js.Promise[String] = js.native
}

