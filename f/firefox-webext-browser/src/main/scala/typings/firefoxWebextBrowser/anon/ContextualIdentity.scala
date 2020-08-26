package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextualIdentity extends js.Object {
  /** Contextual identity that has been removed */
  var contextualIdentity: typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity = js.native
}

object ContextualIdentity {
  @scala.inline
  def apply(contextualIdentity: typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity): ContextualIdentity = {
    val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
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
    def setContextualIdentity(value: typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity): Self = this.set("contextualIdentity", value.asInstanceOf[js.Any])
  }
  
}

