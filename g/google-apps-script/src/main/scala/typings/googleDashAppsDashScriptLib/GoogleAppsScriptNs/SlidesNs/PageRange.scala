package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageRange extends js.Object {
  def getPages(): js.Array[Page]
}

object PageRange {
  @scala.inline
  def apply(getPages: js.Function0[js.Array[Page]]): PageRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPages")(getPages)
    __obj.asInstanceOf[PageRange]
  }
}

