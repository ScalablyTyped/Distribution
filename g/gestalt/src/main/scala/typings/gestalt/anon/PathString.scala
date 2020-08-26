package typings.gestalt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathString extends js.Object {
  var _path: String = js.native
}

object PathString {
  @scala.inline
  def apply(_path: String): PathString = {
    val __obj = js.Dynamic.literal(_path = _path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathString]
  }
  @scala.inline
  implicit class PathStringOps[Self <: PathString] (val x: Self) extends AnyVal {
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
    def set_path(value: String): Self = this.set("_path", value.asInstanceOf[js.Any])
  }
  
}

