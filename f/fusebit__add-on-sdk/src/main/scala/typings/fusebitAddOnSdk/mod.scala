package typings.fusebitAddOnSdk

import org.scalablytyped.runtime.StringDictionary
import typings.fusebitAddOnSdk.anon.Caller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fusebit/add-on-sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStorageClient(ctx: FusebitContext, accessToken: String, storageIdPrefix: String): js.Promise[StorageClient] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStorageClient")(ctx.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any], storageIdPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StorageClient]]
  
  inline def debug(message: String, params: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(message.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def getFunctionUrl(ctx: FusebitContext, accessToken: String, boundaryId: String, functionId: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionUrl")(ctx.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any], boundaryId.asInstanceOf[js.Any], functionId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait FusebitContext extends StObject {
    
    var accountId: String
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[Any] = js.undefined
    
    var boundaryId: String
    
    var configuration: StringDictionary[String]
    
    var functionId: String
    
    var fusebit: Caller
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var method: Method
    
    var path: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var storage: StorageClient
    
    var subscriptionId: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object FusebitContext {
    
    inline def apply(
      accountId: String,
      boundaryId: String,
      configuration: StringDictionary[String],
      functionId: String,
      fusebit: Caller,
      method: Method,
      storage: StorageClient,
      subscriptionId: String
    ): FusebitContext = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], boundaryId = boundaryId.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], functionId = functionId.asInstanceOf[js.Any], fusebit = fusebit.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FusebitContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FusebitContext] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBoundaryId(value: String): Self = StObject.set(x, "boundaryId", value.asInstanceOf[js.Any])
      
      inline def setConfiguration(value: StringDictionary[String]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setFunctionId(value: String): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
      
      inline def setFusebit(value: Caller): Self = StObject.set(x, "fusebit", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setQuery(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setStorage(value: StorageClient): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait ListStorageOptions extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var next: js.UndefOr[String] = js.undefined
  }
  object ListStorageOptions {
    
    inline def apply(): ListStorageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListStorageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListStorageOptions] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait ListStorageResult extends StObject {
    
    var items: js.Array[StorageItem]
    
    var next: js.UndefOr[String] = js.undefined
  }
  object ListStorageResult {
    
    inline def apply(items: js.Array[StorageItem]): ListStorageResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListStorageResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListStorageResult] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[StorageItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: StorageItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.GET
    - typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.POST
    - typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.PUT
    - typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.DELETE
    - typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.CRON
  */
  trait Method extends StObject
  object Method {
    
    inline def CRON: typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.CRON = "CRON".asInstanceOf[typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.CRON]
    
    inline def DELETE: typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.DELETE = "DELETE".asInstanceOf[typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.DELETE]
    
    inline def GET: typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.GET = "GET".asInstanceOf[typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.GET]
    
    inline def POST: typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.POST = "POST".asInstanceOf[typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.POST]
    
    inline def PUT: typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.PUT = "PUT".asInstanceOf[typings.fusebitAddOnSdk.fusebitAddOnSdkStrings.PUT]
  }
  
  @js.native
  trait StorageClient extends StObject {
    
    // https://fusebit.io/docs/reference/fusebit-http-api/#operation/deleteStorage
    def delete(storageSubId: String): js.Promise[Unit] = js.native
    def delete(storageSubId: String, recursive: Boolean): js.Promise[Unit] = js.native
    def delete(storageSubId: String, recursive: Boolean, forceRecursive: Boolean): js.Promise[Unit] = js.native
    def delete(storageSubId: String, recursive: Unit, forceRecursive: Boolean): js.Promise[Unit] = js.native
    
    // https://fusebit.io/docs/reference/fusebit-http-api/#operation/getStorage
    def get(storageSubId: String): js.Promise[StorageDataObject] = js.native
    
    // https://fusebit.io/docs/reference/fusebit-http-api/#operation/getStorageList
    def list(storageSubId: String): js.Promise[ListStorageResult] = js.native
    def list(storageSubId: String, options: ListStorageOptions): js.Promise[ListStorageResult] = js.native
    
    // https://fusebit.io/docs/reference/fusebit-http-api/#operation/putStorage
    def put(data: Any, storageSubId: String): js.Promise[StorageDataObject] = js.native
  }
  
  trait StorageDataObject extends StObject {
    
    var data: Any
    
    var etag: String
    
    var expires: String
    
    var tags: js.Object
  }
  object StorageDataObject {
    
    inline def apply(data: Any, etag: String, expires: String, tags: js.Object): StorageDataObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageDataObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageDataObject] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Object): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageItem extends StObject {
    
    var etag: String
    
    var expires: String
    
    var storageId: String
    
    var tags: js.Object
  }
  object StorageItem {
    
    inline def apply(etag: String, expires: String, storageId: String, tags: js.Object): StorageItem = {
      val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], storageId = storageId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageItem] (val x: Self) extends AnyVal {
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setStorageId(value: String): Self = StObject.set(x, "storageId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Object): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
