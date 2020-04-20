package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextualIdentity extends js.Object {
  /** Contextual identity that has been removed */
  var contextualIdentity: ContextualIdentity
}

object AnonContextualIdentity {
  @scala.inline
  def apply(contextualIdentity: ContextualIdentity): AnonContextualIdentity = {
    val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextualIdentity]
  }
}

