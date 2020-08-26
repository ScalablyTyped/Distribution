package typings.fsTreeDiff.entryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseEntry extends js.Object {
  var relativePath: String = js.native
  def isDirectory(): Boolean = js.native
}

object BaseEntry {
  @scala.inline
  def apply(isDirectory: () => Boolean, relativePath: String): BaseEntry = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEntry]
  }
  @scala.inline
  implicit class BaseEntryOps[Self <: BaseEntry] (val x: Self) extends AnyVal {
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
    def setIsDirectory(value: () => Boolean): Self = this.set("isDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
  }
  
}

