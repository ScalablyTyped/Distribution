package typings.expressValidator.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meta extends js.Object {
  var location: Location = js.native
  var path: String = js.native
  var req: Request = js.native
}

object Meta {
  @scala.inline
  def apply(location: Location, path: String, req: Request): Meta = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
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
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setReq(value: Request): Self = this.set("req", value.asInstanceOf[js.Any])
  }
  
}

