package typings.fluids.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluids", "FluidValue")
@js.native
abstract class FluidValue[T, Event /* <: FluidEvent[T] */] () extends FluidConfig[T, Event]
