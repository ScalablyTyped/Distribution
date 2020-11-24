package typings.firebaseStorage.expMod.firebaseComponentAugmentingMod

import typings.firebaseStorage.srcServiceMod.StorageService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameServiceMapping extends js.Object {
  
  var `storage-exp`: StorageService = js.native
}
object NameServiceMapping {
  
  @scala.inline
  def apply(`storage-exp`: StorageService): NameServiceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("storage-exp")(`storage-exp`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
  
  @scala.inline
  implicit class NameServiceMappingOps[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
    
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
    def `setStorage-exp`(value: StorageService): Self = this.set("storage-exp", value.asInstanceOf[js.Any])
  }
}
