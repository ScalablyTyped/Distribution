package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureBaseServiceMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.DelResponse
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.PostResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PutResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/infrastructure/RequestHelper", JSImport.Namespace)
@js.native
object distSrcCoreInfrastructureRequestHelperMod extends js.Object {
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

