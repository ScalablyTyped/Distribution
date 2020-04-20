package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRectList extends js.Object {
  var rectList: js.Array[AnonBottom]
  var textList: js.Array[String]
}

object AnonRectList {
  @scala.inline
  def apply(rectList: js.Array[AnonBottom], textList: js.Array[String]): AnonRectList = {
    val __obj = js.Dynamic.literal(rectList = rectList.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRectList]
  }
}

