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
  def apply(getListId: () => java.lang.String, getListParagraphs: () => js.Array[Paragraph]): List = {
    val __obj = js.Dynamic.literal(getListId = js.Any.fromFunction0(getListId), getListParagraphs = js.Any.fromFunction0(getListParagraphs))
  
    __obj.asInstanceOf[List]
  }
}

