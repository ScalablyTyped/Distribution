package typings.gitParse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileModification extends js.Object {
  
  var linesAdded: js.UndefOr[Double] = js.native
  
  var linesDeleted: js.UndefOr[Double] = js.native
  
  var path: String = js.native
}
object FileModification {
  
  @scala.inline
  def apply(path: String): FileModification = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileModification]
  }
  
  @scala.inline
  implicit class FileModificationOps[Self <: FileModification] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesAdded(value: Double): Self = this.set("linesAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesAdded: Self = this.set("linesAdded", js.undefined)
    
    @scala.inline
    def setLinesDeleted(value: Double): Self = this.set("linesDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesDeleted: Self = this.set("linesDeleted", js.undefined)
  }
}
