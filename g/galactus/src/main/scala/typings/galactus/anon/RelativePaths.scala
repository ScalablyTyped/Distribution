package typings.galactus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativePaths extends js.Object {
  var relativePaths: Boolean = js.native
}

object RelativePaths {
  @scala.inline
  def apply(relativePaths: Boolean): RelativePaths = {
    val __obj = js.Dynamic.literal(relativePaths = relativePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativePaths]
  }
  @scala.inline
  implicit class RelativePathsOps[Self <: RelativePaths] (val x: Self) extends AnyVal {
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
    def setRelativePaths(value: Boolean): Self = this.set("relativePaths", value.asInstanceOf[js.Any])
  }
  
}

