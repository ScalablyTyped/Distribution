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

object DynamicLibrary {
  @scala.inline
  def apply(
    close: js.Function0[scala.Double],
    error: js.Function0[java.lang.String],
    get: js.Function1[java.lang.String, ffiDashNapiLib.Buffer]
  ): DynamicLibrary = {
    val __obj = js.Dynamic.literal(close = close, error = error, get = get)
  
    __obj.asInstanceOf[DynamicLibrary]
  }
}

