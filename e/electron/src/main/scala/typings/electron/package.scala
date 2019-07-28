package typings

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electron {
  type GlobalEvent = Event
  type NodeRequireFunction = js.Function1[typings.electron.electronStrings.electron, TypeofElectron]
}
