package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageElementRange extends js.Object {
  def getPageElements(): js.Array[PageElement]
}

object PageElementRange {
  @scala.inline
  def apply(getPageElements: js.Function0[js.Array[PageElement]]): PageElementRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPageElements")(getPageElements)
    __obj.asInstanceOf[PageElementRange]
  }
}

