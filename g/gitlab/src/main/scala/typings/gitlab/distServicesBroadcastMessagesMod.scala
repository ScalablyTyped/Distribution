package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesBroadcastMessagesMod.BroadcastMessages
import typings.gitlab.distServicesMod.BroadcastMessageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/BroadcastMessages", JSImport.Namespace)
@js.native
object distServicesBroadcastMessagesMod extends js.Object {
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
  
  @js.native
  class default () extends BroadcastMessages
  
}

