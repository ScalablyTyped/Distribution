package typings.falcor

import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object falcorMod {
  type ModelComparator = js.Function2[/* existingValue */ js.Any, /* newValue */ js.Any, Boolean]
  type ModelErrorSelector = js.Function1[/* jsonGraphError */ js.Any, js.Any]
  type ModelOnChange = js.Function0[Unit]
  type ObservableOnCompletedCallback = js.Function0[Unit]
  type ObservableOnErrorCallback = js.Function1[/* error */ Error, Unit]
  type ObservableOnNextCallback[T] = js.Function1[/* value */ T, Unit]
}
