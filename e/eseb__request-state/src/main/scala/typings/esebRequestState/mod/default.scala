package typings.esebRequestState.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@eseb/request-state", JSImport.Default)
@js.native
class default[T] () extends RequestState[T] {
  def this(state: State) = this()
  def this(state: js.UndefOr[scala.Nothing], attachment: T) = this()
  def this(state: State, attachment: T) = this()
}
