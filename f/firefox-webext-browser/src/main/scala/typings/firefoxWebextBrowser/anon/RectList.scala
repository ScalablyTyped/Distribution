package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectList extends js.Object {
  var rectList: js.Array[Bottom]
  var textList: js.Array[String]
}

object RectList {
  @scala.inline
  def apply(rectList: js.Array[Bottom], textList: js.Array[String]): RectList = {
    val __obj = js.Dynamic.literal(rectList = rectList.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectList]
  }
}

