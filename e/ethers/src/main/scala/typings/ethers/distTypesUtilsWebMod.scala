package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.ConnectionInfo
import typings.ethers.distTypesUtilsTypesMod.PollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/web", JSImport.Namespace)
@js.native
object distTypesUtilsWebMod extends js.Object {
  def fetchJson(connection: String, json: String, processFunc: js.Function1[/* value */ js.Any, _]): js.Promise[_] = js.native
  def fetchJson(connection: ConnectionInfo, json: String, processFunc: js.Function1[/* value */ js.Any, _]): js.Promise[_] = js.native
  def poll(func: js.Function0[js.Promise[_]]): js.Promise[_] = js.native
  def poll(func: js.Function0[js.Promise[_]], options: PollOptions): js.Promise[_] = js.native
}

