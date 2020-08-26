package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileMapping extends js.Object {
  /**
    * Offset in the mapped file on disk, in bytes.
    */
  var offset: Double = js.native
  /**
    * Full filesystem path.
    */
  var path: String = js.native
  /**
    * Size in the mapped file on disk, in bytes.
    */
  var size: Double = js.native
}

object FileMapping {
  @scala.inline
  def apply(offset: Double, path: String, size: Double): FileMapping = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMapping]
  }
  @scala.inline
  implicit class FileMappingOps[Self <: FileMapping] (val x: Self) extends AnyVal {
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

