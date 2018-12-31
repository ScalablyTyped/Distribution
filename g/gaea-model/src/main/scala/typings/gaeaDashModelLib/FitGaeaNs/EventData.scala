package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var event: java.lang.String
  var eventData: js.UndefOr[EventActionJumpUrl | EventActionCall | EventActionEvent] = js.undefined
  var eventIndex: scala.Double
  var `type`: java.lang.String
  var typeData: js.UndefOr[EventTriggerEvent] = js.undefined
  /**
    * 因为事件可能 type 相同，因此记录是第几个
    */
  var typeIndex: scala.Double
}

