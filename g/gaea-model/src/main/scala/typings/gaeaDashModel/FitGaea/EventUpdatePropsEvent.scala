package typings.gaeaDashModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventUpdatePropsEvent extends js.Object {
  /**
    * 修改后的 props
    */
  var props: ComponentProps
}

object EventUpdatePropsEvent {
  @scala.inline
  def apply(props: ComponentProps): EventUpdatePropsEvent = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventUpdatePropsEvent]
  }
}

