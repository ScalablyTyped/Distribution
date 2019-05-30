package typings
package gitlabLib.distServicesBroadcastMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastMessages
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(): js.Promise[js.Object] = js.native
  def create(options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(broadcastMessageId: gitlabLib.BroadcastMessageId): js.Promise[js.Object] = js.native
  def edit(broadcastMessageId: gitlabLib.BroadcastMessageId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(broadcastMessageId: gitlabLib.BroadcastMessageId): js.Promise[js.Object] = js.native
  def show(broadcastMessageId: gitlabLib.BroadcastMessageId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(broadcastMessageId: gitlabLib.BroadcastMessageId, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
}

