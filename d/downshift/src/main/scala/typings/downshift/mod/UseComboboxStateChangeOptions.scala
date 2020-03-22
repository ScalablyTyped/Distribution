package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseComboboxStateChangeOptions[Item] extends js.Object {
  var changes: UseComboboxState[Item]
  var props: UseComboboxProps[Item]
  var `type`: UseComboboxStateChangeTypes
}

object UseComboboxStateChangeOptions {
  @scala.inline
  def apply[Item](
    changes: UseComboboxState[Item],
    props: UseComboboxProps[Item],
    `type`: UseComboboxStateChangeTypes
  ): UseComboboxStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseComboboxStateChangeOptions[Item]]
  }
}

