package typings.expoConfigureSplashScreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletionFlag extends js.Object {
  
  var deletionFlag: js.UndefOr[Boolean] = js.native
}
object DeletionFlag {
  
  @scala.inline
  def apply(): DeletionFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletionFlag]
  }
  
  @scala.inline
  implicit class DeletionFlagOps[Self <: DeletionFlag] (val x: Self) extends AnyVal {
    
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
    def setDeletionFlag(value: Boolean): Self = this.set("deletionFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionFlag: Self = this.set("deletionFlag", js.undefined)
  }
}
