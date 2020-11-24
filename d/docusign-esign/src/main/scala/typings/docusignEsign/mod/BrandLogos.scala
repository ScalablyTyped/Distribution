package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandLogos extends js.Object {
  
  /**
    * The URI for the logo that the brand uses in the header of email messages.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The URI for the brand's primary logo.
    */
  var primary: js.UndefOr[String] = js.native
  
  /**
    * The URI for the brand's secondary logo.
    */
  var secondary: js.UndefOr[String] = js.native
}
object BrandLogos {
  
  @scala.inline
  def apply(): BrandLogos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandLogos]
  }
  
  @scala.inline
  implicit class BrandLogosOps[Self <: BrandLogos] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: String): Self = this.set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
  }
}
