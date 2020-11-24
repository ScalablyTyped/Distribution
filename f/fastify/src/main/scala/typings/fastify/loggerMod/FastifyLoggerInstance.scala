package typings.fastify.loggerMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyLoggerInstance extends js.Object {
  
  def child(bindings: Bindings): FastifyLoggerInstance = js.native
  
  def debug(msg: String, args: js.Any*): Unit = js.native
  def debug(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def debug(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
  @JSName("debug")
  var debug_Original: FastifyLogFn = js.native
  
  def error(msg: String, args: js.Any*): Unit = js.native
  def error(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def error(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
  @JSName("error")
  var error_Original: FastifyLogFn = js.native
  
  def fatal(msg: String, args: js.Any*): Unit = js.native
  def fatal(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def fatal(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
  @JSName("fatal")
  var fatal_Original: FastifyLogFn = js.native
  
  def info(msg: String, args: js.Any*): Unit = js.native
  def info(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def info(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
  @JSName("info")
  var info_Original: FastifyLogFn = js.native
  
  def trace(msg: String, args: js.Any*): Unit = js.native
  def trace(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def trace(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
  @JSName("trace")
  var trace_Original: FastifyLogFn = js.native
  
  def warn(msg: String, args: js.Any*): Unit = js.native
  def warn(obj: Record[String, _], msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def warn(obj: Record[String, _], msg: String, args: js.Any*): Unit = js.native
  @JSName("warn")
  var warn_Original: FastifyLogFn = js.native
}
