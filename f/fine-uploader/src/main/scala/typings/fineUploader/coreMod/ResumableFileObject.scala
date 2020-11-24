package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResumableFileObject extends js.Object {
  
  /**
    * an object containing any custom resume data for the file
    */
  var customResumeData: js.UndefOr[js.Any] = js.native
  
  /**
    * filename
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * number of bytes to be uploaded
    */
  var remaining: js.UndefOr[Double] = js.native
  
  /**
    * total file size in bytes
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * the unique id
    */
  var uuid: js.UndefOr[Double] = js.native
}
object ResumableFileObject {
  
  @scala.inline
  def apply(): ResumableFileObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumableFileObject]
  }
  
  @scala.inline
  implicit class ResumableFileObjectOps[Self <: ResumableFileObject] (val x: Self) extends AnyVal {
    
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
    def setCustomResumeData(value: js.Any): Self = this.set("customResumeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomResumeData: Self = this.set("customResumeData", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRemaining(value: Double): Self = this.set("remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemaining: Self = this.set("remaining", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUuid(value: Double): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
