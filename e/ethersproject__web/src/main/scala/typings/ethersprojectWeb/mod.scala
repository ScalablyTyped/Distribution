package typings.ethersprojectWeb

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectWeb.ethersprojectWebStrings.block
import typings.ethersprojectWeb.ethersprojectWebStrings.poll
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchData[T](connection: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](connection: String, body: js.typedarray.Uint8Array): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](
    connection: String,
    body: js.typedarray.Uint8Array,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](
    connection: String,
    body: Unit,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](connection: ConnectionInfo): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](connection: ConnectionInfo, body: js.typedarray.Uint8Array): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](
    connection: ConnectionInfo,
    body: js.typedarray.Uint8Array,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](
    connection: ConnectionInfo,
    body: Unit,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def fetchJson(connection: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(connection: String, json: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(
    connection: String,
    json: String,
    processFunc: js.Function2[/* value */ Any, /* response */ FetchJsonResponse, Any]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(
    connection: String,
    json: Unit,
    processFunc: js.Function2[/* value */ Any, /* response */ FetchJsonResponse, Any]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(connection: ConnectionInfo): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(connection: ConnectionInfo, json: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(
    connection: ConnectionInfo,
    json: String,
    processFunc: js.Function2[/* value */ Any, /* response */ FetchJsonResponse, Any]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(
    connection: ConnectionInfo,
    json: Unit,
    processFunc: js.Function2[/* value */ Any, /* response */ FetchJsonResponse, Any]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def poll[T](func: js.Function0[js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("poll")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def poll[T](func: js.Function0[js.Promise[T]], options: PollOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("poll")(func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait ConnectionInfo extends StObject {
    
    var allowGzip: js.UndefOr[Boolean] = js.undefined
    
    var allowInsecureAuthentication: js.UndefOr[Boolean] = js.undefined
    
    var errorPassThrough: js.UndefOr[Boolean] = js.undefined
    
    var fetchOptions: js.UndefOr[Record[String, String]] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var skipFetchSetup: js.UndefOr[Boolean] = js.undefined
    
    var throttleCallback: js.UndefOr[js.Function2[/* attempt */ Double, /* url */ String, js.Promise[Boolean]]] = js.undefined
    
    var throttleLimit: js.UndefOr[Double] = js.undefined
    
    var throttleSlotInterval: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String
    
    var user: js.UndefOr[String] = js.undefined
  }
  object ConnectionInfo {
    
    inline def apply(url: String): ConnectionInfo = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
      
      inline def setAllowGzip(value: Boolean): Self = StObject.set(x, "allowGzip", value.asInstanceOf[js.Any])
      
      inline def setAllowGzipUndefined: Self = StObject.set(x, "allowGzip", js.undefined)
      
      inline def setAllowInsecureAuthentication(value: Boolean): Self = StObject.set(x, "allowInsecureAuthentication", value.asInstanceOf[js.Any])
      
      inline def setAllowInsecureAuthenticationUndefined: Self = StObject.set(x, "allowInsecureAuthentication", js.undefined)
      
      inline def setErrorPassThrough(value: Boolean): Self = StObject.set(x, "errorPassThrough", value.asInstanceOf[js.Any])
      
      inline def setErrorPassThroughUndefined: Self = StObject.set(x, "errorPassThrough", js.undefined)
      
      inline def setFetchOptions(value: Record[String, String]): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setSkipFetchSetup(value: Boolean): Self = StObject.set(x, "skipFetchSetup", value.asInstanceOf[js.Any])
      
      inline def setSkipFetchSetupUndefined: Self = StObject.set(x, "skipFetchSetup", js.undefined)
      
      inline def setThrottleCallback(value: (/* attempt */ Double, /* url */ String) => js.Promise[Boolean]): Self = StObject.set(x, "throttleCallback", js.Any.fromFunction2(value))
      
      inline def setThrottleCallbackUndefined: Self = StObject.set(x, "throttleCallback", js.undefined)
      
      inline def setThrottleLimit(value: Double): Self = StObject.set(x, "throttleLimit", value.asInstanceOf[js.Any])
      
      inline def setThrottleLimitUndefined: Self = StObject.set(x, "throttleLimit", js.undefined)
      
      inline def setThrottleSlotInterval(value: Double): Self = StObject.set(x, "throttleSlotInterval", value.asInstanceOf[js.Any])
      
      inline def setThrottleSlotIntervalUndefined: Self = StObject.set(x, "throttleSlotInterval", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait FetchJsonResponse extends StObject {
    
    var headers: StringDictionary[String]
    
    var statusCode: Double
  }
  object FetchJsonResponse {
    
    inline def apply(headers: StringDictionary[String], statusCode: Double): FetchJsonResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchJsonResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchJsonResponse] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnceBlockable extends StObject {
    
    @JSName("once")
    def once_block(eventName: block, handler: js.Function0[Unit]): Unit
  }
  object OnceBlockable {
    
    inline def apply(once: (block, js.Function0[Unit]) => Unit): OnceBlockable = {
      val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[OnceBlockable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnceBlockable] (val x: Self) extends AnyVal {
      
      inline def setOnce(value: (block, js.Function0[Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
  
  trait OncePollable extends StObject {
    
    @JSName("once")
    def once_poll(eventName: poll, handler: js.Function0[Unit]): Unit
  }
  object OncePollable {
    
    inline def apply(once: (poll, js.Function0[Unit]) => Unit): OncePollable = {
      val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[OncePollable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OncePollable] (val x: Self) extends AnyVal {
      
      inline def setOnce(value: (poll, js.Function0[Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
  
  trait PollOptions extends StObject {
    
    var ceiling: js.UndefOr[Double] = js.undefined
    
    var floor: js.UndefOr[Double] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var onceBlock: js.UndefOr[OnceBlockable] = js.undefined
    
    var oncePoll: js.UndefOr[OncePollable] = js.undefined
    
    var retryLimit: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PollOptions {
    
    inline def apply(): PollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PollOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PollOptions] (val x: Self) extends AnyVal {
      
      inline def setCeiling(value: Double): Self = StObject.set(x, "ceiling", value.asInstanceOf[js.Any])
      
      inline def setCeilingUndefined: Self = StObject.set(x, "ceiling", js.undefined)
      
      inline def setFloor(value: Double): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setOnceBlock(value: OnceBlockable): Self = StObject.set(x, "onceBlock", value.asInstanceOf[js.Any])
      
      inline def setOnceBlockUndefined: Self = StObject.set(x, "onceBlock", js.undefined)
      
      inline def setOncePoll(value: OncePollable): Self = StObject.set(x, "oncePoll", value.asInstanceOf[js.Any])
      
      inline def setOncePollUndefined: Self = StObject.set(x, "oncePoll", js.undefined)
      
      inline def setRetryLimit(value: Double): Self = StObject.set(x, "retryLimit", value.asInstanceOf[js.Any])
      
      inline def setRetryLimitUndefined: Self = StObject.set(x, "retryLimit", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
