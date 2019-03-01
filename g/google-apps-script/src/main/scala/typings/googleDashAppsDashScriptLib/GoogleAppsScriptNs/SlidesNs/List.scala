package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  def getListId(): java.lang.String
  def getListParagraphs(): js.Array[Paragraph]
}

object List {
  @scala.inline
  def apply(getListId: js.Function0[java.lang.String], getListParagraphs: js.Function0[js.Array[Paragraph]]): List = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getListId")(getListId)
    __obj.updateDynamic("getListParagraphs")(getListParagraphs)
    __obj.asInstanceOf[List]
  }
}

