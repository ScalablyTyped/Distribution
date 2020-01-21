package typings.ffiNapi.mod

import typings.ffiNapi.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi-napi", "DynamicLibrary")
@js.native
class DynamicLibraryCls () extends DynamicLibrary {
  def this(path: String) = this()
  def this(path: String, mode: Double) = this()
  /** Close library, returns the result of the `dlclose` system function. */
  /* CompleteClass */
  override def close(): Double = js.native
  /** Get the result of the `dlerror` system function. */
  /* CompleteClass */
  override def error(): String = js.native
  /** Get a symbol from this library. */
  /* CompleteClass */
  override def get(symbol: String): Buffer = js.native
}

