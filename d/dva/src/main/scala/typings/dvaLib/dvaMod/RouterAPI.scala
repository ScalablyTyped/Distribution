package typings
package dvaLib.dvaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterAPI extends js.Object {
  var app: DvaInstance
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
}

object RouterAPI {
  @scala.inline
  def apply(app: DvaInstance, history: historyLib.historyMod.History[historyLib.historyMod.LocationState]): RouterAPI = {
    val __obj = js.Dynamic.literal(app = app, history = history)
  
    __obj.asInstanceOf[RouterAPI]
  }
}

