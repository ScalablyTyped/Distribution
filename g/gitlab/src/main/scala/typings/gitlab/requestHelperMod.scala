package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import typings.gitlab.baseServiceMod.BaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestHelperMod {
  
  object RequestHelper {
    
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.del")
    @js.native
    def del: js.Function3[
        /* service */ BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[DelResponse]
      ] = js.native
    inline def del(service: BaseService, endpoint: String): js.Promise[DelResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DelResponse]]
    inline def del(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[DelResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DelResponse]]
    inline def del_=(
      x: js.Function3[
          /* service */ BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[DelResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("del")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.get")
    @js.native
    def get: js.Function3[
        /* service */ BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[PaginatedRequestOptions], 
        js.Promise[GetResponse]
      ] = js.native
    inline def get(service: BaseService, endpoint: String): js.Promise[GetResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResponse]]
    inline def get(service: BaseService, endpoint: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResponse]]
    inline def get_=(
      x: js.Function3[
          /* service */ BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[PaginatedRequestOptions], 
          js.Promise[GetResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.post")
    @js.native
    def post: js.Function3[
        /* service */ BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PostResponse]
      ] = js.native
    inline def post(service: BaseService, endpoint: String): js.Promise[PostResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PostResponse]]
    inline def post(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PostResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PostResponse]]
    inline def post_=(
      x: js.Function3[
          /* service */ BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[PostResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("post")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.put")
    @js.native
    def put: js.Function3[
        /* service */ BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PutResponse]
      ] = js.native
    inline def put(service: BaseService, endpoint: String): js.Promise[PutResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutResponse]]
    inline def put(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PutResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutResponse]]
    inline def put_=(
      x: js.Function3[
          /* service */ BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[PutResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("put")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.stream")
    @js.native
    def stream: js.Function3[
        /* service */ BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Any
      ] = js.native
    inline def stream(service: BaseService, endpoint: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def stream(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def stream_=(
      x: js.Function3[
          /* service */ BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
  }
  
  trait BaseRequestOptions
    extends StObject
       with Sudo
       with /* key */ StringDictionary[js.Any]
  object BaseRequestOptions {
    
    inline def apply(): BaseRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseRequestOptions]
    }
  }
  
  type DelResponse = js.Object
  
  type GetResponse = PaginationResponse | js.Object | js.Array[js.Object]
  
  trait PaginatedRequestOptions
    extends StObject
       with BaseRequestOptions {
    
    var maxPages: js.UndefOr[Double] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var perPage: js.UndefOr[Double] = js.undefined
    
    var showPagination: js.UndefOr[Boolean] = js.undefined
  }
  object PaginatedRequestOptions {
    
    inline def apply(): PaginatedRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginatedRequestOptions]
    }
    
    extension [Self <: PaginatedRequestOptions](x: Self) {
      
      inline def setMaxPages(value: Double): Self = StObject.set(x, "maxPages", value.asInstanceOf[js.Any])
      
      inline def setMaxPagesUndefined: Self = StObject.set(x, "maxPages", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
      
      inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
      
      inline def setShowPagination(value: Boolean): Self = StObject.set(x, "showPagination", value.asInstanceOf[js.Any])
      
      inline def setShowPaginationUndefined: Self = StObject.set(x, "showPagination", js.undefined)
    }
  }
  
  trait PaginationOptions extends StObject {
    
    var current: Double
    
    var next: Double | Null
    
    var perPage: Double
    
    var previous: Double | Null
    
    var total: Double
    
    var totalPages: Double
  }
  object PaginationOptions {
    
    inline def apply(current: Double, perPage: Double, total: Double, totalPages: Double): PaginationOptions = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], perPage = perPage.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], next = null, previous = null)
      __obj.asInstanceOf[PaginationOptions]
    }
    
    extension [Self <: PaginationOptions](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousNull: Self = StObject.set(x, "previous", null)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationResponse extends StObject {
    
    var data: js.Array[js.Object]
    
    var pagination: PaginationOptions
  }
  object PaginationResponse {
    
    inline def apply(data: js.Array[js.Object], pagination: PaginationOptions): PaginationResponse = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationResponse]
    }
    
    extension [Self <: PaginationResponse](x: Self) {
      
      inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setPagination(value: PaginationOptions): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    }
  }
  
  type PostResponse = js.Object
  
  type PutResponse = js.Object
  
  trait Sudo extends StObject {
    
    var sudo: js.UndefOr[String | Double] = js.undefined
  }
  object Sudo {
    
    inline def apply(): Sudo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sudo]
    }
    
    extension [Self <: Sudo](x: Self) {
      
      inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
      
      inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
    }
  }
}
