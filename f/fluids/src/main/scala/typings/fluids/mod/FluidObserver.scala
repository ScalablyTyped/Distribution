package typings.fluids.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluidObserver[Event /* <: FluidEvent[_] */] extends js.Object {
  
  def onParentChange(event: Event): Unit = js.native
  def onParentChange(event: ChangeEvent[_]): Unit = js.native
}
