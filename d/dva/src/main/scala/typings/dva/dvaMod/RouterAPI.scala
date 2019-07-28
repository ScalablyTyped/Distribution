package typings.dva.dvaMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterAPI extends js.Object {
  var app: DvaInstance
  var history: History[LocationState]
}

object RouterAPI {
  @scala.inline
  def apply(app: DvaInstance, history: History[LocationState]): RouterAPI = {
    val __obj = js.Dynamic.literal(app = app, history = history)
  
    __obj.asInstanceOf[RouterAPI]
  }
}

