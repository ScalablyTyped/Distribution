package typings.divaJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D extends js.Object {
  var d: H = js.native
  var f: String = js.native
  var il: String = js.native
  var url: String = js.native
}

object D {
  @scala.inline
  def apply(d: H, f: String, il: String, url: String): D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], il = il.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  @scala.inline
  implicit class DOps[Self <: D] (val x: Self) extends AnyVal {
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
    def setD(value: H): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setF(value: String): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def setIl(value: String): Self = this.set("il", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

