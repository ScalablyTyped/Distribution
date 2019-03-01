package typings
package extendedDashListboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxEvent extends js.Object {
  /** any object */
  var args: js.Any
  /** unique event name */
  var eventName: java.lang.String
  /** target object for which event is triggered */
  var target: stdLib.Element
}

object ListBoxEvent {
  @scala.inline
  def apply(args: js.Any, eventName: java.lang.String, target: stdLib.Element): ListBoxEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("eventName")(eventName)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ListBoxEvent]
  }
}

