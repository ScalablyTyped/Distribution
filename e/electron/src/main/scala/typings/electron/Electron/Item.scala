package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  /**
    * The path(s) to the file(s) being dragged.
    */
  var file: js.Array[String] | String = js.native
  /**
    * The image must be non-empty on macOS.
    */
  var icon: NativeImage_ | String = js.native
}

object Item {
  @scala.inline
  def apply(file: js.Array[String] | String, icon: NativeImage_ | String): Item = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
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
    def setFileVarargs(value: String*): Self = this.set("file", js.Array(value :_*))
    @scala.inline
    def setFile(value: js.Array[String] | String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = this.set("icon", value.asInstanceOf[js.Any])
  }
  
}

