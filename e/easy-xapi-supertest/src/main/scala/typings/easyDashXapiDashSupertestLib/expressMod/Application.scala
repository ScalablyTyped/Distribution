package typings
package easyDashXapiDashSupertestLib.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application
  extends IRouter[Application]
     with easyDashXapiDashSupertestLib.ExpressNs.Application {
  @JSName("get")
  var get_Original_Application: easyDashXapiDashSupertestLib.Fn_Handlers = js.native
  var locals: js.Any = js.native
  var map: js.Any = js.native
  var resource: js.Any = js.native
  var router: java.lang.String = js.native
  /**
    * The app.routes object houses all of the routes defined mapped by the
    * associated HTTP verb. This object may be used for introspection
    * capabilities, for example Express uses this internally not only for
    * routing but to provide default OPTIONS behaviour unless app.options()
    * is used. Your application or framework may also remove routes by
    * simply by removing them from this object.
    */
  var routes: js.Any = js.native
  var settings: js.Any = js.native
  /* InferMemberOverrides */
  override def apply(T0: /* req */ Request, T1: /* res */ Response, T2: /* next */ js.Function): js.Any = js.native
  def configure(
    env0: java.lang.String,
    env1: java.lang.String,
    env2: java.lang.String,
    env3: java.lang.String,
    env4: java.lang.String,
    fn: js.Function
  ): Application = js.native
  def configure(
    env0: java.lang.String,
    env1: java.lang.String,
    env2: java.lang.String,
    env3: java.lang.String,
    fn: js.Function
  ): Application = js.native
  def configure(env0: java.lang.String, env1: java.lang.String, env2: java.lang.String, fn: js.Function): Application = js.native
  def configure(env0: java.lang.String, env1: java.lang.String, fn: js.Function): Application = js.native
  def configure(env0: java.lang.String, fn: js.Function): Application = js.native
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
  def defaultConfiguration(): scala.Unit = js.native
  /**
    * Disable `setting`.
    *
    * @param setting
    */
  def disable(setting: java.lang.String): Application = js.native
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
  def disabled(setting: java.lang.String): scala.Boolean = js.native
  /**
    * Enable `setting`.
    *
    * @param setting
    */
  def enable(setting: java.lang.String): Application = js.native
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
  def enabled(setting: java.lang.String): scala.Boolean = js.native
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
  def engine(ext: java.lang.String, fn: js.Function): Application = js.native
  def get(name: java.lang.String): js.Any = js.native
  /**
    * Initialize the server.
    *
    *   - setup default configuration
    *   - setup default middleware
    *   - setup route reflection methods
    */
  def init(): scala.Unit = js.native
  def listen(handle: js.Any): easyDashXapiDashSupertestLib.httpMod.Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function): easyDashXapiDashSupertestLib.httpMod.Server = js.native
  def listen(path: java.lang.String): easyDashXapiDashSupertestLib.httpMod.Server = js.native
  def listen(path: java.lang.String, callback: js.Function): easyDashXapiDashSupertestLib.httpMod.Server = js.native
  def listen(port: scala.Double): easyDashXapiDashSupertestLib.httpMod.Server = js.native
  def listen(port: scala.Double, callback: js.Function): easyDashXapiDashSupertestLib.httpMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String): easyDashXapiDashSupertestLib.httpMod.Server = js.native
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
  def listen(port: scala.Double, hostname: java.lang.String, backlog: scala.Double): easyDashXapiDashSupertestLib.httpMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, backlog: scala.Double, callback: js.Function): easyDashXapiDashSupertestLib.httpMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, callback: js.Function): easyDashXapiDashSupertestLib.httpMod.Server = js.native
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
  def path(): java.lang.String = js.native
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
  def render(name: java.lang.String): scala.Unit = js.native
  def render(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def render(name: java.lang.String, options: js.Object): scala.Unit = js.native
  def render(
    name: java.lang.String,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
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
  def set(setting: java.lang.String, `val`: js.Any): Application = js.native
}

