package typings.dva.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionAPI extends js.Object {
  
  var dispatch: Dispatch[_] = js.native
  
  var history: History[LocationState] = js.native
}
object SubscriptionAPI {
  
  @scala.inline
  def apply(dispatch: _ => _, history: History[LocationState]): SubscriptionAPI = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionAPI]
  }
  
  @scala.inline
  implicit class SubscriptionAPIOps[Self <: SubscriptionAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDispatch(value: _ => _): Self = this.set("dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
  }
}
