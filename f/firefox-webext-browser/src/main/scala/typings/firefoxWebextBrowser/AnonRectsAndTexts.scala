package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRectsAndTexts extends js.Object {
  var rectsAndTexts: AnonRectList
  var textList: String
}

object AnonRectsAndTexts {
  @scala.inline
  def apply(rectsAndTexts: AnonRectList, textList: String): AnonRectsAndTexts = {
    val __obj = js.Dynamic.literal(rectsAndTexts = rectsAndTexts.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRectsAndTexts]
  }
}

