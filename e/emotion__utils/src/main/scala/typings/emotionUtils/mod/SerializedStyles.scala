package typings.emotionUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedStyles extends js.Object {
  var map: js.UndefOr[String] = js.native
  var name: String = js.native
  var next: js.UndefOr[SerializedStyles] = js.native
  var styles: String = js.native
}

object SerializedStyles {
  @scala.inline
  def apply(name: String, styles: String): SerializedStyles = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedStyles]
  }
  @scala.inline
  implicit class SerializedStylesOps[Self <: SerializedStyles] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: String): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setNext(value: SerializedStyles): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

