package typings
package firefoxDashWebextDashBrowserLib.browserNs.contextualIdentitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* contextualIdentities types */
/** Represents information about a contextual identity. */
trait ContextualIdentity extends js.Object {
  /** The color name of the contextual identity. */
  var color: java.lang.String
  /** The color hash of the contextual identity. */
  var colorCode: java.lang.String
  /** The cookie store ID of the contextual identity. */
  var cookieStoreId: java.lang.String
  /** The icon name of the contextual identity. */
  var icon: java.lang.String
  /** The icon url of the contextual identity. */
  var iconUrl: java.lang.String
  /** The name of the contextual identity. */
  var name: java.lang.String
}

object ContextualIdentity {
  @scala.inline
  def apply(
    color: java.lang.String,
    colorCode: java.lang.String,
    cookieStoreId: java.lang.String,
    icon: java.lang.String,
    iconUrl: java.lang.String,
    name: java.lang.String
  ): ContextualIdentity = {
    val __obj = js.Dynamic.literal(color = color, colorCode = colorCode, cookieStoreId = cookieStoreId, icon = icon, iconUrl = iconUrl, name = name)
  
    __obj.asInstanceOf[ContextualIdentity]
  }
}

