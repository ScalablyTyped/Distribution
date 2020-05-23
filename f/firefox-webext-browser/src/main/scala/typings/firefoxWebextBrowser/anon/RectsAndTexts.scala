package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectsAndTexts extends js.Object {
  var rectsAndTexts: RectList
  var textList: String
}

object RectsAndTexts {
  @scala.inline
  def apply(rectsAndTexts: RectList, textList: String): RectsAndTexts = {
    val __obj = js.Dynamic.literal(rectsAndTexts = rectsAndTexts.asInstanceOf[js.Any], textList = textList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectsAndTexts]
  }
}

