package typings.findMyWay

import org.scalablytyped.runtime.StringDictionary
import typings.findMyWay.anon.CommonPrefix
import typings.findMyWay.anon.Del
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[V /* <: HTTPVersion */](): Instance[V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Instance[V]]
  inline def apply[V /* <: HTTPVersion */](config: Config[V]): Instance[V] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Instance[V]]
  
  @JSImport("find-my-way", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait HTTPVersion extends StObject
  @JSImport("find-my-way", "HTTPVersion")
  @js.native
  object HTTPVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HTTPVersion & String] = js.native
    
    @js.native
    sealed trait V1
      extends StObject
         with HTTPVersion
    /* "http1" */ val V1: typings.findMyWay.mod.HTTPVersion.V1 & String = js.native
    
    @js.native
    sealed trait V2
      extends StObject
         with HTTPVersion
    /* "http2" */ val V2: typings.findMyWay.mod.HTTPVersion.V2 & String = js.native
  }
  
  trait Config[V /* <: HTTPVersion */] extends StObject {
    
    var allowUnsafeRegex: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var constraints: js.UndefOr[StringDictionary[ConstraintStrategy[V, String]]] = js.undefined
    
    var defaultRoute: js.UndefOr[js.Function2[/* req */ Req[V], /* res */ Res[V], Unit]] = js.undefined
    
    var ignoreDuplicateSlashes: js.UndefOr[Boolean] = js.undefined
    
    var ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var maxParamLength: js.UndefOr[Double] = js.undefined
    
    var onBadUrl: js.UndefOr[js.Function3[/* path */ String, /* req */ Req[V], /* res */ Res[V], Unit]] = js.undefined
  }
  object Config {
    
    inline def apply[V /* <: HTTPVersion */](): Config[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config[?], V /* <: HTTPVersion */] (val x: Self & Config[V]) extends AnyVal {
      
      inline def setAllowUnsafeRegex(value: Boolean): Self = StObject.set(x, "allowUnsafeRegex", value.asInstanceOf[js.Any])
      
      inline def setAllowUnsafeRegexUndefined: Self = StObject.set(x, "allowUnsafeRegex", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setConstraints(value: StringDictionary[ConstraintStrategy[V, String]]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setDefaultRoute(value: (/* req */ Req[V], /* res */ Res[V]) => Unit): Self = StObject.set(x, "defaultRoute", js.Any.fromFunction2(value))
      
      inline def setDefaultRouteUndefined: Self = StObject.set(x, "defaultRoute", js.undefined)
      
      inline def setIgnoreDuplicateSlashes(value: Boolean): Self = StObject.set(x, "ignoreDuplicateSlashes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDuplicateSlashesUndefined: Self = StObject.set(x, "ignoreDuplicateSlashes", js.undefined)
      
      inline def setIgnoreTrailingSlash(value: Boolean): Self = StObject.set(x, "ignoreTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTrailingSlashUndefined: Self = StObject.set(x, "ignoreTrailingSlash", js.undefined)
      
      inline def setMaxParamLength(value: Double): Self = StObject.set(x, "maxParamLength", value.asInstanceOf[js.Any])
      
      inline def setMaxParamLengthUndefined: Self = StObject.set(x, "maxParamLength", js.undefined)
      
      inline def setOnBadUrl(value: (/* path */ String, /* req */ Req[V], /* res */ Res[V]) => Unit): Self = StObject.set(x, "onBadUrl", js.Any.fromFunction3(value))
      
      inline def setOnBadUrlUndefined: Self = StObject.set(x, "onBadUrl", js.undefined)
    }
  }
  
  @js.native
  trait ConstraintStrategy[V /* <: HTTPVersion */, T] extends StObject {
    
    def deriveConstraint[Context](req: Req[V]): T = js.native
    def deriveConstraint[Context](req: Req[V], ctx: Context): T = js.native
    
    var mustMatchWhenDerived: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    def storage(): Del[T, V] = js.native
    
    var validate: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.native
  }
  
  trait FindResult[V /* <: HTTPVersion */] extends StObject {
    
    def handler(
      req: Req[V],
      res: Res[V],
      params: StringDictionary[js.UndefOr[String]],
      store: Any,
      searchParams: StringDictionary[String]
    ): Any
    @JSName("handler")
    var handler_Original: Handler[V]
    
    var params: StringDictionary[js.UndefOr[String]]
    
    var searchParams: StringDictionary[String]
    
    var store: Any
  }
  object FindResult {
    
    inline def apply[V /* <: HTTPVersion */](
      handler: (/* req */ Req[V], /* res */ Res[V], /* params */ StringDictionary[js.UndefOr[String]], /* store */ Any, /* searchParams */ StringDictionary[String]) => Any,
      params: StringDictionary[js.UndefOr[String]],
      searchParams: StringDictionary[String],
      store: Any
    ): FindResult[V] = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction5(handler), params = params.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindResult[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindResult[?], V /* <: HTTPVersion */] (val x: Self & FindResult[V]) extends AnyVal {
      
      inline def setHandler(
        value: (/* req */ Req[V], /* res */ Res[V], /* params */ StringDictionary[js.UndefOr[String]], /* store */ Any, /* searchParams */ StringDictionary[String]) => Any
      ): Self = StObject.set(x, "handler", js.Any.fromFunction5(value))
      
      inline def setParams(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setSearchParams(value: StringDictionary[String]): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.findMyWay.findMyWayStrings.ACL
    - typings.findMyWay.findMyWayStrings.BIND
    - typings.findMyWay.findMyWayStrings.CHECKOUT
    - typings.findMyWay.findMyWayStrings.CONNECT
    - typings.findMyWay.findMyWayStrings.COPY
    - typings.findMyWay.findMyWayStrings.DELETE
    - typings.findMyWay.findMyWayStrings.GET
    - typings.findMyWay.findMyWayStrings.HEAD
    - typings.findMyWay.findMyWayStrings.LINK
    - typings.findMyWay.findMyWayStrings.LOCK
    - typings.findMyWay.findMyWayStrings.`M-SEARCH`
    - typings.findMyWay.findMyWayStrings.MERGE
    - typings.findMyWay.findMyWayStrings.MKACTIVITY
    - typings.findMyWay.findMyWayStrings.MKCALENDAR
    - typings.findMyWay.findMyWayStrings.MKCOL
    - typings.findMyWay.findMyWayStrings.MOVE
    - typings.findMyWay.findMyWayStrings.NOTIFY
    - typings.findMyWay.findMyWayStrings.OPTIONS
    - typings.findMyWay.findMyWayStrings.PATCH
    - typings.findMyWay.findMyWayStrings.POST
    - typings.findMyWay.findMyWayStrings.PROPFIND
    - typings.findMyWay.findMyWayStrings.PROPPATCH
    - typings.findMyWay.findMyWayStrings.PURGE
    - typings.findMyWay.findMyWayStrings.PUT
    - typings.findMyWay.findMyWayStrings.REBIND
    - typings.findMyWay.findMyWayStrings.REPORT
    - typings.findMyWay.findMyWayStrings.SEARCH
    - typings.findMyWay.findMyWayStrings.SOURCE
    - typings.findMyWay.findMyWayStrings.SUBSCRIBE
    - typings.findMyWay.findMyWayStrings.TRACE
    - typings.findMyWay.findMyWayStrings.UNBIND
    - typings.findMyWay.findMyWayStrings.UNLINK
    - typings.findMyWay.findMyWayStrings.UNLOCK
    - typings.findMyWay.findMyWayStrings.UNSUBSCRIBE
  */
  trait HTTPMethod extends StObject
  object HTTPMethod {
    
    inline def ACL: typings.findMyWay.findMyWayStrings.ACL = "ACL".asInstanceOf[typings.findMyWay.findMyWayStrings.ACL]
    
    inline def BIND: typings.findMyWay.findMyWayStrings.BIND = "BIND".asInstanceOf[typings.findMyWay.findMyWayStrings.BIND]
    
    inline def CHECKOUT: typings.findMyWay.findMyWayStrings.CHECKOUT = "CHECKOUT".asInstanceOf[typings.findMyWay.findMyWayStrings.CHECKOUT]
    
    inline def CONNECT: typings.findMyWay.findMyWayStrings.CONNECT = "CONNECT".asInstanceOf[typings.findMyWay.findMyWayStrings.CONNECT]
    
    inline def COPY: typings.findMyWay.findMyWayStrings.COPY = "COPY".asInstanceOf[typings.findMyWay.findMyWayStrings.COPY]
    
    inline def DELETE: typings.findMyWay.findMyWayStrings.DELETE = "DELETE".asInstanceOf[typings.findMyWay.findMyWayStrings.DELETE]
    
    inline def GET: typings.findMyWay.findMyWayStrings.GET = "GET".asInstanceOf[typings.findMyWay.findMyWayStrings.GET]
    
    inline def HEAD: typings.findMyWay.findMyWayStrings.HEAD = "HEAD".asInstanceOf[typings.findMyWay.findMyWayStrings.HEAD]
    
    inline def LINK: typings.findMyWay.findMyWayStrings.LINK = "LINK".asInstanceOf[typings.findMyWay.findMyWayStrings.LINK]
    
    inline def LOCK: typings.findMyWay.findMyWayStrings.LOCK = "LOCK".asInstanceOf[typings.findMyWay.findMyWayStrings.LOCK]
    
    inline def `M-SEARCH`: typings.findMyWay.findMyWayStrings.`M-SEARCH` = "M-SEARCH".asInstanceOf[typings.findMyWay.findMyWayStrings.`M-SEARCH`]
    
    inline def MERGE: typings.findMyWay.findMyWayStrings.MERGE = "MERGE".asInstanceOf[typings.findMyWay.findMyWayStrings.MERGE]
    
    inline def MKACTIVITY: typings.findMyWay.findMyWayStrings.MKACTIVITY = "MKACTIVITY".asInstanceOf[typings.findMyWay.findMyWayStrings.MKACTIVITY]
    
    inline def MKCALENDAR: typings.findMyWay.findMyWayStrings.MKCALENDAR = "MKCALENDAR".asInstanceOf[typings.findMyWay.findMyWayStrings.MKCALENDAR]
    
    inline def MKCOL: typings.findMyWay.findMyWayStrings.MKCOL = "MKCOL".asInstanceOf[typings.findMyWay.findMyWayStrings.MKCOL]
    
    inline def MOVE: typings.findMyWay.findMyWayStrings.MOVE = "MOVE".asInstanceOf[typings.findMyWay.findMyWayStrings.MOVE]
    
    inline def NOTIFY: typings.findMyWay.findMyWayStrings.NOTIFY = "NOTIFY".asInstanceOf[typings.findMyWay.findMyWayStrings.NOTIFY]
    
    inline def OPTIONS: typings.findMyWay.findMyWayStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.findMyWay.findMyWayStrings.OPTIONS]
    
    inline def PATCH: typings.findMyWay.findMyWayStrings.PATCH = "PATCH".asInstanceOf[typings.findMyWay.findMyWayStrings.PATCH]
    
    inline def POST: typings.findMyWay.findMyWayStrings.POST = "POST".asInstanceOf[typings.findMyWay.findMyWayStrings.POST]
    
    inline def PROPFIND: typings.findMyWay.findMyWayStrings.PROPFIND = "PROPFIND".asInstanceOf[typings.findMyWay.findMyWayStrings.PROPFIND]
    
    inline def PROPPATCH: typings.findMyWay.findMyWayStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typings.findMyWay.findMyWayStrings.PROPPATCH]
    
    inline def PURGE: typings.findMyWay.findMyWayStrings.PURGE = "PURGE".asInstanceOf[typings.findMyWay.findMyWayStrings.PURGE]
    
    inline def PUT: typings.findMyWay.findMyWayStrings.PUT = "PUT".asInstanceOf[typings.findMyWay.findMyWayStrings.PUT]
    
    inline def REBIND: typings.findMyWay.findMyWayStrings.REBIND = "REBIND".asInstanceOf[typings.findMyWay.findMyWayStrings.REBIND]
    
    inline def REPORT: typings.findMyWay.findMyWayStrings.REPORT = "REPORT".asInstanceOf[typings.findMyWay.findMyWayStrings.REPORT]
    
    inline def SEARCH: typings.findMyWay.findMyWayStrings.SEARCH = "SEARCH".asInstanceOf[typings.findMyWay.findMyWayStrings.SEARCH]
    
    inline def SOURCE: typings.findMyWay.findMyWayStrings.SOURCE = "SOURCE".asInstanceOf[typings.findMyWay.findMyWayStrings.SOURCE]
    
    inline def SUBSCRIBE: typings.findMyWay.findMyWayStrings.SUBSCRIBE = "SUBSCRIBE".asInstanceOf[typings.findMyWay.findMyWayStrings.SUBSCRIBE]
    
    inline def TRACE: typings.findMyWay.findMyWayStrings.TRACE = "TRACE".asInstanceOf[typings.findMyWay.findMyWayStrings.TRACE]
    
    inline def UNBIND: typings.findMyWay.findMyWayStrings.UNBIND = "UNBIND".asInstanceOf[typings.findMyWay.findMyWayStrings.UNBIND]
    
    inline def UNLINK: typings.findMyWay.findMyWayStrings.UNLINK = "UNLINK".asInstanceOf[typings.findMyWay.findMyWayStrings.UNLINK]
    
    inline def UNLOCK: typings.findMyWay.findMyWayStrings.UNLOCK = "UNLOCK".asInstanceOf[typings.findMyWay.findMyWayStrings.UNLOCK]
    
    inline def UNSUBSCRIBE: typings.findMyWay.findMyWayStrings.UNSUBSCRIBE = "UNSUBSCRIBE".asInstanceOf[typings.findMyWay.findMyWayStrings.UNSUBSCRIBE]
  }
  
  type Handler[V /* <: HTTPVersion */] = js.Function5[
    /* req */ Req[V], 
    /* res */ Res[V], 
    /* params */ StringDictionary[js.UndefOr[String]], 
    /* store */ Any, 
    /* searchParams */ StringDictionary[String], 
    Any
  ]
  
  @js.native
  trait Instance[V /* <: HTTPVersion */] extends StObject {
    
    def acl(path: String, handler: Handler[V]): Unit = js.native
    def acl(path: String, handler: Handler[V], store: Any): Unit = js.native
    def acl(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def acl(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("acl")
    var acl_Original: ShortHandRoute[V] = js.native
    
    def addConstraintStrategy(constraintStrategy: ConstraintStrategy[V, String]): Unit = js.native
    
    def all(path: String, handler: Handler[V]): Unit = js.native
    def all(path: String, handler: Handler[V], store: Any): Unit = js.native
    def all(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def all(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("all")
    var all_Original: ShortHandRoute[V] = js.native
    
    def bind(path: String, handler: Handler[V]): Unit = js.native
    def bind(path: String, handler: Handler[V], store: Any): Unit = js.native
    def bind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def bind(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("bind")
    var bind_Original: ShortHandRoute[V] = js.native
    
    def checkout(path: String, handler: Handler[V]): Unit = js.native
    def checkout(path: String, handler: Handler[V], store: Any): Unit = js.native
    def checkout(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def checkout(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("checkout")
    var checkout_Original: ShortHandRoute[V] = js.native
    
    def connect(path: String, handler: Handler[V]): Unit = js.native
    def connect(path: String, handler: Handler[V], store: Any): Unit = js.native
    def connect(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def connect(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("connect")
    var connect_Original: ShortHandRoute[V] = js.native
    
    def copy(path: String, handler: Handler[V]): Unit = js.native
    def copy(path: String, handler: Handler[V], store: Any): Unit = js.native
    def copy(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def copy(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("copy")
    var copy_Original: ShortHandRoute[V] = js.native
    
    def delete(path: String, handler: Handler[V]): Unit = js.native
    def delete(path: String, handler: Handler[V], store: Any): Unit = js.native
    def delete(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def delete(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("delete")
    var delete_Original: ShortHandRoute[V] = js.native
    
    def find(method: HTTPMethod, path: String): FindResult[V] | Null = js.native
    def find(method: HTTPMethod, path: String, constraints: StringDictionary[Any]): FindResult[V] | Null = js.native
    
    def get(path: String, handler: Handler[V]): Unit = js.native
    def get(path: String, handler: Handler[V], store: Any): Unit = js.native
    def get(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def get(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("get")
    var get_Original: ShortHandRoute[V] = js.native
    
    def hasConstraintStrategy(strategyName: String): Boolean = js.native
    
    def head(path: String, handler: Handler[V]): Unit = js.native
    def head(path: String, handler: Handler[V], store: Any): Unit = js.native
    def head(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def head(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("head")
    var head_Original: ShortHandRoute[V] = js.native
    
    def link(path: String, handler: Handler[V]): Unit = js.native
    def link(path: String, handler: Handler[V], store: Any): Unit = js.native
    def link(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def link(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("link")
    var link_Original: ShortHandRoute[V] = js.native
    
    def lock(path: String, handler: Handler[V]): Unit = js.native
    def lock(path: String, handler: Handler[V], store: Any): Unit = js.native
    def lock(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def lock(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("lock")
    var lock_Original: ShortHandRoute[V] = js.native
    
    def lookup[Context](req: Req[V], res: Res[V]): Any = js.native
    def lookup[Context](req: Req[V], res: Res[V], ctx: Context): Any = js.native
    
    def `m-search`(path: String, handler: Handler[V]): Unit = js.native
    def `m-search`(path: String, handler: Handler[V], store: Any): Unit = js.native
    def `m-search`(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def `m-search`(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("m-search")
    var `m-search_Original`: ShortHandRoute[V] = js.native
    
    def merge(path: String, handler: Handler[V]): Unit = js.native
    def merge(path: String, handler: Handler[V], store: Any): Unit = js.native
    def merge(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def merge(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("merge")
    var merge_Original: ShortHandRoute[V] = js.native
    
    def mkactivity(path: String, handler: Handler[V]): Unit = js.native
    def mkactivity(path: String, handler: Handler[V], store: Any): Unit = js.native
    def mkactivity(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def mkactivity(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("mkactivity")
    var mkactivity_Original: ShortHandRoute[V] = js.native
    
    def mkcalendar(path: String, handler: Handler[V]): Unit = js.native
    def mkcalendar(path: String, handler: Handler[V], store: Any): Unit = js.native
    def mkcalendar(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def mkcalendar(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("mkcalendar")
    var mkcalendar_Original: ShortHandRoute[V] = js.native
    
    def mkcol(path: String, handler: Handler[V]): Unit = js.native
    def mkcol(path: String, handler: Handler[V], store: Any): Unit = js.native
    def mkcol(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def mkcol(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("mkcol")
    var mkcol_Original: ShortHandRoute[V] = js.native
    
    def move(path: String, handler: Handler[V]): Unit = js.native
    def move(path: String, handler: Handler[V], store: Any): Unit = js.native
    def move(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def move(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("move")
    var move_Original: ShortHandRoute[V] = js.native
    
    def notify(path: String, handler: Handler[V]): Unit = js.native
    def notify(path: String, handler: Handler[V], store: Any): Unit = js.native
    def notify(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def notify(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("notify")
    var notify_Original: ShortHandRoute[V] = js.native
    
    def off(method: js.Array[HTTPMethod], path: String): Unit = js.native
    def off(method: js.Array[HTTPMethod], path: String, constraints: StringDictionary[Any]): Unit = js.native
    def off(method: HTTPMethod, path: String): Unit = js.native
    def off(method: HTTPMethod, path: String, constraints: StringDictionary[Any]): Unit = js.native
    
    def on(method: js.Array[HTTPMethod], path: String, handler: Handler[V]): Unit = js.native
    def on(method: js.Array[HTTPMethod], path: String, handler: Handler[V], store: Any): Unit = js.native
    def on(method: js.Array[HTTPMethod], path: String, options: RouteOptions, handler: Handler[V]): Unit = js.native
    def on(method: js.Array[HTTPMethod], path: String, options: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    def on(method: HTTPMethod, path: String, handler: Handler[V]): Unit = js.native
    def on(method: HTTPMethod, path: String, handler: Handler[V], store: Any): Unit = js.native
    def on(method: HTTPMethod, path: String, options: RouteOptions, handler: Handler[V]): Unit = js.native
    def on(method: HTTPMethod, path: String, options: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    
    def options(path: String, handler: Handler[V]): Unit = js.native
    def options(path: String, handler: Handler[V], store: Any): Unit = js.native
    def options(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def options(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("options")
    var options_Original: ShortHandRoute[V] = js.native
    
    def patch(path: String, handler: Handler[V]): Unit = js.native
    def patch(path: String, handler: Handler[V], store: Any): Unit = js.native
    def patch(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def patch(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("patch")
    var patch_Original: ShortHandRoute[V] = js.native
    
    def post(path: String, handler: Handler[V]): Unit = js.native
    def post(path: String, handler: Handler[V], store: Any): Unit = js.native
    def post(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def post(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("post")
    var post_Original: ShortHandRoute[V] = js.native
    
    def prettyPrint(): String = js.native
    def prettyPrint(opts: CommonPrefix): String = js.native
    
    def propfind(path: String, handler: Handler[V]): Unit = js.native
    def propfind(path: String, handler: Handler[V], store: Any): Unit = js.native
    def propfind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def propfind(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("propfind")
    var propfind_Original: ShortHandRoute[V] = js.native
    
    def proppatch(path: String, handler: Handler[V]): Unit = js.native
    def proppatch(path: String, handler: Handler[V], store: Any): Unit = js.native
    def proppatch(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def proppatch(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("proppatch")
    var proppatch_Original: ShortHandRoute[V] = js.native
    
    def purge(path: String, handler: Handler[V]): Unit = js.native
    def purge(path: String, handler: Handler[V], store: Any): Unit = js.native
    def purge(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def purge(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("purge")
    var purge_Original: ShortHandRoute[V] = js.native
    
    def put(path: String, handler: Handler[V]): Unit = js.native
    def put(path: String, handler: Handler[V], store: Any): Unit = js.native
    def put(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def put(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("put")
    var put_Original: ShortHandRoute[V] = js.native
    
    def rebind(path: String, handler: Handler[V]): Unit = js.native
    def rebind(path: String, handler: Handler[V], store: Any): Unit = js.native
    def rebind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def rebind(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("rebind")
    var rebind_Original: ShortHandRoute[V] = js.native
    
    def report(path: String, handler: Handler[V]): Unit = js.native
    def report(path: String, handler: Handler[V], store: Any): Unit = js.native
    def report(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def report(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("report")
    var report_Original: ShortHandRoute[V] = js.native
    
    def reset(): Unit = js.native
    
    def search(path: String, handler: Handler[V]): Unit = js.native
    def search(path: String, handler: Handler[V], store: Any): Unit = js.native
    def search(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def search(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("search")
    var search_Original: ShortHandRoute[V] = js.native
    
    def source(path: String, handler: Handler[V]): Unit = js.native
    def source(path: String, handler: Handler[V], store: Any): Unit = js.native
    def source(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def source(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("source")
    var source_Original: ShortHandRoute[V] = js.native
    
    def subscribe(path: String, handler: Handler[V]): Unit = js.native
    def subscribe(path: String, handler: Handler[V], store: Any): Unit = js.native
    def subscribe(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def subscribe(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("subscribe")
    var subscribe_Original: ShortHandRoute[V] = js.native
    
    def trace(path: String, handler: Handler[V]): Unit = js.native
    def trace(path: String, handler: Handler[V], store: Any): Unit = js.native
    def trace(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def trace(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("trace")
    var trace_Original: ShortHandRoute[V] = js.native
    
    def unbind(path: String, handler: Handler[V]): Unit = js.native
    def unbind(path: String, handler: Handler[V], store: Any): Unit = js.native
    def unbind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unbind(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("unbind")
    var unbind_Original: ShortHandRoute[V] = js.native
    
    def unlink(path: String, handler: Handler[V]): Unit = js.native
    def unlink(path: String, handler: Handler[V], store: Any): Unit = js.native
    def unlink(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unlink(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("unlink")
    var unlink_Original: ShortHandRoute[V] = js.native
    
    def unlock(path: String, handler: Handler[V]): Unit = js.native
    def unlock(path: String, handler: Handler[V], store: Any): Unit = js.native
    def unlock(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unlock(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("unlock")
    var unlock_Original: ShortHandRoute[V] = js.native
    
    def unsubscribe(path: String, handler: Handler[V]): Unit = js.native
    def unsubscribe(path: String, handler: Handler[V], store: Any): Unit = js.native
    def unsubscribe(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unsubscribe(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("unsubscribe")
    var unsubscribe_Original: ShortHandRoute[V] = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    V extends find-my-way.find-my-way.HTTPVersion.V1 ? node.http.IncomingMessage : node.http2.Http2ServerRequest
    }}}
    */
  type Req[V] = IncomingMessage
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    V extends find-my-way.find-my-way.HTTPVersion.V1 ? node.http.ServerResponse<node.http.IncomingMessage> : node.http2.Http2ServerResponse
    }}}
    */
  type Res[V] = ServerResponse[IncomingMessage]
  
  trait RouteOptions extends StObject {
    
    var constraints: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object RouteOptions {
    
    inline def apply(): RouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
      
      inline def setConstraints(value: StringDictionary[Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    }
  }
  
  @js.native
  trait ShortHandRoute[V /* <: HTTPVersion */] extends StObject {
    
    def apply(path: String, handler: Handler[V]): Unit = js.native
    def apply(path: String, handler: Handler[V], store: Any): Unit = js.native
    def apply(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def apply(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
  }
}
