package typings.emberDebug

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/debug", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def assert(desc: String): Unit | scala.Nothing = js.native
  def assert(desc: String, test: js.Any): Unit | scala.Nothing = js.native
  def debug(message: String): Unit = js.native
  def deprecate(message: String, test: Boolean, options: AnonIdUntil): Unit = js.native
  def inspect(obj: js.Any): String = js.native
  def registerDeprecationHandler(
    handler: js.Function3[/* message */ String, /* options */ AnonId, /* next */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def registerWarnHandler(
    handler: js.Function3[/* message */ String, /* options */ AnonIdString, /* next */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def runInDebug(func: js.Function0[_]): Unit = js.native
  def warn(message: String): Unit = js.native
  def warn(message: String, options: AnonIdString): Unit = js.native
  def warn(message: String, options: AnonIdStringOptional): Unit = js.native
  def warn(message: String, test: Boolean): Unit = js.native
  def warn(message: String, test: Boolean, options: AnonIdString): Unit = js.native
  def warn(message: String, test: Boolean, options: AnonIdStringOptional): Unit = js.native
}

