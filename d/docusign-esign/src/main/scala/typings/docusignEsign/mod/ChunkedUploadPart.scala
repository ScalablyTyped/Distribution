package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkedUploadPart extends js.Object {
  
  /**
    * The order of the part in the chunked upload.
    */
  var sequence: js.UndefOr[String] = js.native
  
  /**
    * The size of the part in bytes.
    *
    * We recommend that a chunked upload part is no larger than a few MB in size.
    */
  var size: js.UndefOr[String] = js.native
}
object ChunkedUploadPart {
  
  @scala.inline
  def apply(): ChunkedUploadPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkedUploadPart]
  }
  
  @scala.inline
  implicit class ChunkedUploadPartOps[Self <: ChunkedUploadPart] (val x: Self) extends AnyVal {
    
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
    def setSequence(value: String): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
