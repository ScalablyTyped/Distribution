package typings.atEmberDebug

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/debug", JSImport.Namespace)
@js.native
object atEmberDebugMod extends js.Object {
  def assert(desc: String): Unit | scala.Nothing = js.native
  def assert(desc: String, test: Boolean): Unit | scala.Nothing = js.native
  def debug(message: String): Unit = js.native
  def inspect(obj: js.Any): String = js.native
  def registerDeprecationHandler(
    handler: js.Function3[/* message */ String, /* options */ Anon_Id, /* next */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def registerWarnHandler(
    handler: js.Function3[/* message */ String, /* options */ Anon_IdString, /* next */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def runInDebug(func: js.Function0[_]): Unit = js.native
  def warn(message: String): Unit = js.native
  def warn(message: String, options: Anon_IdString): Unit = js.native
  def warn(message: String, options: Anon_IdStringOptional): Unit = js.native
  def warn(message: String, test: Boolean): Unit = js.native
  def warn(message: String, test: Boolean, options: Anon_IdString): Unit = js.native
  def warn(message: String, test: Boolean, options: Anon_IdStringOptional): Unit = js.native
}

