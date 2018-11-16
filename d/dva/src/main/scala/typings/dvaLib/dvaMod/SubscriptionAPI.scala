package typings
package dvaLib.dvaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionAPI extends js.Object {
  @JSName("dispatch")
  var dispatch_Original: reduxLib.reduxMod.Dispatch[_] = js.native
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
  def dispatch[T /* <: js.Any */](action: T): T = js.native
}

