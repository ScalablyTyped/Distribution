package typings.firefoxWebextBrowser.browser.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object whose properties specify which origin types ought to be cleared. If this object isn't specified, it defaults to clearing only "unprotected" origins. Please ensure that you _really_ want to remove application data before adding 'protectedWeb' or 'extensions'.
  */
@js.native
trait RemovalOptionsOriginTypes extends js.Object {
  
  /** Extensions and packaged applications a user has installed (be _really_ careful!). */
  var extension: js.UndefOr[Boolean] = js.native
  
  /** Websites that have been installed as hosted applications (be careful!). */
  var protectedWeb: js.UndefOr[Boolean] = js.native
  
  /** Normal websites. */
  var unprotectedWeb: js.UndefOr[Boolean] = js.native
}
object RemovalOptionsOriginTypes {
  
  @scala.inline
  def apply(): RemovalOptionsOriginTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovalOptionsOriginTypes]
  }
  
  @scala.inline
  implicit class RemovalOptionsOriginTypesOps[Self <: RemovalOptionsOriginTypes] (val x: Self) extends AnyVal {
    
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
    def setExtension(value: Boolean): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setProtectedWeb(value: Boolean): Self = this.set("protectedWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectedWeb: Self = this.set("protectedWeb", js.undefined)
    
    @scala.inline
    def setUnprotectedWeb(value: Boolean): Self = this.set("unprotectedWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprotectedWeb: Self = this.set("unprotectedWeb", js.undefined)
  }
}
