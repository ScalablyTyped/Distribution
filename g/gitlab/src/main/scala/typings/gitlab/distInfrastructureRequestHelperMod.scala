package typings.gitlab

import typings.gitlab.distInfrastructureBaseServiceMod.BaseService
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.DelResponse
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.PostResponse
import typings.gitlab.distInfrastructureMod.PutResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/infrastructure/RequestHelper", JSImport.Namespace)
@js.native
object distInfrastructureRequestHelperMod extends js.Object {
  def del(service: BaseService, endpoint: String): js.Promise[DelResponse] = js.native
  def del(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[DelResponse] = js.native
  def get(service: BaseService, endpoint: String): js.Promise[GetResponse] = js.native
  def get(service: BaseService, endpoint: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def post(service: BaseService, endpoint: String): js.Promise[PostResponse] = js.native
  def post(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PostResponse] = js.native
  def put(service: BaseService, endpoint: String): js.Promise[PutResponse] = js.native
  def put(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PutResponse] = js.native
  def stream(service: BaseService, endpoint: String): js.Any = js.native
  def stream(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Any = js.native
}

