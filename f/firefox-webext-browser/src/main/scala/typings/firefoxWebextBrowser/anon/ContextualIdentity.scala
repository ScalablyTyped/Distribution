package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualIdentity extends js.Object {
  /** Contextual identity that has been removed */
  var contextualIdentity: typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
}

object ContextualIdentity {
  @scala.inline
  def apply(contextualIdentity: typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity): ContextualIdentity = {
    val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextualIdentity]
  }
}

