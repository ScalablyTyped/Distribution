package typings.firebaseMessaging.internalMessagePayloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FcmOptionsInternal extends js.Object {
  
  var analytics_label: js.UndefOr[String] = js.native
  
  var link: js.UndefOr[String] = js.native
}
object FcmOptionsInternal {
  
  @scala.inline
  def apply(): FcmOptionsInternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FcmOptionsInternal]
  }
  
  @scala.inline
  implicit class FcmOptionsInternalOps[Self <: FcmOptionsInternal] (val x: Self) extends AnyVal {
    
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
    def setAnalytics_label(value: String): Self = this.set("analytics_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalytics_label: Self = this.set("analytics_label", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
}
