package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RectList extends js.Object {
  var rectList: js.Array[Anon_Bottom]
  var textList: js.Array[java.lang.String]
}

object Anon_RectList {
  @scala.inline
  def apply(rectList: js.Array[Anon_Bottom], textList: js.Array[java.lang.String]): Anon_RectList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rectList")(rectList)
    __obj.updateDynamic("textList")(textList)
    __obj.asInstanceOf[Anon_RectList]
  }
}

