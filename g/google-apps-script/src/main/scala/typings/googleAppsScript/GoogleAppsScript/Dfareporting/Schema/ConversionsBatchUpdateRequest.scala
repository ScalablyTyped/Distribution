package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionsBatchUpdateRequest extends js.Object {
  
  var conversions: js.UndefOr[js.Array[Conversion]] = js.native
  
  var encryptionInfo: js.UndefOr[EncryptionInfo] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object ConversionsBatchUpdateRequest {
  
  @scala.inline
  def apply(): ConversionsBatchUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionsBatchUpdateRequest]
  }
  
  @scala.inline
  implicit class ConversionsBatchUpdateRequestOps[Self <: ConversionsBatchUpdateRequest] (val x: Self) extends AnyVal {
    
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
    def setConversionsVarargs(value: Conversion*): Self = this.set("conversions", js.Array(value :_*))
    
    @scala.inline
    def setConversions(value: js.Array[Conversion]): Self = this.set("conversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversions: Self = this.set("conversions", js.undefined)
    
    @scala.inline
    def setEncryptionInfo(value: EncryptionInfo): Self = this.set("encryptionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionInfo: Self = this.set("encryptionInfo", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
