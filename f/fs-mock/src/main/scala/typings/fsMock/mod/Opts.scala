package typings.fsMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opts extends js.Object {
  
  var drives: js.UndefOr[js.Array[String]] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var windows: js.UndefOr[Boolean] = js.native
}
object Opts {
  
  @scala.inline
  def apply(): Opts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts]
  }
  
  @scala.inline
  implicit class OptsOps[Self <: Opts] (val x: Self) extends AnyVal {
    
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
    def setDrivesVarargs(value: String*): Self = this.set("drives", js.Array(value :_*))
    
    @scala.inline
    def setDrives(value: js.Array[String]): Self = this.set("drives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrives: Self = this.set("drives", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setWindows(value: Boolean): Self = this.set("windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindows: Self = this.set("windows", js.undefined)
  }
}
