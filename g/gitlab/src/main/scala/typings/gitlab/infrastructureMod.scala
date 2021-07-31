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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infrastructureMod {
  
  @JSImport("gitlab/dist/types/core/infrastructure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    @scala.inline
    def del(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[DelResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DelResponse]]
    @scala.inline
    def del(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[DelResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DelResponse]]
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
    @scala.inline
    def get(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[GetResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResponse]]
    @scala.inline
    def get(
      service: typings.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: PaginatedRequestOptions
    ): js.Promise[GetResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResponse]]
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
    @scala.inline
    def post(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[PostResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PostResponse]]
    @scala.inline
    def post(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PostResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PostResponse]]
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
    @scala.inline
    def put(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[PutResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutResponse]]
    @scala.inline
    def put(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PutResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutResponse]]
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
    @scala.inline
    def stream(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def stream(service: typings.gitlab.baseServiceMod.BaseService, endpoint: String, options: BaseRequestOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
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
  
  @scala.inline
  def bundler[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */](services: T): Bundle[T, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundler")(services.asInstanceOf[js.Any]).asInstanceOf[Bundle[T, P]]
}
