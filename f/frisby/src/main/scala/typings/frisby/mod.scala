package typings.frisby

import org.scalablytyped.runtime.Shortcut
import typings.joi.mod.Root
import typings.joi.mod.ValidationError
import typings.joi.mod.ValidationErrorItem
import typings.node.NodeJS.ReadableStream
import typings.nodeFetch.mod.BodyInit
import typings.nodeFetch.mod.Headers
import typings.nodeFetch.mod.HeadersInit
import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.ResponseInit
import typings.std.FormData
import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("frisby", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("frisby", "FrisbySpec")
  @js.native
  open class FrisbySpec[TResult] protected () extends StObject {
    def this(args: Any*) = this()
    
    def `catch`(): FrisbySpec[FrisbyResponse] = js.native
    def `catch`(onRejected: js.Function1[/* error */ js.Error, Unit]): FrisbySpec[FrisbyResponse] = js.native
    
    def del(url: String): FrisbySpec[FrisbyResponse] = js.native
    def del(url: String, params: js.Object): FrisbySpec[FrisbyResponse] = js.native
    
    def done(doneFn: js.Function1[/* repeated */ Any, Unit]): FrisbySpec[FrisbyResponse] = js.native
    
    def expect(expectName: String, args: Any*): FrisbySpec[FrisbyResponse] = js.native
    
    def expectNot(expectName: String, args: Any*): FrisbySpec[FrisbyResponse] = js.native
    
    def fetch(url: String): FrisbySpec[FrisbyResponse] = js.native
    def fetch(url: String, params: js.Object): FrisbySpec[FrisbyResponse] = js.native
    def fetch(url: String, params: js.Object, options: js.Object): FrisbySpec[FrisbyResponse] = js.native
    def fetch(url: String, params: Unit, options: js.Object): FrisbySpec[FrisbyResponse] = js.native
    
    def fromJSON(json: js.Object): FrisbySpec[FrisbyResponse] = js.native
    
    def get(url: String): FrisbySpec[FrisbyResponse] = js.native
    def get(url: String, params: js.Object): FrisbySpec[FrisbyResponse] = js.native
    
    def getBaseUrl(): String | Boolean = js.native
    
    def inspectBody(): FrisbySpec[FrisbyResponse] = js.native
    
    def inspectHeaders(): FrisbySpec[FrisbyResponse] = js.native
    
    def inspectJSON(): FrisbySpec[FrisbyResponse] = js.native
    
    def inspectLog(args: Any*): FrisbySpec[FrisbyResponse] = js.native
    
    def inspectRequest(): FrisbySpec[FrisbyResponse] = js.native
    
    def inspectRequestHeaders(): FrisbySpec[FrisbyResponse] = js.native
    
    def inspectResponse(): FrisbySpec[FrisbyResponse] = js.native
    
    def inspectStatus(): FrisbySpec[FrisbyResponse] = js.native
    
    def patch(url: String): FrisbySpec[FrisbyResponse] = js.native
    def patch(url: String, params: js.Object): FrisbySpec[FrisbyResponse] = js.native
    
    def post(url: String): FrisbySpec[FrisbyResponse] = js.native
    def post(url: String, params: js.Object): FrisbySpec[FrisbyResponse] = js.native
    
    def promise(): js.Promise[TResult] = js.native
    
    def put(url: String): FrisbySpec[FrisbyResponse] = js.native
    def put(url: String, params: js.Object): FrisbySpec[FrisbyResponse] = js.native
    
    def setup(opts: js.Object, replace: Boolean): FrisbySpec[FrisbyResponse] = js.native
    
    def `then`[T](onFulfilled: js.Function1[/* response */ TResult, T | js.Promise[T]]): /* import warning: importer.ImportType#apply Failed type conversion: [T] extends [frisby.frisby.FrisbySpec<infer U>] ? frisby.frisby.FrisbySpec<U> : frisby.frisby.FrisbySpec<T> */ js.Any = js.native
    def `then`[T](
      onFulfilled: js.Function1[/* response */ TResult, T | js.Promise[T]],
      onRejected: js.Function1[/* repeated */ Any, Unit]
    ): /* import warning: importer.ImportType#apply Failed type conversion: [T] extends [frisby.frisby.FrisbySpec<infer U>] ? frisby.frisby.FrisbySpec<U> : frisby.frisby.FrisbySpec<T> */ js.Any = js.native
    def `then`[T](onFulfilled: FrisbySpec[T]): FrisbySpec[T] = js.native
    
    def timeout(timeout: Double): Double = js.native
    
    def use(fn: js.Function1[/* repeated */ Any, Unit]): FrisbySpec[FrisbyResponse] = js.native
  }
  /* static members */
  object FrisbySpec {
    
    @JSImport("frisby", "FrisbySpec")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addExpectHandler(expectName: String, expectFn: js.Function1[/* repeated */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExpectHandler")(expectName.asInstanceOf[js.Any], expectFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeExpectHandler(expectName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExpectHandler")(expectName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object Joi extends Shortcut {
    
    @JSImport("frisby", "Joi")
    @js.native
    val ^ : Root = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("frisby", "Joi.ValidationError")
    @js.native
    open class ValidationErrorCls protected ()
      extends StObject
         with ValidationError {
      def this(message: String, details: js.Array[ValidationErrorItem], original: Any) = this()
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
    }
    
    type _To = Root
    
    /* This means you don't have to write `^`, but can instead just say `Joi.foo` */
    override def _to: Root = ^
  }
  
  inline def addExpectHandler(expectName: String, expectFn: js.Function1[/* repeated */ Any, Any]): FrisbySpec[FrisbyResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("addExpectHandler")(expectName.asInstanceOf[js.Any], expectFn.asInstanceOf[js.Any])).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def baseUrl(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def create(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def del(args: Any*): FrisbySpec[FrisbyResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def fetch(args: Any*): FrisbySpec[FrisbyResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def formData(): FormData = ^.asInstanceOf[js.Dynamic].applyDynamic("formData")().asInstanceOf[FormData]
  
  inline def fromJSON(args: Any*): FrisbySpec[FrisbyResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def get(args: Any*): FrisbySpec[FrisbyResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def globalSetup(opts: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("globalSetup")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object nodeFetch {
    
    @JSImport("frisby", "nodeFetch")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(url: RequestInfo): js.Promise[typings.nodeFetch.mod.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodeFetch.mod.Response]]
    inline def default(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeFetch.mod.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodeFetch.mod.Response]]
    inline def default(url: URL): js.Promise[typings.nodeFetch.mod.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodeFetch.mod.Response]]
    inline def default(url: URL, init: RequestInit): js.Promise[typings.nodeFetch.mod.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodeFetch.mod.Response]]
    
    @JSImport("frisby", "nodeFetch.AbortError")
    @js.native
    open class AbortError ()
      extends typings.nodeFetch.mod.AbortError
    
    @JSImport("frisby", "nodeFetch.Blob")
    @js.native
    val Blob: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.Blob */ Any = js.native
    
    @JSImport("frisby", "nodeFetch.FetchError")
    @js.native
    open class FetchError protected ()
      extends typings.nodeFetch.mod.FetchError {
      def this(message: String, `type`: String) = this()
      def this(message: String, `type`: String, systemError: Record[String, Any]) = this()
    }
    
    @JSImport("frisby", "nodeFetch.File")
    @js.native
    val File: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.File */ Any = js.native
    
    @JSImport("frisby", "nodeFetch.Headers")
    @js.native
    open class Headers ()
      extends typings.nodeFetch.mod.Headers {
      def this(init: HeadersInit) = this()
    }
    
    @JSImport("frisby", "nodeFetch.Request")
    @js.native
    open class Request protected ()
      extends typings.nodeFetch.mod.Request {
      def this(input: RequestInfo) = this()
      def this(input: URL) = this()
      def this(input: RequestInfo, init: RequestInit) = this()
      def this(input: URL, init: RequestInit) = this()
    }
    
    @JSImport("frisby", "nodeFetch.Response")
    @js.native
    open class Response ()
      extends typings.nodeFetch.mod.Response {
      def this(body: BodyInit) = this()
      def this(body: Null, init: ResponseInit) = this()
      def this(body: Unit, init: ResponseInit) = this()
      def this(body: BodyInit, init: ResponseInit) = this()
    }
    /* static members */
    object Response {
      
      @JSImport("frisby", "nodeFetch.Response")
      @js.native
      val ^ : js.Any = js.native
      
      inline def error(): typings.nodeFetch.mod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.nodeFetch.mod.Response]
      
      inline def json(data: Any): typings.nodeFetch.mod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any]).asInstanceOf[typings.nodeFetch.mod.Response]
      inline def json(data: Any, init: ResponseInit): typings.nodeFetch.mod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.nodeFetch.mod.Response]
      
      inline def redirect(url: String): typings.nodeFetch.mod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.nodeFetch.mod.Response]
      inline def redirect(url: String, status: Double): typings.nodeFetch.mod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.nodeFetch.mod.Response]
    }
    
    inline def blobFrom(path: String): js.Promise[typings.std.Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blobFrom")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.Blob]]
    inline def blobFrom(path: String, `type`: String): js.Promise[typings.std.Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFrom")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.Blob]]
    
    inline def blobFromSync(path: String): typings.std.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("blobFromSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.std.Blob]
    inline def blobFromSync(path: String, `type`: String): typings.std.Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFromSync")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.std.Blob]
    
    inline def fileFrom(path: String): js.Promise[typings.std.File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileFrom")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.File]]
    inline def fileFrom(path: String, `type`: String): js.Promise[typings.std.File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFrom")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.File]]
    
    inline def fileFromSync(path: String): typings.std.File = ^.asInstanceOf[js.Dynamic].applyDynamic("fileFromSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.std.File]
    inline def fileFromSync(path: String, `type`: String): typings.std.File = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromSync")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.std.File]
    
    inline def isRedirect(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def patch(args: Any*): FrisbySpec[FrisbyResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def post(args: Any*): FrisbySpec[FrisbyResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def put(args: Any*): FrisbySpec[FrisbyResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def removeExpectHandler(expectName: String, expectFn: js.Function1[/* repeated */ Any, Any]): FrisbySpec[FrisbyResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeExpectHandler")(expectName.asInstanceOf[js.Any], expectFn.asInstanceOf[js.Any])).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def setup(args: Any*): FrisbySpec[FrisbyResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def timeout(args: Any*): FrisbySpec[FrisbyResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  inline def use(args: Any*): FrisbySpec[FrisbyResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FrisbySpec[FrisbyResponse]]
  
  @JSImport("frisby", "version")
  @js.native
  val version: String = js.native
  
  trait FrisbyResponse extends StObject {
    
    val body: ReadableStream | Null
    
    val headers: Headers
    
    val json: Any
    
    val responseTime: Double
    
    val status: Double
  }
  object FrisbyResponse {
    
    inline def apply(headers: Headers, json: Any, responseTime: Double, status: Double): FrisbyResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], body = null)
      __obj.asInstanceOf[FrisbyResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FrisbyResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setResponseTime(value: Double): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
