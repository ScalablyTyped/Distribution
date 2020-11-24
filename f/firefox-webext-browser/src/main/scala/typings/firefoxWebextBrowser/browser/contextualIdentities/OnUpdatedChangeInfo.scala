package typings.firefoxWebextBrowser.browser.contextualIdentities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnUpdatedChangeInfo extends js.Object {
  
  /** Contextual identity that has been updated */
  var contextualIdentity: ContextualIdentity = js.native
}
object OnUpdatedChangeInfo {
  
  @scala.inline
  def apply(contextualIdentity: ContextualIdentity): OnUpdatedChangeInfo = {
    val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUpdatedChangeInfo]
  }
  
  @scala.inline
  implicit class OnUpdatedChangeInfoOps[Self <: OnUpdatedChangeInfo] (val x: Self) extends AnyVal {
    
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
    def setContextualIdentity(value: ContextualIdentity): Self = this.set("contextualIdentity", value.asInstanceOf[js.Any])
  }
}
