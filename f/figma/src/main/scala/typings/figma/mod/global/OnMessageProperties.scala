package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnMessageProperties extends js.Object {
  var origin: String = js.native
}

object OnMessageProperties {
  @scala.inline
  def apply(origin: String): OnMessageProperties = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMessageProperties]
  }
  @scala.inline
  implicit class OnMessagePropertiesOps[Self <: OnMessageProperties] (val x: Self) extends AnyVal {
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
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
  
}

