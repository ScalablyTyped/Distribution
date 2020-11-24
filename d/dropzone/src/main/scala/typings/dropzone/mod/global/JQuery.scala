package typings.dropzone.mod.global

import typings.dropzone.mod.Dropzone
import typings.dropzone.mod.DropzoneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def dropzone(options: DropzoneOptions): Dropzone = js.native
}
object JQuery {
  
  @scala.inline
  def apply(dropzone: DropzoneOptions => Dropzone): JQuery = {
    val __obj = js.Dynamic.literal(dropzone = js.Any.fromFunction1(dropzone))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    
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
    def setDropzone(value: DropzoneOptions => Dropzone): Self = this.set("dropzone", js.Any.fromFunction1(value))
  }
}
