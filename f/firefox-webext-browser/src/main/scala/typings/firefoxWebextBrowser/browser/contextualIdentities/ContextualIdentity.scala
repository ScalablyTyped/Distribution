package typings.firefoxWebextBrowser.browser.contextualIdentities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* contextualIdentities types */
/** Represents information about a contextual identity. */
@js.native
trait ContextualIdentity extends js.Object {
  
  /** The color name of the contextual identity. */
  var color: String = js.native
  
  /** The color hash of the contextual identity. */
  var colorCode: String = js.native
  
  /** The cookie store ID of the contextual identity. */
  var cookieStoreId: String = js.native
  
  /** The icon name of the contextual identity. */
  var icon: String = js.native
  
  /** The icon url of the contextual identity. */
  var iconUrl: String = js.native
  
  /** The name of the contextual identity. */
  var name: String = js.native
}
object ContextualIdentity {
  
  @scala.inline
  def apply(
    color: String,
    colorCode: String,
    cookieStoreId: String,
    icon: String,
    iconUrl: String,
    name: String
  ): ContextualIdentity = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorCode = colorCode.asInstanceOf[js.Any], cookieStoreId = cookieStoreId.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextualIdentity]
  }
  
  @scala.inline
  implicit class ContextualIdentityOps[Self <: ContextualIdentity] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorCode(value: String): Self = this.set("colorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieStoreId(value: String): Self = this.set("cookieStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
