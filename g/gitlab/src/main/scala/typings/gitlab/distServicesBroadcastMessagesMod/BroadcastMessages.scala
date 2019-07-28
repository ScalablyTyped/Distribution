package typings.gitlab.distServicesBroadcastMessagesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesMod.BroadcastMessageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastMessages extends BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(): js.Promise[js.Object] = js.native
  def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(broadcastMessageId: BroadcastMessageId): js.Promise[js.Object] = js.native
  def edit(broadcastMessageId: BroadcastMessageId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(broadcastMessageId: BroadcastMessageId): js.Promise[js.Object] = js.native
  def show(broadcastMessageId: BroadcastMessageId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(broadcastMessageId: BroadcastMessageId, options: BaseRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

