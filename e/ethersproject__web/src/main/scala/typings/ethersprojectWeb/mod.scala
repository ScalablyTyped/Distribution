package typings.ethersprojectWeb

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectWeb.ethersprojectWebStrings.block
import typings.ethersprojectWeb.ethersprojectWebStrings.poll
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fetchData[T](connection: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def fetchData[T](
    connection: String,
    body: Unit,
    processFunc: js.Function2[/* value */ Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def fetchData[T](connection: String, body: Uint8Array): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def fetchData[T](
    connection: String,
    body: Uint8Array,
    processFunc: js.Function2[/* value */ Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def fetchData[T](connection: ConnectionInfo): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def fetchData[T](
    connection: ConnectionInfo,
    body: Unit,
    processFunc: js.Function2[/* value */ Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def fetchData[T](connection: ConnectionInfo, body: Uint8Array): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def fetchData[T](
    connection: ConnectionInfo,
    body: Uint8Array,
    processFunc: js.Function2[/* value */ Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def fetchJson(connection: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def fetchJson(connection: String, json: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def fetchJson(
    connection: String,
    json: String,
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, js.Any]
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def fetchJson(
    connection: String,
    json: Unit,
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, js.Any]
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def fetchJson(connection: ConnectionInfo): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def fetchJson(connection: ConnectionInfo, json: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def fetchJson(
    connection: ConnectionInfo,
    json: String,
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, js.Any]
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def fetchJson(
    connection: ConnectionInfo,
    json: Unit,
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, js.Any]
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def poll[T](func: js.Function0[js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("poll")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def poll[T](func: js.Function0[js.Promise[T]], options: PollOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("poll")(func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait ConnectionInfo extends StObject {
    
    var allowGzip: js.UndefOr[Boolean] = js.undefined
    
    var allowInsecureAuthentication: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var throttleCallback: js.UndefOr[js.Function2[/* attempt */ Double, /* url */ String, js.Promise[Boolean]]] = js.undefined
    
    var throttleLimit: js.UndefOr[Double] = js.undefined
    
    var throttleSlotInterval: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String
    
    var user: js.UndefOr[String] = js.undefined
  }
  object ConnectionInfo {
    
    @scala.inline
    def apply(url: String): ConnectionInfo = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionInfo]
    }
    
    @scala.inline
    implicit class ConnectionInfoMutableBuilder[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowGzip(value: Boolean): Self = StObject.set(x, "allowGzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowGzipUndefined: Self = StObject.set(x, "allowGzip", js.undefined)
      
      @scala.inline
      def setAllowInsecureAuthentication(value: Boolean): Self = StObject.set(x, "allowInsecureAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInsecureAuthenticationUndefined: Self = StObject.set(x, "allowInsecureAuthentication", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setThrottleCallback(value: (/* attempt */ Double, /* url */ String) => js.Promise[Boolean]): Self = StObject.set(x, "throttleCallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setThrottleCallbackUndefined: Self = StObject.set(x, "throttleCallback", js.undefined)
      
      @scala.inline
      def setThrottleLimit(value: Double): Self = StObject.set(x, "throttleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleLimitUndefined: Self = StObject.set(x, "throttleLimit", js.undefined)
      
      @scala.inline
      def setThrottleSlotInterval(value: Double): Self = StObject.set(x, "throttleSlotInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleSlotIntervalUndefined: Self = StObject.set(x, "throttleSlotInterval", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait FetchJsonResponse extends StObject {
    
    var headers: StringDictionary[String]
    
    var statusCode: Double
  }
  object FetchJsonResponse {
    
    @scala.inline
    def apply(headers: StringDictionary[String], statusCode: Double): FetchJsonResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchJsonResponse]
    }
    
    @scala.inline
    implicit class FetchJsonResponseMutableBuilder[Self <: FetchJsonResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnceBlockable extends StObject {
    
    @JSName("once")
    def once_block(eventName: block, handler: js.Function0[Unit]): Unit
  }
  object OnceBlockable {
    
    @scala.inline
    def apply(once: (block, js.Function0[Unit]) => Unit): OnceBlockable = {
      val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[OnceBlockable]
    }
    
    @scala.inline
    implicit class OnceBlockableMutableBuilder[Self <: OnceBlockable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: (block, js.Function0[Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
  
  trait OncePollable extends StObject {
    
    @JSName("once")
    def once_poll(eventName: poll, handler: js.Function0[Unit]): Unit
  }
  object OncePollable {
    
    @scala.inline
    def apply(once: (poll, js.Function0[Unit]) => Unit): OncePollable = {
      val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[OncePollable]
    }
    
    @scala.inline
    implicit class OncePollableMutableBuilder[Self <: OncePollable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: (poll, js.Function0[Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
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
    
    @scala.inline
    def apply(): PollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PollOptions]
    }
    
    @scala.inline
    implicit class PollOptionsMutableBuilder[Self <: PollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCeiling(value: Double): Self = StObject.set(x, "ceiling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCeilingUndefined: Self = StObject.set(x, "ceiling", js.undefined)
      
      @scala.inline
      def setFloor(value: Double): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setOnceBlock(value: OnceBlockable): Self = StObject.set(x, "onceBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceBlockUndefined: Self = StObject.set(x, "onceBlock", js.undefined)
      
      @scala.inline
      def setOncePoll(value: OncePollable): Self = StObject.set(x, "oncePoll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncePollUndefined: Self = StObject.set(x, "oncePoll", js.undefined)
      
      @scala.inline
      def setRetryLimit(value: Double): Self = StObject.set(x, "retryLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryLimitUndefined: Self = StObject.set(x, "retryLimit", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
