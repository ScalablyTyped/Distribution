package typings.ffmpegJs.ffmpegWebmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var MEMFS: js.Array[Video] = js.native
}
object Result {
  
  @scala.inline
  def apply(MEMFS: js.Array[Video]): Result = {
    val __obj = js.Dynamic.literal(MEMFS = MEMFS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setMEMFSVarargs(value: Video*): Self = this.set("MEMFS", js.Array(value :_*))
    
    @scala.inline
    def setMEMFS(value: js.Array[Video]): Self = this.set("MEMFS", value.asInstanceOf[js.Any])
  }
}
