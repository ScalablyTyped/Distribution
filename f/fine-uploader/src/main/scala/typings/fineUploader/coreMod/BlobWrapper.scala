package typings.fineUploader.coreMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobWrapper extends js.Object {
  
  /**
    * the bytes of the `Blob` object being uploaded
    */
  var blob: js.UndefOr[Blob] = js.native
  
  /**
    * the name of the `Blob`
    */
  var name: js.UndefOr[String] = js.native
}
object BlobWrapper {
  
  @scala.inline
  def apply(): BlobWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobWrapper]
  }
  
  @scala.inline
  implicit class BlobWrapperOps[Self <: BlobWrapper] (val x: Self) extends AnyVal {
    
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
    def setBlob(value: Blob): Self = this.set("blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlob: Self = this.set("blob", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
