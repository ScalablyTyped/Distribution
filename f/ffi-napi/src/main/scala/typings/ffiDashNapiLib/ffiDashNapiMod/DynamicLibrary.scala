package typings
package ffiDashNapiLib.ffiDashNapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLibrary extends js.Object {
  /** Close library, returns the result of the `dlclose` system function. */
  def close(): scala.Double
  /** Get the result of the `dlerror` system function. */
  def error(): java.lang.String
  /** Get a symbol from this library. */
  def get(symbol: java.lang.String): ffiDashNapiLib.Buffer
}

@JSImport("ffi-napi", "DynamicLibrary")
@js.native
class DynamicLibraryCls () extends DynamicLibrary {
  def this(path: java.lang.String) = this()
  def this(path: java.lang.String, mode: scala.Double) = this()
  /** Close library, returns the result of the `dlclose` system function. */
  /* CompleteClass */
  override def close(): scala.Double = js.native
  /** Get the result of the `dlerror` system function. */
  /* CompleteClass */
  override def error(): java.lang.String = js.native
  /** Get a symbol from this library. */
  /* CompleteClass */
  override def get(symbol: java.lang.String): ffiDashNapiLib.Buffer = js.native
}

object DynamicLibrary {
  @scala.inline
  def apply(
    close: () => scala.Double,
    error: () => java.lang.String,
    get: java.lang.String => ffiDashNapiLib.Buffer
  ): DynamicLibrary = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), error = js.Any.fromFunction0(error), get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[DynamicLibrary]
  }
}

