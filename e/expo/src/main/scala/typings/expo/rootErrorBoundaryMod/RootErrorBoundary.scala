package typings.expo.rootErrorBoundaryMod

import typings.react.mod.Component
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootErrorBoundary
  extends Component[Props, State, js.Any] {
  def _subscribeToGlobalErrors(): Unit = js.native
  def _unsubscribeFromGlobalErrors(): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MRootErrorBoundary(error: Error, _errorInfo: js.Any): Unit = js.native
}

