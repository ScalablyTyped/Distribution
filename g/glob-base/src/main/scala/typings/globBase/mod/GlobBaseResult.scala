package typings.globBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobBaseResult extends js.Object {
  
  var base: String = js.native
  
  var glob: String = js.native
  
  var isGlob: Boolean = js.native
}
object GlobBaseResult {
  
  @scala.inline
  def apply(base: String, glob: String, isGlob: Boolean): GlobBaseResult = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobBaseResult]
  }
  
  @scala.inline
  implicit class GlobBaseResultOps[Self <: GlobBaseResult] (val x: Self) extends AnyVal {
    
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlob(value: String): Self = this.set("glob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGlob(value: Boolean): Self = this.set("isGlob", value.asInstanceOf[js.Any])
  }
}
