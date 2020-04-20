package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.DelResponse
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.PostResponse
import typings.gitlab.requestHelperMod.PutResponse
import typings.gitlab.utilsMod.Bundle
import typings.gitlab.utilsMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/infrastructure", JSImport.Namespace)
@js.native
object infrastructureMod extends js.Object {
  @js.native
  class BaseService ()
    extends typings.gitlab.baseServiceMod.BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
  }
  
  def bundler[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */](services: T): Bundle[T, P] = js.native
  @js.native
  object RequestHelper extends js.Object {
    @JSName("del")
    var del_Original: js.Function3[
        /* service */ typings.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[DelResponse]
      ] = js.native
    @JSName("get")
    var get_Original: js.Function3[
        /* service */ typings.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[PaginatedRequestOptions], 
        js.Promise[GetResponse]
      ] = js.native
    @JSName("post")
    var post_Original: js.Function3[
        /* service */ typings.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PostResponse]
      ] = js.native
    @JSName("put")
    var put_Original: js.Function3[
        /* service */ typings.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PutResponse]
      ] = js.native
    @JSName("stream")
    var stream_Original: js.Function3[
        /* service */ typings.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        _
      ] = js.native
    def del(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[DelResponse] = js.native
    def del(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[DelResponse] = js.native
    def get(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[GetResponse] = js.native
    def get(
      service: typings.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    def post(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[PostResponse] = js.native
    def post(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PostResponse] = js.native
    def put(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[PutResponse] = js.native
    def put(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PutResponse] = js.native
    def stream(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Any = js.native
    def stream(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Any = js.native
  }
  
}

