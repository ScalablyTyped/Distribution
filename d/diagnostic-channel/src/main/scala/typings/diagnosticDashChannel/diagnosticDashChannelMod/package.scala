package typings.diagnosticDashChannel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object diagnosticDashChannelMod {
  type IFilter = js.Function1[/* publishing */ Boolean, Boolean]
  type ISubscriber[T] = js.Function1[/* event */ IStandardEvent[T], Unit]
}
