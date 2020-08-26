package typings.dva.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterAPI extends js.Object {
  var app: DvaInstance = js.native
  var history: History[LocationState] = js.native
}

object RouterAPI {
  @scala.inline
  def apply(app: DvaInstance, history: History[LocationState]): RouterAPI = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterAPI]
  }
  @scala.inline
  implicit class RouterAPIOps[Self <: RouterAPI] (val x: Self) extends AnyVal {
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
    def setApp(value: DvaInstance): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
  }
  
}

