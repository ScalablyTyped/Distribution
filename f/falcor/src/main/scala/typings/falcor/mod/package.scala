package typings.falcor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ModelComparator = js.Function2[/* existingValue */ js.Any, /* newValue */ js.Any, scala.Boolean]
  type ModelErrorSelector = js.Function1[/* jsonGraphError */ js.Any, js.Any]
  type ModelOnChange = js.Function0[scala.Unit]
  type ObservableOnCompletedCallback = js.Function0[scala.Unit]
  type ObservableOnErrorCallback = js.Function1[/* error */ typings.falcorJsonGraph.mod.Error_, scala.Unit]
  type ObservableOnNextCallback[T] = js.Function1[/* value */ T, scala.Unit]
}
