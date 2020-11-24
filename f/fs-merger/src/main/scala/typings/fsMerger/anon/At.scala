package typings.fsMerger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait At extends js.Object {
  
  var at: Double = js.native
  
  var relativePath: String = js.native
}
object At {
  
  @scala.inline
  def apply(at: Double, relativePath: String): At = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[At]
  }
  
  @scala.inline
  implicit class AtOps[Self <: At] (val x: Self) extends AnyVal {
    
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
    def setAt(value: Double): Self = this.set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
  }
}
