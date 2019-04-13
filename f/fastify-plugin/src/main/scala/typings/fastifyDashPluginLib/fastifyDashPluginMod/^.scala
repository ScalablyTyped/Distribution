package typings
package fastifyDashPluginLib.fastifyDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fastify-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * This function does three things for you:
    *   1. Add the `skip-override` hidden property
    *   2. Check bare-minimum version of Fastify
    *   3. Pass some custom metadata of the plugin to Fastify
    * @param fn Fastify plugin function
    * @param options Optional plugin options
    * @param next The `next` callback is not available when using `async`/`await`. If you do invoke a `next` callback in this situation unexpected behavior may occur.
    */
  def apply[HttpServer, HttpRequest, HttpResponse, T](
    fn: (fastifyLib.fastifyMod.Plugin[HttpServer, HttpRequest, HttpResponse, T]) | (fastifyDashPluginLib.Anon_Default[HttpServer, HttpRequest, HttpResponse, T])
  ): fastifyLib.fastifyMod.Plugin[HttpServer, HttpRequest, HttpResponse, T] = js.native
  def apply[HttpServer, HttpRequest, HttpResponse, T](
    fn: (fastifyLib.fastifyMod.Plugin[HttpServer, HttpRequest, HttpResponse, T]) | (fastifyDashPluginLib.Anon_Default[HttpServer, HttpRequest, HttpResponse, T]),
    options: PluginOptions | java.lang.String
  ): fastifyLib.fastifyMod.Plugin[HttpServer, HttpRequest, HttpResponse, T] = js.native
  def apply[HttpServer, HttpRequest, HttpResponse, T](
    fn: (fastifyLib.fastifyMod.Plugin[HttpServer, HttpRequest, HttpResponse, T]) | (fastifyDashPluginLib.Anon_Default[HttpServer, HttpRequest, HttpResponse, T]),
    options: PluginOptions | java.lang.String,
    next: nextCallback
  ): fastifyLib.fastifyMod.Plugin[HttpServer, HttpRequest, HttpResponse, T] = js.native
}

