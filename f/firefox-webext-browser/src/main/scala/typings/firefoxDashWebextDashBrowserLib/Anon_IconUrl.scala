package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IconUrl extends js.Object {
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
}

object Anon_IconUrl {
  @scala.inline
  def apply(title: java.lang.String, iconUrl: java.lang.String = null): Anon_IconUrl = {
    val __obj = js.Dynamic.literal(title = title)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    __obj.asInstanceOf[Anon_IconUrl]
  }
}

