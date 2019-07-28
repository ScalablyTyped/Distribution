package typings.egg.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def start(): js.Promise[typings.eggDashView.eggMod.Application] = js.native
  def start(options: StartOptions): js.Promise[typings.eggDashView.eggMod.Application] = js.native
  def startCluster(options: ClusterOptions, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}

