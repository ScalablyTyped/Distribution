package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import typings.gitlab.baseServiceMod.BaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.del")
    @js.native
    def del(service: BaseService, endpoint: String): js.Promise[DelResponse] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.del")
    @js.native
    def del(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[DelResponse] = js.native
    @scala.inline
    def del_=(
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
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.get")
    @js.native
    def get(service: BaseService, endpoint: String): js.Promise[GetResponse] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.get")
    @js.native
    def get(service: BaseService, endpoint: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    @scala.inline
    def get_=(
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
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.post")
    @js.native
    def post(service: BaseService, endpoint: String): js.Promise[PostResponse] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.post")
    @js.native
    def post(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PostResponse] = js.native
    @scala.inline
    def post_=(
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
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.put")
    @js.native
    def put(service: BaseService, endpoint: String): js.Promise[PutResponse] = js.native
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.put")
    @js.native
    def put(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Promise[PutResponse] = js.native
    @scala.inline
    def put_=(
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
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.stream")
    @js.native
    def stream(service: BaseService, endpoint: String): js.Any = js.native
    @JSImport("gitlab/dist/types/core/infrastructure/RequestHelper", "RequestHelper.stream")
    @js.native
    def stream(service: BaseService, endpoint: String, options: BaseRequestOptions): js.Any = js.native
    @scala.inline
    def stream_=(
      x: js.Function3[
          /* service */ BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BaseRequestOptions
    extends Sudo
       with /* key */ StringDictionary[js.Any]
  object BaseRequestOptions {
    
    @scala.inline
    def apply(): BaseRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseRequestOptions]
    }
  }
  
  type DelResponse = js.Object
  
  type GetResponse = PaginationResponse | js.Object | js.Array[js.Object]
  
  @js.native
  trait PaginatedRequestOptions extends BaseRequestOptions {
    
    var maxPages: js.UndefOr[Double] = js.native
    
    var page: js.UndefOr[Double] = js.native
    
    var perPage: js.UndefOr[Double] = js.native
    
    var showPagination: js.UndefOr[Boolean] = js.native
  }
  object PaginatedRequestOptions {
    
    @scala.inline
    def apply(): PaginatedRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginatedRequestOptions]
    }
    
    @scala.inline
    implicit class PaginatedRequestOptionsMutableBuilder[Self <: PaginatedRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxPages(value: Double): Self = StObject.set(x, "maxPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPagesUndefined: Self = StObject.set(x, "maxPages", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
      
      @scala.inline
      def setShowPagination(value: Boolean): Self = StObject.set(x, "showPagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPaginationUndefined: Self = StObject.set(x, "showPagination", js.undefined)
    }
  }
  
  @js.native
  trait PaginationOptions extends StObject {
    
    var current: Double = js.native
    
    var next: Double | Null = js.native
    
    var perPage: Double = js.native
    
    var previous: Double | Null = js.native
    
    var total: Double = js.native
    
    var totalPages: Double = js.native
  }
  object PaginationOptions {
    
    @scala.inline
    def apply(current: Double, perPage: Double, total: Double, totalPages: Double): PaginationOptions = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], perPage = perPage.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationOptions]
    }
    
    @scala.inline
    implicit class PaginationOptionsMutableBuilder[Self <: PaginationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
      
      @scala.inline
      def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousNull: Self = StObject.set(x, "previous", null)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaginationResponse extends StObject {
    
    var data: js.Array[js.Object] = js.native
    
    var pagination: PaginationOptions = js.native
  }
  object PaginationResponse {
    
    @scala.inline
    def apply(data: js.Array[js.Object], pagination: PaginationOptions): PaginationResponse = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationResponse]
    }
    
    @scala.inline
    implicit class PaginationResponseMutableBuilder[Self <: PaginationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setPagination(value: PaginationOptions): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    }
  }
  
  type PostResponse = js.Object
  
  type PutResponse = js.Object
  
  @js.native
  trait Sudo extends StObject {
    
    var sudo: js.UndefOr[String | Double] = js.native
  }
  object Sudo {
    
    @scala.inline
    def apply(): Sudo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sudo]
    }
    
    @scala.inline
    implicit class SudoMutableBuilder[Self <: Sudo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
    }
  }
}
