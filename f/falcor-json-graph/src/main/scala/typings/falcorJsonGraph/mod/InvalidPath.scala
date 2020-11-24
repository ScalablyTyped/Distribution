package typings.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidPath extends js.Object {
  
  var invalidate: Boolean = js.native
  
  var path: PathSet = js.native
}
object InvalidPath {
  
  @scala.inline
  def apply(invalidate: Boolean, path: PathSet): InvalidPath = {
    val __obj = js.Dynamic.literal(invalidate = invalidate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPath]
  }
  
  @scala.inline
  implicit class InvalidPathOps[Self <: InvalidPath] (val x: Self) extends AnyVal {
    
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
    def setInvalidate(value: Boolean): Self = this.set("invalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: KeySet*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: PathSet): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
