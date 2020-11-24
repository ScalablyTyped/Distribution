package typings.fluids.mod

import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluids", "getFluidValue")
@js.native
object getFluidValue extends js.Object {
  
  /** Get the current value of a fluid object. Returns the first argument when it's not a fluid object. */
  def apply[T, U](target: T): (Exclude[T, FluidValue[_, _]]) | U = js.native
  def apply[T, U](target: FluidValue[U, _]): (Exclude[T, FluidValue[_, _]]) | U = js.native
}
