package typings.downshift.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseComboboxStateChangeOptions[Item] extends UseComboboxDispatchAction[Item] {
  var changes: Partial[UseComboboxState[Item]] = js.native
}

object UseComboboxStateChangeOptions {
  @scala.inline
  def apply[Item](changes: Partial[UseComboboxState[Item]], `type`: UseComboboxStateChangeTypes): UseComboboxStateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseComboboxStateChangeOptions[Item]]
  }
  @scala.inline
  implicit class UseComboboxStateChangeOptionsOps[Self <: UseComboboxStateChangeOptions[_], Item] (val x: Self with UseComboboxStateChangeOptions[Item]) extends AnyVal {
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
    def setChanges(value: Partial[UseComboboxState[Item]]): Self = this.set("changes", value.asInstanceOf[js.Any])
  }
  
}

