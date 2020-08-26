package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var color: String | Null = js.native
  var mode: String = js.native
  var name: String = js.native
  var scope: String | Null = js.native
}

object Color {
  @scala.inline
  def apply(mode: String, name: String): Color = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorNull: Self = this.set("color", null)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeNull: Self = this.set("scope", null)
  }
  
}

