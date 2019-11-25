package typings.dva.dvaMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionAPI extends js.Object {
  var dispatch: Dispatch[_]
  var history: History[LocationState]
}

object SubscriptionAPI {
  @scala.inline
  def apply(dispatch: _ => _, history: History[LocationState]): SubscriptionAPI = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), history = history.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionAPI]
  }
}

