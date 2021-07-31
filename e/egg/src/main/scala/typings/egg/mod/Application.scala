package typings.egg.mod

import typings.eggCore.mod.EggCoreOptions
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg", "Application")
@js.native
class Application () extends EggApplication {
  def this(options: EggCoreOptions) = this()
  
  var controller: IController = js.native
  
  /**
    * HTTP delete method
    */
  def delete(path: RouterPath, fn: String): Unit = js.native
  def delete(path: RouterPath, middleware: js.Any*): Unit = js.native
  
  /**
    * HTTP get method
    */
  def get(path: RouterPath, fn: String): Unit = js.native
  def get(path: RouterPath, middleware: js.Any*): Unit = js.native
  
  /**
    * global locals for view
    * @see Context#locals
    */
  var locals: IApplicationLocals = js.native
  
  @JSName("middleware")
  var middleware_Application: (js.Array[Middleware[DefaultState, DefaultContext]]) & IMiddleware = js.native
  
  /**
    * HTTP patch method
    */
  def patch(path: RouterPath, fn: String): Unit = js.native
  def patch(path: RouterPath, middleware: js.Any*): Unit = js.native
  
  /**
    * HTTP post method
    */
  def post(path: RouterPath, fn: String): Unit = js.native
  def post(path: RouterPath, middleware: js.Any*): Unit = js.native
  
  /**
    * HTTP put method
    */
  def put(path: RouterPath, fn: String): Unit = js.native
  def put(path: RouterPath, middleware: js.Any*): Unit = js.native
  
  def redirect(path: String, redirectPath: String): Unit = js.native
  
  /**
    * restful router api
    */
  def resources(name: String, prefix: String, fn: String): Router = js.native
  def resources(path: String, prefix: String, middleware: js.Any*): Router = js.native
  
  /**
    * Run async function in the background
    * @see Context#runInBackground
    * @param {Function} scope - the first args is an anonymous ctx
    */
  def runInBackground(scope: js.Function1[/* ctx */ Context, Unit]): Unit = js.native
}
