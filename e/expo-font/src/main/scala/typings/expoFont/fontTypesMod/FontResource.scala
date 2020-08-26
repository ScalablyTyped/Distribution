package typings.expoFont.fontTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontResource extends js.Object {
  var display: js.UndefOr[FontDisplay] = js.native
  var uri: String | Double = js.native
}

object FontResource {
  @scala.inline
  def apply(uri: String | Double): FontResource = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontResource]
  }
  @scala.inline
  implicit class FontResourceOps[Self <: FontResource] (val x: Self) extends AnyVal {
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
    def setUri(value: String | Double): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: FontDisplay): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
  }
  
}

