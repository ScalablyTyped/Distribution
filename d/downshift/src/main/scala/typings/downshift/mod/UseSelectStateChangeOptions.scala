package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectStateChangeOptions[Item] extends js.Object {
  var changes: UseSelectState[Item]
  var props: UseSelectProps[Item]
  var `type`: UseSelectStateChangeTypes
}

object UseSelectStateChangeOptions {
  @scala.inline
  def apply[Item](changes: UseSelectState[Item], props: UseSelectProps[Item], `type`: UseSelectStateChangeTypes): UseSelectStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectStateChangeOptions[Item]]
  }
}

