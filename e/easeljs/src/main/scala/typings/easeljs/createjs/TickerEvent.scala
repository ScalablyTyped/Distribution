package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickerEvent extends js.Object {
  var delta: Double
  var paused: Boolean
  var runTime: Double
  // properties
  var target: js.Object
  var time: Double
  var `type`: String
}

object TickerEvent {
  @scala.inline
  def apply(delta: Double, paused: Boolean, runTime: Double, target: js.Object, time: Double, `type`: String): TickerEvent = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], runTime = runTime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickerEvent]
  }
}

