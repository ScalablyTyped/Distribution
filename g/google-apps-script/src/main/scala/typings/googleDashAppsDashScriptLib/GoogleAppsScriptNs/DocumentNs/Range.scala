package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  def getRangeElements(): js.Array[RangeElement]
  def getSelectedElements(): js.Array[RangeElement]
}

object Range {
  @scala.inline
  def apply(
    getRangeElements: js.Function0[js.Array[RangeElement]],
    getSelectedElements: js.Function0[js.Array[RangeElement]]
  ): Range = {
    val __obj = js.Dynamic.literal(getRangeElements = getRangeElements, getSelectedElements = getSelectedElements)
  
    __obj.asInstanceOf[Range]
  }
}

