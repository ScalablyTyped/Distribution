package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureProperties extends js.Object {
  
  /**
    * Specifies the preferred handler that should be used to validate the signature.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Indicates the format of the data that the stream contains.
    */
  var subFilter: js.UndefOr[String] = js.native
}
object SignatureProperties {
  
  @scala.inline
  def apply(): SignatureProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureProperties]
  }
  
  @scala.inline
  implicit class SignaturePropertiesOps[Self <: SignatureProperties] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setSubFilter(value: String): Self = this.set("subFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubFilter: Self = this.set("subFilter", js.undefined)
  }
}
