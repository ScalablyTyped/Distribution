package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludedPath extends js.Object {
  var Path: String = js.native
}

object ExcludedPath {
  @scala.inline
  def apply(Path: String): ExcludedPath = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludedPath]
  }
  @scala.inline
  implicit class ExcludedPathOps[Self <: ExcludedPath] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
  }
  
}

