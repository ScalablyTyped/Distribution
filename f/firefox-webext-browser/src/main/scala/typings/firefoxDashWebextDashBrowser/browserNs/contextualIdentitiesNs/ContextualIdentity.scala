package typings.firefoxDashWebextDashBrowser.browserNs.contextualIdentitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* contextualIdentities types */
/** Represents information about a contextual identity. */
trait ContextualIdentity extends js.Object {
  /** The color name of the contextual identity. */
  var color: String
  /** The color hash of the contextual identity. */
  var colorCode: String
  /** The cookie store ID of the contextual identity. */
  var cookieStoreId: String
  /** The icon name of the contextual identity. */
  var icon: String
  /** The icon url of the contextual identity. */
  var iconUrl: String
  /** The name of the contextual identity. */
  var name: String
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
    val __obj = js.Dynamic.literal(color = color, colorCode = colorCode, cookieStoreId = cookieStoreId, icon = icon, iconUrl = iconUrl, name = name)
  
    __obj.asInstanceOf[ContextualIdentity]
  }
}

