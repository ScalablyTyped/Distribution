package typings
package gitlabLib.distLatestServicesBroadcastMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastMessages
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def create(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def edit(
    broadcastMessageId: BroadcastMessageId,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(broadcastMessageId: BroadcastMessageId): js.Promise[_] = js.native
  def show(
    broadcastMessageId: BroadcastMessageId,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
}

