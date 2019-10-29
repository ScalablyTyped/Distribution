package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.DelResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PostResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PutResponse
import typings.gitlab.distTypesCoreInfrastructureUtilsMod.Bundle
import typings.gitlab.distTypesCoreInfrastructureUtilsMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/infrastructure", JSImport.Namespace)
@js.native
object distTypesCoreInfrastructureMod extends js.Object {
  @js.native
  class BaseService ()
    extends typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
  }
  
  def bundler[T /* <: StringDictionary[Constructor] */, P /* <: String */](services: T): Bundle[T, P] = js.native
  @js.native
  object RequestHelper extends js.Object {
    @JSName("del")
    var del_Original: js.Function3[
        /* service */ typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[DelResponse]
      ] = js.native
    @JSName("get")
    var get_Original: js.Function3[
        /* service */ typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[PaginatedRequestOptions], 
        js.Promise[GetResponse]
      ] = js.native
    @JSName("post")
    var post_Original: js.Function3[
        /* service */ typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PostResponse]
      ] = js.native
    @JSName("put")
    var put_Original: js.Function3[
        /* service */ typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PutResponse]
      ] = js.native
    @JSName("stream")
    var stream_Original: js.Function3[
        /* service */ typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        _
      ] = js.native
    def del(service: typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, endpoint: String): js.Promise[DelResponse] = js.native
    def del(
      service: typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[DelResponse] = js.native
    def get(service: typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, endpoint: String): js.Promise[GetResponse] = js.native
    def get(
      service: typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    def post(service: typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, endpoint: String): js.Promise[PostResponse] = js.native
    def post(
      service: typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PostResponse] = js.native
    def put(service: typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, endpoint: String): js.Promise[PutResponse] = js.native
    def put(
      service: typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PutResponse] = js.native
    def stream(service: typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, endpoint: String): js.Any = js.native
    def stream(
      service: typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Any = js.native
  }
  
}

