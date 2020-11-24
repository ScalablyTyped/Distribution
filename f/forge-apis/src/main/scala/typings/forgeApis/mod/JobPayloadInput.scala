package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobPayloadInput extends js.Object {
  
  var compressedUrn: js.UndefOr[Boolean] = js.native
  
  var rootFilename: js.UndefOr[String] = js.native
  
  var urn: String = js.native
}
object JobPayloadInput {
  
  @scala.inline
  def apply(urn: String): JobPayloadInput = {
    val __obj = js.Dynamic.literal(urn = urn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadInput]
  }
  
  @scala.inline
  implicit class JobPayloadInputOps[Self <: JobPayloadInput] (val x: Self) extends AnyVal {
    
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
    def setUrn(value: String): Self = this.set("urn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressedUrn(value: Boolean): Self = this.set("compressedUrn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressedUrn: Self = this.set("compressedUrn", js.undefined)
    
    @scala.inline
    def setRootFilename(value: String): Self = this.set("rootFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootFilename: Self = this.set("rootFilename", js.undefined)
  }
}
