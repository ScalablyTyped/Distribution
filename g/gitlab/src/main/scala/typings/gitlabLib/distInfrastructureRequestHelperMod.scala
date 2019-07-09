package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/infrastructure/RequestHelper", JSImport.Namespace)
@js.native
object distInfrastructureRequestHelperMod extends js.Object {
  def del(service: gitlabLib.distInfrastructureBaseServiceMod.BaseService, endpoint: java.lang.String): js.Promise[gitlabLib.distInfrastructureMod.DelResponse] = js.native
  def del(
    service: gitlabLib.distInfrastructureBaseServiceMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[gitlabLib.distInfrastructureMod.DelResponse] = js.native
  def get(service: gitlabLib.distInfrastructureBaseServiceMod.BaseService, endpoint: java.lang.String): js.Promise[gitlabLib.distInfrastructureMod.GetResponse] = js.native
  def get(
    service: gitlabLib.distInfrastructureBaseServiceMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[gitlabLib.distInfrastructureMod.GetResponse] = js.native
  def post(service: gitlabLib.distInfrastructureBaseServiceMod.BaseService, endpoint: java.lang.String): js.Promise[gitlabLib.distInfrastructureMod.PostResponse] = js.native
  def post(
    service: gitlabLib.distInfrastructureBaseServiceMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[gitlabLib.distInfrastructureMod.PostResponse] = js.native
  def put(service: gitlabLib.distInfrastructureBaseServiceMod.BaseService, endpoint: java.lang.String): js.Promise[gitlabLib.distInfrastructureMod.PutResponse] = js.native
  def put(
    service: gitlabLib.distInfrastructureBaseServiceMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[gitlabLib.distInfrastructureMod.PutResponse] = js.native
  def stream(service: gitlabLib.distInfrastructureBaseServiceMod.BaseService, endpoint: java.lang.String): js.Any = js.native
  def stream(
    service: gitlabLib.distInfrastructureBaseServiceMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Any = js.native
}

