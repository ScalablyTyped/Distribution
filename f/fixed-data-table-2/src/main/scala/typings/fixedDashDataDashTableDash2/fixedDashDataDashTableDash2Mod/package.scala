package typings.fixedDashDataDashTableDash2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fixedDashDataDashTableDash2Mod {
  import typings.react.Event
  import typings.react.reactMod.ReactElement
  import typings.react.reactMod.SyntheticEvent

  type ElementOrFunc[P] = String | ReactElement | (js.Function1[/* props */ P, String | ReactElement])
  type TableRowEventHandler = js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
}
