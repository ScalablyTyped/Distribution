package typings.atFirebaseInstallations

import typings.atFirebaseInstallations.distSrcInterfacesFirebaseDashDependenciesMod.FirebaseDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/functions", JSImport.Namespace)
@js.native
object distSrcFunctionsMod extends js.Object {
  def deleteInstallation(dependencies: FirebaseDependencies): js.Promise[Unit] = js.native
  def getId(dependencies: FirebaseDependencies): js.Promise[String] = js.native
  def getToken(dependencies: FirebaseDependencies): js.Promise[String] = js.native
  def getToken(dependencies: FirebaseDependencies, forceRefresh: Boolean): js.Promise[String] = js.native
}

