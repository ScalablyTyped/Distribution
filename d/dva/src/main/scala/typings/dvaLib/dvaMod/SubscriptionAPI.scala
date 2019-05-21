package typings
package dvaLib.dvaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionAPI extends js.Object {
  var dispatch: reduxLib.reduxMod.Dispatch[_]
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
}

object SubscriptionAPI {
  @scala.inline
  def apply(
    dispatch: reduxLib.reduxMod.Dispatch[_],
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  ): SubscriptionAPI = {
    val __obj = js.Dynamic.literal(dispatch = dispatch, history = history)
  
    __obj.asInstanceOf[SubscriptionAPI]
  }
}

