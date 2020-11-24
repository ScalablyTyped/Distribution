package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoteSizeMax extends js.Object {
  
  var noteResourceCountMax: js.UndefOr[Double] = js.native
  
  var noteSizeMax: js.UndefOr[Double] = js.native
  
  var resourceSizeMax: js.UndefOr[Double] = js.native
  
  var uploadLimit: js.UndefOr[Double] = js.native
  
  var uploaded: js.UndefOr[Double] = js.native
}
object NoteSizeMax {
  
  @scala.inline
  def apply(): NoteSizeMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteSizeMax]
  }
  
  @scala.inline
  implicit class NoteSizeMaxOps[Self <: NoteSizeMax] (val x: Self) extends AnyVal {
    
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
    def setNoteResourceCountMax(value: Double): Self = this.set("noteResourceCountMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteResourceCountMax: Self = this.set("noteResourceCountMax", js.undefined)
    
    @scala.inline
    def setNoteSizeMax(value: Double): Self = this.set("noteSizeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteSizeMax: Self = this.set("noteSizeMax", js.undefined)
    
    @scala.inline
    def setResourceSizeMax(value: Double): Self = this.set("resourceSizeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceSizeMax: Self = this.set("resourceSizeMax", js.undefined)
    
    @scala.inline
    def setUploadLimit(value: Double): Self = this.set("uploadLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadLimit: Self = this.set("uploadLimit", js.undefined)
    
    @scala.inline
    def setUploaded(value: Double): Self = this.set("uploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploaded: Self = this.set("uploaded", js.undefined)
  }
}
