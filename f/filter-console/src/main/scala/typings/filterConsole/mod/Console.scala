package typings.filterConsole.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'log' | 'debug' | 'info' | 'warn' | 'error', (message ? : unknown, optionalParams : ...unknown): void> */
@js.native
trait Console extends js.Object {
  @JSName("debug")
  var debug_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit] = js.native
  @JSName("error")
  var error_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit] = js.native
  @JSName("info")
  var info_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit] = js.native
  @JSName("log")
  var log_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit] = js.native
  @JSName("warn")
  var warn_Original: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit] = js.native
  def debug(): Unit = js.native
  def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def error(): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def info(): Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

