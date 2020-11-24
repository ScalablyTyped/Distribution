package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcsTokenLink extends js.Object {
  
  var acsTokenLink: js.UndefOr[String] = js.native
  
  var downloadLink: js.UndefOr[String] = js.native
  
  var isAvailable: js.UndefOr[Boolean] = js.native
}
object AcsTokenLink {
  
  @scala.inline
  def apply(): AcsTokenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcsTokenLink]
  }
  
  @scala.inline
  implicit class AcsTokenLinkOps[Self <: AcsTokenLink] (val x: Self) extends AnyVal {
    
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
    def setAcsTokenLink(value: String): Self = this.set("acsTokenLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcsTokenLink: Self = this.set("acsTokenLink", js.undefined)
    
    @scala.inline
    def setDownloadLink(value: String): Self = this.set("downloadLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadLink: Self = this.set("downloadLink", js.undefined)
    
    @scala.inline
    def setIsAvailable(value: Boolean): Self = this.set("isAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAvailable: Self = this.set("isAvailable", js.undefined)
  }
}
