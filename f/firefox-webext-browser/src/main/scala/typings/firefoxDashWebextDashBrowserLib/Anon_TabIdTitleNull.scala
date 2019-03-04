package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TabIdTitleNull extends js.Object {
  /** The id of the tab for which you want to modify the page action. */
  var tabId: scala.Double
  /** The tooltip string. */
  var title: java.lang.String | scala.Null
}

object Anon_TabIdTitleNull {
  @scala.inline
  def apply(tabId: scala.Double, title: java.lang.String = null): Anon_TabIdTitleNull = {
    val __obj = js.Dynamic.literal(tabId = tabId)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_TabIdTitleNull]
  }
}

