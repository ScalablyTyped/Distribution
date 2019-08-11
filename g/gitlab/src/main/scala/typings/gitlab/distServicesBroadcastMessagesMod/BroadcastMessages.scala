package typings.gitlab.distServicesBroadcastMessagesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesMod.BroadcastMessageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastMessages extends BaseService {
  def all(): js.Promise[GetResponse] = js.native
  def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def create(): js.Promise[js.Object] = js.native
  def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(broadcastMessageId: BroadcastMessageId): js.Promise[js.Object] = js.native
  def edit(broadcastMessageId: BroadcastMessageId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(broadcastMessageId: BroadcastMessageId): js.Promise[js.Object] = js.native
  def show(broadcastMessageId: BroadcastMessageId): js.Promise[GetResponse] = js.native
  def show(broadcastMessageId: BroadcastMessageId, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
}

