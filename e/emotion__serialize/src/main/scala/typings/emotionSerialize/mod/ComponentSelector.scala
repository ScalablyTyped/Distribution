package typings.emotionSerialize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentSelector
  extends _CSSInterpolation
     with _Interpolation[js.Any] {
  var __emotion_styles: js.Any
}

object ComponentSelector {
  @scala.inline
  def apply(__emotion_styles: js.Any): ComponentSelector = {
    val __obj = js.Dynamic.literal(__emotion_styles = __emotion_styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSelector]
  }
}

