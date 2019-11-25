package typings.extendedDashListbox

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxEvent extends js.Object {
  /** any object */
  var args: js.Any
  /** unique event name */
  var eventName: String
  /** target object for which event is triggered */
  var target: Element
}

object ListBoxEvent {
  @scala.inline
  def apply(args: js.Any, eventName: String, target: Element): ListBoxEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListBoxEvent]
  }
}

