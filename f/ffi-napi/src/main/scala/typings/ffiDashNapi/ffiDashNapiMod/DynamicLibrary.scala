package typings.ffiDashNapi.ffiDashNapiMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.ffiDashNapi.Anon_RTLDDEFAUL
import typings.ffiDashNapi.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLibrary extends js.Object {
  /** Close library, returns the result of the `dlclose` system function. */
  def close(): Double
  /** Get the result of the `dlerror` system function. */
  def error(): String
  /** Get a symbol from this library. */
  def get(symbol: String): Buffer
}

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

@JSImport("ffi-napi", "DynamicLibrary")
@js.native
object DynamicLibrary
  extends Instantiable0[DynamicLibrary]
     with Instantiable1[/* path */ String, DynamicLibrary]
     with Instantiable2[/* path */ String, /* mode */ Double, DynamicLibrary] {
  var FLAGS: Anon_RTLDDEFAUL = js.native
  def apply(): DynamicLibrary = js.native
  def apply(path: String): DynamicLibrary = js.native
  def apply(path: String, mode: Double): DynamicLibrary = js.native
}

