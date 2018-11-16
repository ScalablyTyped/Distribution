package typings
package falcorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object falcorMod {
  type ModelComparator = js.Function2[/* existingValue */ js.Any, /* newValue */ js.Any, scala.Boolean]
  type ModelErrorSelector = js.Function1[/* jsonGraphError */ js.Any, js.Any]
  type ModelOnChange = js.Function0[scala.Unit]
  type ObservableOnCompletedCallback = js.Function0[scala.Unit]
  type ObservableOnErrorCallback = js.Function1[
    /* error */ falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.Error, 
    scala.Unit
  ]
  type ObservableOnNextCallback[T] = js.Function1[/* value */ T, scala.Unit]
}
