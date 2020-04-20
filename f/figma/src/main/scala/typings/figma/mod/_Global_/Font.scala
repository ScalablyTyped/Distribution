package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var fontName: FontName
}

object Font {
  @scala.inline
  def apply(fontName: FontName): Font = {
    val __obj = js.Dynamic.literal(fontName = fontName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

