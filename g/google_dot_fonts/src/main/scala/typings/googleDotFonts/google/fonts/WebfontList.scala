package typings.googleDotFonts.google.fonts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebfontList extends js.Object {
  var items: js.Array[WebfontFamily]
  var kind: String
}

object WebfontList {
  @scala.inline
  def apply(items: js.Array[WebfontFamily], kind: String): WebfontList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebfontList]
  }
}

