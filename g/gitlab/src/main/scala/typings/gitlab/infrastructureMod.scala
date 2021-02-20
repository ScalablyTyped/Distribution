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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infrastructureMod {
  
  @JSImport("gitlab/dist/types/core/infrastructure", "BaseService")
  @js.native
  class BaseService ()
    extends typings.gitlab.baseServiceMod.BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
  }
  
  object RequestHelper {
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.del")
    @js.native
    def del: js.Function3[
        /* service */ typings.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[DelResponse]
      ] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.del")
    @js.native
    def del(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[DelResponse] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.del")
    @js.native
    def del(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[DelResponse] = js.native
    @scala.inline
    def del_=(
      x: js.Function3[
          /* service */ typings.gitlab.baseServiceMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[DelResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("del")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.get")
    @js.native
    def get: js.Function3[
        /* service */ typings.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[PaginatedRequestOptions], 
        js.Promise[GetResponse]
      ] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.get")
    @js.native
    def get(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[GetResponse] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.get")
    @js.native
    def get(
      service: typings.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    @scala.inline
    def get_=(
      x: js.Function3[
          /* service */ typings.gitlab.baseServiceMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[PaginatedRequestOptions], 
          js.Promise[GetResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.post")
    @js.native
    def post: js.Function3[
        /* service */ typings.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PostResponse]
      ] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.post")
    @js.native
    def post(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[PostResponse] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.post")
    @js.native
    def post(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PostResponse] = js.native
    @scala.inline
    def post_=(
      x: js.Function3[
          /* service */ typings.gitlab.baseServiceMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[PostResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("post")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.put")
    @js.native
    def put: js.Function3[
        /* service */ typings.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PutResponse]
      ] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.put")
    @js.native
    def put(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[PutResponse] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.put")
    @js.native
    def put(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PutResponse] = js.native
    @scala.inline
    def put_=(
      x: js.Function3[
          /* service */ typings.gitlab.baseServiceMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[PutResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("put")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.stream")
    @js.native
    def stream: js.Function3[
        /* service */ typings.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Any
      ] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.stream")
    @js.native
    def stream(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Any = js.native
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.stream")
    @js.native
    def stream(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Any = js.native
    @scala.inline
    def stream_=(
      x: js.Function3[
          /* service */ typings.gitlab.baseServiceMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("gitlab/dist/types/core/infrastructure", "bundler")
  @js.native
  def bundler[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */](services: T): Bundle[T, P] = js.native
}
