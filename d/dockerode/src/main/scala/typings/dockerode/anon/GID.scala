package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GID extends js.Object {
  
  var GID: js.UndefOr[String] = js.native
  
  var Mode: js.UndefOr[Double] = js.native
  
  var Name: js.UndefOr[String] = js.native
  
  var UID: js.UndefOr[String] = js.native
}
object GID {
  
  @scala.inline
  def apply(): GID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GID]
  }
  
  @scala.inline
  implicit class GIDOps[Self <: GID] (val x: Self) extends AnyVal {
    
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
    def setGID(value: String): Self = this.set("GID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGID: Self = this.set("GID", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setUID(value: String): Self = this.set("UID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUID: Self = this.set("UID", js.undefined)
  }
}
