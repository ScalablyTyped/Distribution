package typings.expressServeStaticCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.expressServeStaticCore.expressServeStaticCoreStrings.auto
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Application
    extends IRouter
       with typings.expressServeStaticCore.Express.Application {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* req */ Request, arg2: /* res */ Response, arg3: /* next */ js.UndefOr[NextFunction]): Any = js.native
    
    def configure(env0: String, env1: String, env2: String, env3: String, env4: String, fn: js.Function): Application = js.native
    def configure(env0: String, env1: String, env2: String, env3: String, fn: js.Function): Application = js.native
    def configure(env0: String, env1: String, env2: String, fn: js.Function): Application = js.native
    def configure(env0: String, env1: String, fn: js.Function): Application = js.native
    def configure(env0: String, fn: js.Function): Application = js.native
    /**
      * Configure callback for zero or more envs,
      * when no `env` is specified that callback will
      * be invoked for all environments. Any combination
      * can be used multiple times, in any order desired.
      *
      * Examples:
      *
      *    app.configure(function(){
      *      // executed for all envs
      *    });
      *
      *    app.configure('stage', function(){
      *      // executed staging env
      *    });
      *
      *    app.configure('stage', 'production', function(){
      *      // executed for stage and production
      *    });
      *
      * Note:
      *
      *  These callbacks are invoked immediately, and
      *  are effectively sugar for the following:
      *
      *     var env = process.env.NODE_ENV || 'development';
      *
      *      switch (env) {
      *        case 'development':
      *          ...
      *          break;
      *        case 'stage':
      *          ...
      *          break;
      *        case 'production':
      *          ...
      *          break;
      *      }
      *
      * @param env
      * @param fn
      */
    def configure(fn: js.Function): Application = js.native
    
    /**
      * Initialize application configuration.
      */
    def defaultConfiguration(): Unit = js.native
    
    /**
      * Disable `setting`.
      *
      * @param setting
      */
    def disable(setting: String): Application = js.native
    
    /**
      * Check if `setting` is disabled.
      *
      *    app.disabled('foo')
      *    // => true
      *
      *    app.enable('foo')
      *    app.disabled('foo')
      *    // => false
      *
      * @param setting
      */
    def disabled(setting: String): Boolean = js.native
    
    /**
      * Enable `setting`.
      *
      * @param setting
      */
    def enable(setting: String): Application = js.native
    
    /**
      * Check if `setting` is enabled (truthy).
      *
      *    app.enabled('foo')
      *    // => false
      *
      *    app.enable('foo')
      *    app.enabled('foo')
      *    // => true
      */
    def enabled(setting: String): Boolean = js.native
    
    /**
      * Register the given template engine callback `fn`
      * as `ext`.
      *
      * By default will `require()` the engine based on the
      * file extension. For example if you try to render
      * a "foo.jade" file Express will invoke the following internally:
      *
      *     app.engine('jade', require('jade').__express);
      *
      * For engines that do not provide `.__express` out of the box,
      * or if you wish to "map" a different extension to the template engine
      * you may use this method. For example mapping the EJS template engine to
      * ".html" files:
      *
      *     app.engine('html', require('ejs').renderFile);
      *
      * In this case EJS provides a `.renderFile()` method with
      * the same signature that Express expects: `(path, options, callback)`,
      * though note that it aliases this method as `ejs.__express` internally
      * so if you're using ".ejs" extensions you dont need to do anything.
      *
      * Some template engines do not follow this convention, the
      * [Consolidate.js](https://github.com/visionmedia/consolidate.js)
      * library was created to map all of node's popular template
      * engines to follow this convention, thus allowing them to
      * work seamlessly within Express.
      */
    def engine(ext: String, fn: js.Function): Application = js.native
    
    def get(name: String): Any = js.native
    
    /**
      * Initialize the server.
      *
      *   - setup default configuration
      *   - setup default middleware
      *   - setup route reflection methods
      */
    def init(): Unit = js.native
    
    def listen(handle: Any): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(handle: Any, listeningListener: js.Function): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(path: String): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(path: String, callback: js.Function): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(port: Double): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(port: Double, callback: js.Function): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(port: Double, hostname: String): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    /**
      * Listen for connections.
      *
      * A node `http.Server` is returned, with this
      * application (which is a `Function`) as its
      * callback. If you wish to create both an HTTP
      * and HTTPS server you may do so with the "http"
      * and "https" modules as shown here:
      *
      *    var http = require('http')
      *      , https = require('https')
      *      , express = require('express')
      *      , app = express();
      *
      *    http.createServer(app).listen(80);
      *    https.createServer({ ... }, app).listen(443);
      */
    def listen(port: Double, hostname: String, backlog: Double): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(port: Double, hostname: String, backlog: Double, callback: js.Function): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(port: Double, hostname: String, callback: js.Function): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    
    var locals: Any = js.native
    
    var map: Any = js.native
    
    def param(name: js.Array[String], handler: RequestParamHandler): this.type = js.native
    
    /**
      * Return the app's absolute pathname
      * based on the parent(s) that have
      * mounted it.
      *
      * For example if the application was
      * mounted as "/admin", which itself
      * was mounted as "/blog" then the
      * return value would be "/blog/admin".
      */
    def path(): String = js.native
    
    /**
      * Render the given view `name` name with `options`
      * and a callback accepting an error and the
      * rendered template string.
      *
      * Example:
      *
      *    app.render('email', { name: 'Tobi' }, function(err, html){
      *      // ...
      *    })
      *
      * @param name
      * @param options or fn
      * @param fn
      */
    def render(name: String): Unit = js.native
    def render(name: String, callback: js.Function2[/* err */ js.Error, /* html */ String, Unit]): Unit = js.native
    def render(name: String, options: js.Object): Unit = js.native
    def render(
      name: String,
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* html */ String, Unit]
    ): Unit = js.native
    def render(name: String, options: Unit, callback: js.Function2[/* err */ js.Error, /* html */ String, Unit]): Unit = js.native
    
    var resource: Any = js.native
    
    var router: String = js.native
    
    /**
      * The app.routes object houses all of the routes defined mapped by the
      * associated HTTP verb. This object may be used for introspection
      * capabilities, for example Express uses this internally not only for
      * routing but to provide default OPTIONS behaviour unless app.options()
      * is used. Your application or framework may also remove routes by
      * simply by removing them from this object.
      */
    var routes: Any = js.native
    
    /**
      * Assign `setting` to `val`, or return `setting`'s value.
      *
      *    app.set('foo', 'bar');
      *    app.get('foo');
      *    // => "bar"
      *    app.set('foo', ['bar', 'baz']);
      *    app.get('foo');
      *    // => ["bar", "baz"]
      *
      * Mounted servers inherit their parent server's settings.
      *
      * @param setting
      * @param val
      */
    def set(setting: String, `val`: Any): Application = js.native
    
    var settings: Any = js.native
  }
  
  trait CookieOptions extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[js.Date | Boolean] = js.undefined
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean | auto] = js.undefined
    
    var signed: js.UndefOr[Boolean] = js.undefined
  }
  object CookieOptions {
    
    inline def apply(): CookieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CookieOptions] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: js.Date | Boolean): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean | auto): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
  
  type Errback = js.Function1[/* err */ js.Error, Unit]
  
  type ErrorRequestHandler = js.Function4[/* err */ Any, /* req */ Request, /* res */ Response, /* next */ NextFunction, Any]
  
  @js.native
  trait Express extends Application {
    
    def apply(): Application = js.native
    
    var application: Any = js.native
    
    /**
      * Create an express application.
      */
    def createApplication(): Application = js.native
    
    def createServer(): Application = js.native
    
    /**
      * Expose mime.
      */
    var mime: String = js.native
    
    var request: Request = js.native
    
    var response: Response = js.native
    
    /**
      * Framework version.
      */
    var version: String = js.native
  }
  
  type Handler = RequestHandler
  
  trait IRoute extends StObject {
    
    def all(handlers: (RequestHandler | RequestHandlerParams)*): this.type
    @JSName("all")
    var all_Original: IRouterHandler[this.type]
    
    def delete(handlers: (RequestHandler | RequestHandlerParams)*): this.type
    @JSName("delete")
    var delete_Original: IRouterHandler[this.type]
    
    def get(handlers: (RequestHandler | RequestHandlerParams)*): this.type
    @JSName("get")
    var get_Original: IRouterHandler[this.type]
    
    def head(handlers: (RequestHandler | RequestHandlerParams)*): this.type
    @JSName("head")
    var head_Original: IRouterHandler[this.type]
    
    def options(handlers: (RequestHandler | RequestHandlerParams)*): this.type
    @JSName("options")
    var options_Original: IRouterHandler[this.type]
    
    def patch(handlers: (RequestHandler | RequestHandlerParams)*): this.type
    @JSName("patch")
    var patch_Original: IRouterHandler[this.type]
    
    var path: String
    
    def post(handlers: (RequestHandler | RequestHandlerParams)*): this.type
    @JSName("post")
    var post_Original: IRouterHandler[this.type]
    
    def put(handlers: (RequestHandler | RequestHandlerParams)*): this.type
    @JSName("put")
    var put_Original: IRouterHandler[this.type]
    
    var stack: Any
  }
  object IRoute {
    
    inline def apply(
      all: IRouterHandler[IRoute],
      delete: IRouterHandler[IRoute],
      get: IRouterHandler[IRoute],
      head: IRouterHandler[IRoute],
      options: IRouterHandler[IRoute],
      patch: IRouterHandler[IRoute],
      path: String,
      post: IRouterHandler[IRoute],
      put: IRouterHandler[IRoute],
      stack: Any
    ): IRoute = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRoute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRoute] (val x: Self) extends AnyVal {
      
      inline def setAll(value: IRouterHandler[IRoute]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: IRouterHandler[IRoute]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setGet(value: IRouterHandler[IRoute]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setHead(value: IRouterHandler[IRoute]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: IRouterHandler[IRoute]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: IRouterHandler[IRoute]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPost(value: IRouterHandler[IRoute]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPut(value: IRouterHandler[IRoute]): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      inline def setStack(value: Any): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRouter extends RequestHandler {
    
    /**
      * Special-cased "all" method, applying the given route `path`,
      * middleware, and callback to _every_ HTTP method.
      *
      * @param path
      * @param fn
      */
    def all(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    /**
      * Special-cased "all" method, applying the given route `path`,
      * middleware, and callback to _every_ HTTP method.
      *
      * @param path
      * @param fn
      */
    @JSName("all")
    var all_Original: IRouterMatcher[this.type] = js.native
    
    def delete(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    @JSName("delete")
    var delete_Original: IRouterMatcher[this.type] = js.native
    
    def get(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    @JSName("get")
    var get_Original: IRouterMatcher[this.type] = js.native
    
    def head(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    @JSName("head")
    var head_Original: IRouterMatcher[this.type] = js.native
    
    def options(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    @JSName("options")
    var options_Original: IRouterMatcher[this.type] = js.native
    
    // Alternatively, you can pass only a callback, in which case you have the opportunity to alter the app.param() API
    // deprecated since express 4.11.0
    def param(callback: js.Function2[/* name */ String, /* matcher */ js.RegExp, RequestParamHandler]): this.type = js.native
    /**
      * Map the given param placeholder `name`(s) to the given callback(s).
      *
      * Parameter mapping is used to provide pre-conditions to routes
      * which use normalized placeholders. For example a _:user_id_ parameter
      * could automatically load a user's information from the database without
      * any additional code,
      *
      * The callback uses the samesignature as middleware, the only differencing
      * being that the value of the placeholder is passed, in this case the _id_
      * of the user. Once the `next()` function is invoked, just like middleware
      * it will continue on to execute the route, or subsequent parameter functions.
      *
      *      app.param('user_id', function(req, res, next, id){
      *        User.find(id, function(err, user){
      *          if (err) {
      *            next(err);
      *          } else if (user) {
      *            req.user = user;
      *            next();
      *          } else {
      *            next(new Error('failed to load user'));
      *          }
      *        });
      *      });
      *
      * @param name
      * @param fn
      */
    def param(name: String, handler: RequestParamHandler): this.type = js.native
    
    def patch(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    @JSName("patch")
    var patch_Original: IRouterMatcher[this.type] = js.native
    
    def post(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    @JSName("post")
    var post_Original: IRouterMatcher[this.type] = js.native
    
    def put(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    @JSName("put")
    var put_Original: IRouterMatcher[this.type] = js.native
    
    def route(prefix: PathParams): IRoute = js.native
    
    def use(handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    def use(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
    @JSName("use")
    var use_Original: IRouterHandler[this.type] & IRouterMatcher[this.type] = js.native
  }
  
  @js.native
  trait IRouterHandler[T] extends StObject {
    
    def apply(handlers: (RequestHandler | RequestHandlerParams)*): T = js.native
  }
  
  @js.native
  trait IRouterMatcher[T] extends StObject {
    
    def apply(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): T = js.native
  }
  
  trait MediaType extends StObject {
    
    var quality: Double
    
    var subtype: String
    
    var `type`: String
    
    var value: String
  }
  object MediaType {
    
    inline def apply(quality: Double, subtype: String, `type`: String, value: String): MediaType = {
      val __obj = js.Dynamic.literal(quality = quality.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type NextFunction = js.Function1[/* err */ js.UndefOr[Any], Unit]
  
  type PathParams = String | js.RegExp | (js.Array[String | js.RegExp])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify http.ServerRequest * / any */ @js.native
  trait Request
    extends StObject
       with typings.expressServeStaticCore.Express.Request {
    
    /**
      * Return an array of Accepted media types
      * ordered from highest quality to lowest.
      */
    var accepted: js.Array[MediaType] = js.native
    
    /**
      * Check if the given `type(s)` is acceptable, returning
      * the best match when true, otherwise `undefined`, in which
      * case you should respond with 406 "Not Acceptable".
      *
      * The `type` value may be a single mime type string
      * such as "application/json", the extension name
      * such as "json", a comma-delimted list such as "json, html, text/plain",
      * or an array `["json", "html", "text/plain"]`. When a list
      * or array is given the _best_ match, if any is returned.
      *
      * Examples:
      *
      *     // Accept: text/html
      *     req.accepts('html');
      *     // => "html"
      *
      *     // Accept: text/ *, application/json
      *     req.accepts('html');
      *     // => "html"
      *     req.accepts('text/html');
      *     // => "text/html"
      *     req.accepts('json, text');
      *     // => "json"
      *     req.accepts('application/json');
      *     // => "application/json"
      *
      *     // Accept: text/ *, application/json
      *     req.accepts('image/png');
      *     req.accepts('png');
      *     // => undefined
      *
      *     // Accept: text/ *;q=.5, application/json
      *     req.accepts(['html', 'json']);
      *     req.accepts('html, json');
      *     // => "json"
      */
    def accepts(): js.Array[String] = js.native
    def accepts(`type`: String*): String | Boolean = js.native
    def accepts(`type`: String): String | Boolean = js.native
    def accepts(`type`: js.Array[String]): String | Boolean = js.native
    
    /**
      * Returns the first accepted charset of the specified character sets,
      * based on the request's Accept-Charset HTTP header field.
      * If none of the specified charsets is accepted, returns false.
      *
      * For more information, or if you have issues or concerns, see accepts.
      * @param charset
      */
    def acceptsCharsets(): js.Array[String] = js.native
    def acceptsCharsets(charset: String*): String | Boolean = js.native
    def acceptsCharsets(charset: String): String | Boolean = js.native
    def acceptsCharsets(charset: js.Array[String]): String | Boolean = js.native
    
    /**
      * Returns the first accepted encoding of the specified encodings,
      * based on the request's Accept-Encoding HTTP header field.
      * If none of the specified encodings is accepted, returns false.
      *
      * For more information, or if you have issues or concerns, see accepts.
      * @param encoding
      */
    def acceptsEncodings(): js.Array[String] = js.native
    def acceptsEncodings(encoding: String*): String | Boolean = js.native
    def acceptsEncodings(encoding: String): String | Boolean = js.native
    def acceptsEncodings(encoding: js.Array[String]): String | Boolean = js.native
    
    /**
      * Returns the first accepted language of the specified languages,
      * based on the request's Accept-Language HTTP header field.
      * If none of the specified languages is accepted, returns false.
      *
      * For more information, or if you have issues or concerns, see accepts.
      *
      * @param lang
      */
    def acceptsLanguages(): js.Array[String] = js.native
    def acceptsLanguages(lang: String*): String | Boolean = js.native
    def acceptsLanguages(lang: String): String | Boolean = js.native
    def acceptsLanguages(lang: js.Array[String]): String | Boolean = js.native
    
    var app: Application = js.native
    
    var baseUrl: String = js.native
    
    //body: { username: string; password: string; remember: boolean; title: string; };
    var body: Any = js.native
    
    /**
      * Clear cookie `name`.
      *
      * @param name
      * @param options
      */
    def clearCookie(name: String): Response = js.native
    def clearCookie(name: String, options: Any): Response = js.native
    
    //cookies: { string; remember: boolean; };
    var cookies: Any = js.native
    
    /**
      * Check if the request is fresh, aka
      * Last-Modified and/or the ETag
      * still match.
      */
    var fresh: Boolean = js.native
    
    /**
      * Return request header.
      *
      * The `Referrer` header field is special-cased,
      * both `Referrer` and `Referer` are interchangeable.
      *
      * Examples:
      *
      *     req.get('Content-Type');
      *     // => "text/plain"
      *
      *     req.get('content-type');
      *     // => "text/plain"
      *
      *     req.get('Something');
      *     // => undefined
      *
      * Aliased as `req.header()`.
      *
      * @param name
      */
    def get(name: String): String = js.native
    
    def header(name: String): String = js.native
    
    var headers: StringDictionary[String] = js.native
    
    /**
      * @deprecated Use hostname instead.
      */
    var host: String = js.native
    
    /**
      * Parse the "Host" header field hostname.
      */
    var hostname: String = js.native
    
    /**
      * Return the remote address, or when
      * "trust proxy" is `true` return
      * the upstream addr.
      */
    var ip: String = js.native
    
    /**
      * When "trust proxy" is `true`, parse
      * the "X-Forwarded-For" ip address list.
      *
      * For example if the value were "client, proxy1, proxy2"
      * you would receive the array `["client", "proxy1", "proxy2"]`
      * where "proxy2" is the furthest down-stream.
      */
    var ips: js.Array[String] = js.native
    
    /**
      * Check if the incoming request contains the "Content-Type"
      * header field, and it contains the give mime `type`.
      *
      * Examples:
      *
      *      // With Content-Type: text/html; charset=utf-8
      *      req.is('html');
      *      req.is('text/html');
      *      req.is('text/ *');
      *      // => true
      *
      *      // When Content-Type is application/json
      *      req.is('json');
      *      req.is('application/json');
      *      req.is('application/ *');
      *      // => true
      *
      *      req.is('html');
      *      // => false
      *
      * @param type
      */
    def is(`type`: String): Boolean = js.native
    
    var method: String = js.native
    
    var originalUrl: String = js.native
    
    /**
      * @deprecated Use either req.params, req.body or req.query, as applicable.
      *
      * Return the value of param `name` when present or `defaultValue`.
      *
      *  - Checks route placeholders, ex: _/user/:id_
      *  - Checks body params, ex: id=12, {"id":12}
      *  - Checks query string params, ex: ?id=12
      *
      * To utilize request bodies, `req.body`
      * should be an object. This can be done by using
      * the `connect.bodyParser()` middleware.
      *
      * @param name
      * @param defaultValue
      */
    def param(name: String): String = js.native
    def param(name: String, defaultValue: Any): String = js.native
    
    var params: Any = js.native
    
    /**
      * Short-hand for `url.parse(req.url).pathname`.
      */
    var path: String = js.native
    
    /**
      * Return the protocol string "http" or "https"
      * when requested with TLS. When the "trust proxy"
      * setting is enabled the "X-Forwarded-Proto" header
      * field will be trusted. If you're running behind
      * a reverse proxy that supplies https for you this
      * may be enabled.
      */
    var protocol: String = js.native
    
    var query: Any = js.native
    
    /**
      * Parse Range header field,
      * capping to the given `size`.
      *
      * Unspecified ranges such as "0-" require
      * knowledge of your resource length. In
      * the case of a byte range this is of course
      * the total number of bytes. If the Range
      * header field is not given `null` is returned,
      * `-1` when unsatisfiable, `-2` when syntactically invalid.
      *
      * NOTE: remember that ranges are inclusive, so
      * for example "Range: users=0-3" should respond
      * with 4 users when available, not 3.
      *
      * @param size
      */
    def range(size: Double): js.Array[Any] = js.native
    
    var route: Any = js.native
    
    /**
      * Short-hand for:
      *
      *    req.protocol == 'https'
      */
    var secure: Boolean = js.native
    
    var signedCookies: Any = js.native
    
    /**
      * Check if the request is stale, aka
      * "Last-Modified" and / or the "ETag" for the
      * resource has changed.
      */
    var stale: Boolean = js.native
    
    /**
      * Return subdomains as an array.
      *
      * Subdomains are the dot-separated parts of the host before the main domain of
      * the app. By default, the domain of the app is assumed to be the last two
      * parts of the host. This can be changed by setting "subdomain offset".
      *
      * For example, if the domain is "tobi.ferrets.example.com":
      * If "subdomain offset" is not set, req.subdomains is `["ferrets", "tobi"]`.
      * If "subdomain offset" is 3, req.subdomains is `["tobi"]`.
      */
    var subdomains: js.Array[String] = js.native
    
    var url: String = js.native
    
    /**
      * Check if the request was an _XMLHttpRequest_.
      */
    var xhr: Boolean = js.native
  }
  
  type RequestHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ js.UndefOr[NextFunction], Any]
  
  type RequestHandlerParams = RequestHandler | ErrorRequestHandler | (js.Array[RequestHandler | ErrorRequestHandler])
  
  type RequestParamHandler = js.Function5[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ NextFunction, 
    /* value */ Any, 
    /* name */ String, 
    Any
  ]
  
  @js.native
  trait Response
    extends ServerResponse[IncomingMessage]
       with typings.expressServeStaticCore.Express.Response {
    
    /**
      * Set _Content-Disposition_ header to _attachment_ with optional `filename`.
      *
      * @param filename
      */
    def attachment(): Response = js.native
    def attachment(filename: String): Response = js.native
    
    var charset: String = js.native
    
    /**
      * Clear cookie `name`.
      *
      * @param name
      * @param options
      */
    def clearCookie(name: String): Response = js.native
    def clearCookie(name: String, options: Any): Response = js.native
    
    /**
      * Set _Content-Type_ response header with `type` through `mime.lookup()`
      * when it does not contain "/", or set the Content-Type to `type` otherwise.
      *
      * Examples:
      *
      *     res.type('.html');
      *     res.type('html');
      *     res.type('json');
      *     res.type('application/json');
      *     res.type('png');
      *
      * @param type
      */
    def contentType(`type`: String): Response = js.native
    
    /**
      * Set cookie `name` to `val`, with the given `options`.
      *
      * Options:
      *
      *    - `maxAge`   max-age in milliseconds, converted to `expires`
      *    - `signed`   sign the cookie
      *    - `path`     defaults to "/"
      *
      * Examples:
      *
      *    // "Remember Me" for 15 minutes
      *    res.cookie('rememberme', '1', { expires: new Date(Date.now() + 900000), httpOnly: true });
      *
      *    // save as above
      *    res.cookie('rememberme', '1', { maxAge: 900000, httpOnly: true })
      */
    def cookie(name: String, `val`: String, options: CookieOptions): Response = js.native
    def cookie(name: String, `val`: Any): Response = js.native
    def cookie(name: String, `val`: Any, options: CookieOptions): Response = js.native
    
    /**
      * Transfer the file at the given `path` as an attachment.
      *
      * Optionally providing an alternate attachment `filename`,
      * and optional callback `fn(err)`. The callback is invoked
      * when the data transfer is complete, or when an error has
      * ocurred. Be sure to check `res.headerSent` if you plan to respond.
      *
      * This method uses `res.sendfile()`.
      */
    def download(path: String): Unit = js.native
    def download(path: String, filename: String): Unit = js.native
    def download(path: String, filename: String, fn: Errback): Unit = js.native
    def download(path: String, fn: Errback): Unit = js.native
    
    /**
      * Respond to the Acceptable formats using an `obj`
      * of mime-type callbacks.
      *
      * This method uses `req.accepted`, an array of
      * acceptable types ordered by their quality values.
      * When "Accept" is not present the _first_ callback
      * is invoked, otherwise the first match is used. When
      * no match is performed the server responds with
      * 406 "Not Acceptable".
      *
      * Content-Type is set for you, however if you choose
      * you may alter this within the callback using `res.type()`
      * or `res.set('Content-Type', ...)`.
      *
      *    res.format({
      *      'text/plain': function(){
      *        res.send('hey');
      *      },
      *
      *      'text/html': function(){
      *        res.send('<p>hey</p>');
      *      },
      *
      *      'appliation/json': function(){
      *        res.send({ message: 'hey' });
      *      }
      *    });
      *
      * In addition to canonicalized MIME types you may
      * also use extnames mapped to these types:
      *
      *    res.format({
      *      text: function(){
      *        res.send('hey');
      *      },
      *
      *      html: function(){
      *        res.send('<p>hey</p>');
      *      },
      *
      *      json: function(){
      *        res.send({ message: 'hey' });
      *      }
      *    });
      *
      * By default Express passes an `Error`
      * with a `.status` of 406 to `next(err)`
      * if a match is not made. If you provide
      * a `.default` callback it will be invoked
      * instead.
      *
      * @param obj
      */
    def format(obj: Any): Response = js.native
    
    /**
      * Get value for header `field`.
      *
      * @param field
      */
    def get(field: String): String = js.native
    
    def header(field: String): Response = js.native
    def header(field: String, value: String): Response = js.native
    def header(field: Any): Response = js.native
    
    // Property indicating if HTTP headers has been sent for the response.
    var headersSent: Boolean = js.native
    
    /**
      * Send JSON response.
      *
      * Examples:
      *
      *     res.json(null);
      *     res.json({ user: 'tj' });
      *     res.json(500, 'oh noes!');
      *     res.json(404, 'I dont have that');
      */
    def json(): Response = js.native
    def json(body: Any): Response = js.native
    /**
      * Send JSON response.
      *
      * Examples:
      *
      *     res.json(null);
      *     res.json({ user: 'tj' });
      *     res.json(500, 'oh noes!');
      *     res.json(404, 'I dont have that');
      */
    def json(status: Double): Response = js.native
    def json(status: Double, body: Any): Response = js.native
    /**
      * Send JSON response.
      *
      * Examples:
      *
      *     res.json(null);
      *     res.json({ user: 'tj' });
      *     res.json(500, 'oh noes!');
      *     res.json(404, 'I dont have that');
      */
    @JSName("json")
    var json_Original: Send = js.native
    
    /**
      * Send JSON response with JSONP callback support.
      *
      * Examples:
      *
      *     res.jsonp(null);
      *     res.jsonp({ user: 'tj' });
      *     res.jsonp(500, 'oh noes!');
      *     res.jsonp(404, 'I dont have that');
      */
    def jsonp(): Response = js.native
    def jsonp(body: Any): Response = js.native
    /**
      * Send JSON response with JSONP callback support.
      *
      * Examples:
      *
      *     res.jsonp(null);
      *     res.jsonp({ user: 'tj' });
      *     res.jsonp(500, 'oh noes!');
      *     res.jsonp(404, 'I dont have that');
      */
    def jsonp(status: Double): Response = js.native
    def jsonp(status: Double, body: Any): Response = js.native
    /**
      * Send JSON response with JSONP callback support.
      *
      * Examples:
      *
      *     res.jsonp(null);
      *     res.jsonp({ user: 'tj' });
      *     res.jsonp(500, 'oh noes!');
      *     res.jsonp(404, 'I dont have that');
      */
    @JSName("jsonp")
    var jsonp_Original: Send = js.native
    
    /**
      * Set Link header field with the given `links`.
      *
      * Examples:
      *
      *    res.links({
      *      next: 'http://api.example.com/users?page=2',
      *      last: 'http://api.example.com/users?page=5'
      *    });
      *
      * @param links
      */
    def links(links: Any): Response = js.native
    
    var locals: Any = js.native
    
    /**
      * Set the location header to `url`.
      *
      * The given `url` can also be the name of a mapped url, for
      * example by default express supports "back" which redirects
      * to the _Referrer_ or _Referer_ headers or "/".
      *
      * Examples:
      *
      *    res.location('/foo/bar').;
      *    res.location('http://example.com');
      *    res.location('../login'); // /blog/post/1 -> /blog/login
      *
      * Mounting:
      *
      *   When an application is mounted and `res.location()`
      *   is given a path that does _not_ lead with "/" it becomes
      *   relative to the mount-point. For example if the application
      *   is mounted at "/blog", the following would become "/blog/login".
      *
      *      res.location('login');
      *
      *   While the leading slash would result in a location of "/login":
      *
      *      res.location('/login');
      *
      * @param url
      */
    def location(url: String): Response = js.native
    
    def redirect(status: Double, url: String): Unit = js.native
    /**
      * Redirect to the given `url` with optional response `status`
      * defaulting to 302.
      *
      * The resulting `url` is determined by `res.location()`, so
      * it will play nicely with mounted apps, relative paths,
      * `"back"` etc.
      *
      * Examples:
      *
      *    res.redirect('/foo/bar');
      *    res.redirect('http://example.com');
      *    res.redirect(301, 'http://example.com');
      *    res.redirect('http://example.com', 301);
      *    res.redirect('../login'); // /blog/post/1 -> /blog/login
      */
    def redirect(url: String): Unit = js.native
    def redirect(url: String, status: Double): Unit = js.native
    
    /**
      * Render `view` with the given `options` and optional callback `fn`.
      * When a callback function is given a response will _not_ be made
      * automatically, otherwise a response of _200_ and _text/html_ is given.
      *
      * Options:
      *
      *  - `cache`     boolean hinting to the engine it should cache
      *  - `filename`  filename of the view being rendered
      */
    def render(view: String): Unit = js.native
    def render(view: String, callback: js.Function2[/* err */ js.Error, /* html */ String, Unit]): Unit = js.native
    def render(view: String, options: js.Object): Unit = js.native
    def render(
      view: String,
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* html */ String, Unit]
    ): Unit = js.native
    def render(view: String, options: Unit, callback: js.Function2[/* err */ js.Error, /* html */ String, Unit]): Unit = js.native
    
    /**
      * Send a response.
      *
      * Examples:
      *
      *     res.send(new Buffer('wahoo'));
      *     res.send({ some: 'json' });
      *     res.send('<p>some html</p>');
      *     res.send(404, 'Sorry, cant find that');
      *     res.send(404);
      */
    def send(): Response = js.native
    def send(body: Any): Response = js.native
    /**
      * Send a response.
      *
      * Examples:
      *
      *     res.send(new Buffer('wahoo'));
      *     res.send({ some: 'json' });
      *     res.send('<p>some html</p>');
      *     res.send(404, 'Sorry, cant find that');
      *     res.send(404);
      */
    def send(status: Double): Response = js.native
    def send(status: Double, body: Any): Response = js.native
    
    /**
      * Transfer the file at the given `path`.
      *
      * Automatically sets the _Content-Type_ response header field.
      * The callback `fn(err)` is invoked when the transfer is complete
      * or when an error occurs. Be sure to check `res.sentHeader`
      * if you wish to attempt responding, as the header and some data
      * may have already been transferred.
      *
      * Options:
      *
      *   - `maxAge`   defaulting to 0 (can be string converted by `ms`)
      *   - `root`     root directory for relative filenames
      *   - `headers`  object of headers to serve with file
      *   - `dotfiles` serve dotfiles, defaulting to false; can be `"allow"` to send them
      *
      * Other options are passed along to `send`.
      *
      * Examples:
      *
      *  The following example illustrates how `res.sendFile()` may
      *  be used as an alternative for the `static()` middleware for
      *  dynamic situations. The code backing `res.sendFile()` is actually
      *  the same code, so HTTP cache support etc is identical.
      *
      *     app.get('/user/:uid/photos/:file', function(req, res){
      *       var uid = req.params.uid
      *         , file = req.params.file;
      *
      *       req.user.mayViewFilesFrom(uid, function(yes){
      *         if (yes) {
      *           res.sendFile('/uploads/' + uid + '/' + file);
      *         } else {
      *           res.send(403, 'Sorry! you cant see that.');
      *         }
      *       });
      *     });
      *
      * @api public
      */
    def sendFile(path: String): Unit = js.native
    def sendFile(path: String, fn: Errback): Unit = js.native
    def sendFile(path: String, options: Any): Unit = js.native
    def sendFile(path: String, options: Any, fn: Errback): Unit = js.native
    
    /**
      * Set the response HTTP status code to `statusCode` and send its string representation as the response body.
      * @link http://expressjs.com/4x/api.html#res.sendStatus
      *
      * Examples:
      *
      *    res.sendStatus(200); // equivalent to res.status(200).send('OK')
      *    res.sendStatus(403); // equivalent to res.status(403).send('Forbidden')
      *    res.sendStatus(404); // equivalent to res.status(404).send('Not Found')
      *    res.sendStatus(500); // equivalent to res.status(500).send('Internal Server Error')
      *
      * @param code
      */
    def sendStatus(code: Double): Response = js.native
    
    /**
      * Send a response.
      *
      * Examples:
      *
      *     res.send(new Buffer('wahoo'));
      *     res.send({ some: 'json' });
      *     res.send('<p>some html</p>');
      *     res.send(404, 'Sorry, cant find that');
      *     res.send(404);
      */
    @JSName("send")
    var send_Original: Send = js.native
    
    /**
      * @deprecated Use sendFile instead.
      */
    def sendfile(path: String): Unit = js.native
    /**
      * @deprecated Use sendFile instead.
      */
    def sendfile(path: String, fn: Errback): Unit = js.native
    /**
      * @deprecated Use sendFile instead.
      */
    def sendfile(path: String, options: Any): Unit = js.native
    /**
      * @deprecated Use sendFile instead.
      */
    def sendfile(path: String, options: Any, fn: Errback): Unit = js.native
    
    def set(field: String): Response = js.native
    def set(field: String, value: String): Response = js.native
    /**
      * Set header `field` to `val`, or pass
      * an object of header fields.
      *
      * Examples:
      *
      *    res.set('Foo', ['bar', 'baz']);
      *    res.set('Accept', 'application/json');
      *    res.set({ Accept: 'text/plain', 'X-API-Key': 'tobi' });
      *
      * Aliased as `res.header()`.
      */
    def set(field: Any): Response = js.native
    
    /**
      * Set status `code`.
      *
      * @param code
      */
    def status(code: Double): Response = js.native
    
    /**
      * Set _Content-Type_ response header with `type` through `mime.lookup()`
      * when it does not contain "/", or set the Content-Type to `type` otherwise.
      *
      * Examples:
      *
      *     res.type('.html');
      *     res.type('html');
      *     res.type('json');
      *     res.type('application/json');
      *     res.type('png');
      *
      * @param type
      */
    def `type`(`type`: String): Response = js.native
    
    /**
      * Adds the field to the Vary response header, if it is not there already.
      * Examples:
      *
      *     res.vary('User-Agent').render('docs');
      *
      */
    def vary(field: String): Response = js.native
  }
  
  type Router = IRouter
  
  @js.native
  trait Send extends StObject {
    
    def apply(): Response = js.native
    def apply(body: Any): Response = js.native
    def apply(status: Double): Response = js.native
    def apply(status: Double, body: Any): Response = js.native
  }
}
