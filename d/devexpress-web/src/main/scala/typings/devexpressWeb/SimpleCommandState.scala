package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a simple state common to most of the client commands.
  */
@js.native
trait SimpleCommandState extends js.Object {
  /**
    * Specifies a command availability.
    */
  var enabled: Boolean = js.native
  /**
    * Specifies a command visibility.
    */
  var visible: Boolean = js.native
}

object SimpleCommandState {
  @scala.inline
  def apply(enabled: Boolean, visible: Boolean): SimpleCommandState = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleCommandState]
  }
  @scala.inline
  implicit class SimpleCommandStateOps[Self <: SimpleCommandState] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

