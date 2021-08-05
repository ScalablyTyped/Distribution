package typings.easyApiRequest

import typings.easyApiRequest.anon.Cb
import typings.easyApiRequest.anon.Config
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Stream
import typings.q.mod.Promise
import typings.request.mod.Request
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-api-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(opts: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait BaseRequest extends StObject {
    
    def _do(args: IArguments): js.Any = js.native
    def _do(args: IArguments, `type`: String): js.Any = js.native
    
    def _parseOptions(args: IArguments, `type`: String): Cb = js.native
    
    def _request(): js.Any = js.native
    def _request(opts: js.Any): js.Any = js.native
    def _request(opts: js.Any, cb: js.Any): js.Any = js.native
    def _request(opts: Unit, cb: js.Any): js.Any = js.native
    
    /* protected */ var base: Request = js.native
    
    def del(): js.Any = js.native
    def del(url: js.Any): js.Any = js.native
    def del(url: js.Any, opts: js.Any): js.Any = js.native
    def del(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
    def del(url: js.Any, opts: Unit, cb: js.Any): js.Any = js.native
    def del(url: Unit, opts: js.Any): js.Any = js.native
    def del(url: Unit, opts: js.Any, cb: js.Any): js.Any = js.native
    def del(url: Unit, opts: Unit, cb: js.Any): js.Any = js.native
    
    def get(): js.Any = js.native
    def get(url: js.Any): js.Any = js.native
    def get(url: js.Any, opts: js.Any): js.Any = js.native
    def get(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
    def get(url: js.Any, opts: Unit, cb: js.Any): js.Any = js.native
    def get(url: Unit, opts: js.Any): js.Any = js.native
    def get(url: Unit, opts: js.Any, cb: js.Any): js.Any = js.native
    def get(url: Unit, opts: Unit, cb: js.Any): js.Any = js.native
    
    /* protected */ var jSend: Boolean = js.native
    
    /* protected */ var log: typings.bunyan.mod.^ = js.native
    
    def patch(): js.Any = js.native
    def patch(url: js.Any): js.Any = js.native
    def patch(url: js.Any, opts: js.Any): js.Any = js.native
    def patch(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
    def patch(url: js.Any, opts: Unit, cb: js.Any): js.Any = js.native
    def patch(url: Unit, opts: js.Any): js.Any = js.native
    def patch(url: Unit, opts: js.Any, cb: js.Any): js.Any = js.native
    def patch(url: Unit, opts: Unit, cb: js.Any): js.Any = js.native
    
    def post(): js.Any = js.native
    def post(url: js.Any): js.Any = js.native
    def post(url: js.Any, opts: js.Any): js.Any = js.native
    def post(url: js.Any, opts: js.Any, cb: js.Any): js.Any = js.native
    def post(url: js.Any, opts: Unit, cb: js.Any): js.Any = js.native
    def post(url: Unit, opts: js.Any): js.Any = js.native
    def post(url: Unit, opts: js.Any, cb: js.Any): js.Any = js.native
    def post(url: Unit, opts: Unit, cb: js.Any): js.Any = js.native
    
    /* protected */ var replyCookies: js.Array[String] = js.native
    
    /* protected */ var req: Request_[ParamsDictionary, js.Any, js.Any, Query] = js.native
  }
  
  @js.native
  trait CBPromiseRequest
    extends StObject
       with BaseRequest {
    
    def _request(opts: js.Object): Stream = js.native
    
    def del(opts: js.Object): Promise[Result] = js.native
    def del(
      opts: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    def del(url: String): Promise[Result] = js.native
    def del(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
    def del(url: String, params: js.Object): Promise[Result] = js.native
    def del(
      url: String,
      params: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    
    def get(opts: js.Object): Promise[Result] = js.native
    def get(
      opts: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    def get(url: String): Promise[Result] = js.native
    def get(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
    def get(url: String, params: js.Object): Promise[Result] = js.native
    def get(
      url: String,
      params: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    
    def patch(opts: js.Object): Promise[Result] = js.native
    def patch(
      opts: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    def patch(url: String): Promise[Result] = js.native
    def patch(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
    def patch(url: String, params: js.Object): Promise[Result] = js.native
    def patch(
      url: String,
      params: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    
    def post(opts: js.Object): Promise[Result] = js.native
    def post(
      opts: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
    def post(url: String): Promise[Result] = js.native
    def post(url: String, cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]): Unit = js.native
    def post(url: String, params: js.Object): Promise[Result] = js.native
    def post(
      url: String,
      params: js.Object,
      cb: js.Function2[/* err */ js.UndefOr[js.Any], /* resp */ js.UndefOr[Result], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait RequestMaker extends StObject {
    
    def apply(): CBPromiseRequest = js.native
    def apply(stream: Boolean): StreamRequest | CBPromiseRequest = js.native
  }
  
  trait Result extends StObject {
    
    var body: js.Any
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var err: js.UndefOr[js.Any] = js.undefined
    
    var response: IncomingMessage
  }
  object Result {
    
    inline def apply(body: js.Any, response: IncomingMessage): Result = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setErr(value: js.Any): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setResponse(value: IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StreamRequest
    extends StObject
       with BaseRequest {
    
    def _request(opts: js.Object): Stream = js.native
    
    def del(opts: js.Object): Stream = js.native
    def del(url: String): Stream = js.native
    def del(url: String, params: js.Object): Stream = js.native
    
    def get(opts: js.Object): Stream = js.native
    def get(url: String): Stream = js.native
    def get(url: String, params: js.Object): Stream = js.native
    
    def patch(opts: js.Object): Stream = js.native
    def patch(url: String): Stream = js.native
    def patch(url: String, params: js.Object): Stream = js.native
    
    def post(opts: js.Object): Stream = js.native
    def post(url: String): Stream = js.native
    def post(url: String, params: js.Object): Stream = js.native
  }
}
