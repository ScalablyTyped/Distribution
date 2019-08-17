package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electron {
  import typings.std.Event

  type GlobalEvent = Event
  type NodeRequireFunction = js.Function1[typings.electron.electronStrings.electron, TypeofElectron]
}
