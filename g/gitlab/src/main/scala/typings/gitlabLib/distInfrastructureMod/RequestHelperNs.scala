package typings
package gitlabLib.distInfrastructureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/infrastructure", "RequestHelper")
@js.native
object RequestHelperNs extends js.Object {
  def del(service: gitlabLib.distInfrastructureBaseServiceMod.BaseService, endpoint: java.lang.String): js.Promise[gitlabLib.DelResponse] = js.native
  def del(
    service: gitlabLib.distInfrastructureBaseServiceMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[gitlabLib.DelResponse] = js.native
  def get(service: gitlabLib.distInfrastructureBaseServiceMod.BaseService, endpoint: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def get(
    service: gitlabLib.distInfrastructureBaseServiceMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.PaginatedRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def post(service: gitlabLib.distInfrastructureBaseServiceMod.BaseService, endpoint: java.lang.String): js.Promise[gitlabLib.PostResponse] = js.native
  def post(
    service: gitlabLib.distInfrastructureBaseServiceMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[gitlabLib.PostResponse] = js.native
  def put(service: gitlabLib.distInfrastructureBaseServiceMod.BaseService, endpoint: java.lang.String): js.Promise[gitlabLib.PutResponse] = js.native
  def put(
    service: gitlabLib.distInfrastructureBaseServiceMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[gitlabLib.PutResponse] = js.native
  def stream(service: gitlabLib.distInfrastructureBaseServiceMod.BaseService, endpoint: java.lang.String): js.Any = js.native
  def stream(
    service: gitlabLib.distInfrastructureBaseServiceMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Any = js.native
}

