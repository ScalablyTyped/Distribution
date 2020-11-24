package typings.ffiNapi.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.ffiNapi.Buffer
import typings.ffiNapi.anon.RTLDDEFAUL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicLibrary extends js.Object {
  
  /** Close library, returns the result of the `dlclose` system function. */
  def close(): Double = js.native
  
  /** Get the result of the `dlerror` system function. */
  def error(): String = js.native
  
  /** Get a symbol from this library. */
  def get(symbol: String): Buffer = js.native
}
@JSImport("ffi-napi", "DynamicLibrary")
@js.native
object DynamicLibrary
  extends Instantiable0[DynamicLibrary]
     with Instantiable1[/* path */ String, DynamicLibrary]
     with Instantiable2[js.UndefOr[/* path */ String], /* mode */ Double, DynamicLibrary] {
  
  def apply(): DynamicLibrary = js.native
  def apply(path: js.UndefOr[scala.Nothing], mode: Double): DynamicLibrary = js.native
  def apply(path: String): DynamicLibrary = js.native
  def apply(path: String, mode: Double): DynamicLibrary = js.native
  
  var FLAGS: RTLDDEFAUL = js.native
}
