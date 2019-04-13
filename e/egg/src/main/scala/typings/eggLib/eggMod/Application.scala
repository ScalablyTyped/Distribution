package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "Application")
@js.native
class Application () extends EggApplication {
  var controller: IController = js.native
  /**
    * global locals for view
    * @see Context#locals
    */
  var locals: IApplicationLocals = js.native
  @JSName("middleware")
  var middleware_Application: (js.Array[koaLib.koaMod.Middleware[_, js.Object]]) with IMiddleware = js.native
  /**
    * HTTP delete method
    */
  def delete(path: RouterPath, fn: java.lang.String): scala.Unit = js.native
  def delete(path: RouterPath, middleware: js.Any*): scala.Unit = js.native
  /**
    * HTTP get method
    */
  def get(path: RouterPath, fn: java.lang.String): scala.Unit = js.native
  def get(path: RouterPath, middleware: js.Any*): scala.Unit = js.native
  /**
    * HTTP post method
    */
  def post(path: RouterPath, fn: java.lang.String): scala.Unit = js.native
  def post(path: RouterPath, middleware: js.Any*): scala.Unit = js.native
  /**
    * HTTP put method
    */
  def put(path: RouterPath, fn: java.lang.String): scala.Unit = js.native
  def put(path: RouterPath, middleware: js.Any*): scala.Unit = js.native
  def redirect(path: java.lang.String, redirectPath: java.lang.String): scala.Unit = js.native
  /**
    * restful router api
    */
  def resources(name: java.lang.String, prefix: java.lang.String, fn: java.lang.String): Router = js.native
  def resources(path: java.lang.String, prefix: java.lang.String, middleware: js.Any*): Router = js.native
  /**
    * Run async function in the background
    * @see Context#runInBackground
    * @param {Function} scope - the first args is an anonymous ctx
    */
  def runInBackground(scope: js.Function1[/* ctx */ eggDashViewLib.eggMod.Context, scala.Unit]): scala.Unit = js.native
}

