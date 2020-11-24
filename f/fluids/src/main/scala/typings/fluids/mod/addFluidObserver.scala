package typings.fluids.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluids", "addFluidObserver")
@js.native
object addFluidObserver extends js.Object {
  
  def apply(target: js.Object, observer: FluidObserver[_]): js.UndefOr[js.Function0[Unit]] = js.native
  /** Add an observer to a fluid object. Returns an unsubscribe function if the target is a fluid object, otherwise undefined. */
  def apply[E /* <: FluidEvent[_] */](target: FluidValue[_, E], observer: FluidObserver[E]): js.Function0[Unit] = js.native
}
