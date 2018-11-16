package typings
package ffiLib.ffiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DynamicLibrary extends js.Object {
  /** Close library, returns the result of the `dlclose` system function. */
  def close(): scala.Double
  /** Get the result of the `dlerror` system function. */
  def error(): java.lang.String
  /** Get a symbol from this library. */
  def get(symbol: java.lang.String): ffiLib.Buffer
}

