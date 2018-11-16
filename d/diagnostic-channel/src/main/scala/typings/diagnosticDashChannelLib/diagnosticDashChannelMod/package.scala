package typings
package diagnosticDashChannelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object diagnosticDashChannelMod {
  type IFilter = js.Function1[/* publishing */ scala.Boolean, scala.Boolean]
  type ISubscriber[T] = js.Function1[/* event */ IStandardEvent[T], scala.Unit]
}
