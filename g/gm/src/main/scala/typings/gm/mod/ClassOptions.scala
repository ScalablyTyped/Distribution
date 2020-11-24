package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassOptions extends js.Object {
  
  var appPath: js.UndefOr[String] = js.native
  
  var imageMagick: js.UndefOr[Boolean] = js.native
  
  var nativeAutoOrient: js.UndefOr[Boolean] = js.native
}
object ClassOptions {
  
  @scala.inline
  def apply(): ClassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassOptions]
  }
  
  @scala.inline
  implicit class ClassOptionsOps[Self <: ClassOptions] (val x: Self) extends AnyVal {
    
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
    def setAppPath(value: String): Self = this.set("appPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppPath: Self = this.set("appPath", js.undefined)
    
    @scala.inline
    def setImageMagick(value: Boolean): Self = this.set("imageMagick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageMagick: Self = this.set("imageMagick", js.undefined)
    
    @scala.inline
    def setNativeAutoOrient(value: Boolean): Self = this.set("nativeAutoOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeAutoOrient: Self = this.set("nativeAutoOrient", js.undefined)
  }
}
