package typings.gitlab.distInfrastructureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/infrastructure", "RequestHelper")
@js.native
object RequestHelperNs extends js.Object {
  def del(service: typings.gitlab.distInfrastructureBaseServiceMod.BaseService, endpoint: String): js.Promise[DelResponse] = js.native
  def del(
    service: typings.gitlab.distInfrastructureBaseServiceMod.BaseService,
    endpoint: String,
    options: BaseRequestOptions
  ): js.Promise[DelResponse] = js.native
  def get(service: typings.gitlab.distInfrastructureBaseServiceMod.BaseService, endpoint: String): js.Promise[GetResponse] = js.native
  def get(
    service: typings.gitlab.distInfrastructureBaseServiceMod.BaseService,
    endpoint: String,
    options: PaginatedRequestOptions
  ): js.Promise[GetResponse] = js.native
  def post(service: typings.gitlab.distInfrastructureBaseServiceMod.BaseService, endpoint: String): js.Promise[PostResponse] = js.native
  def post(
    service: typings.gitlab.distInfrastructureBaseServiceMod.BaseService,
    endpoint: String,
    options: BaseRequestOptions
  ): js.Promise[PostResponse] = js.native
  def put(service: typings.gitlab.distInfrastructureBaseServiceMod.BaseService, endpoint: String): js.Promise[PutResponse] = js.native
  def put(
    service: typings.gitlab.distInfrastructureBaseServiceMod.BaseService,
    endpoint: String,
    options: BaseRequestOptions
  ): js.Promise[PutResponse] = js.native
  def stream(service: typings.gitlab.distInfrastructureBaseServiceMod.BaseService, endpoint: String): js.Any = js.native
  def stream(
    service: typings.gitlab.distInfrastructureBaseServiceMod.BaseService,
    endpoint: String,
    options: BaseRequestOptions
  ): js.Any = js.native
}

