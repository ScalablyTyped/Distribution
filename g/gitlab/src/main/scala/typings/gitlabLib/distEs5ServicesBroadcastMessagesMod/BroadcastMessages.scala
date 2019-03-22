package typings
package gitlabLib.distEs5ServicesBroadcastMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastMessages
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def create(options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def edit(
    broadcastMessageId: BroadcastMessageId,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(broadcastMessageId: BroadcastMessageId): js.Promise[_] = js.native
  def show(
    broadcastMessageId: BroadcastMessageId,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
}

