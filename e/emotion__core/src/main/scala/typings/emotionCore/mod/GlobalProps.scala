package typings.emotionCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalProps[Theme] extends js.Object {
  var styles: InterpolationWithTheme[Theme]
}

object GlobalProps {
  @scala.inline
  def apply[Theme](styles: InterpolationWithTheme[Theme] = null): GlobalProps[Theme] = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalProps[Theme]]
  }
}

