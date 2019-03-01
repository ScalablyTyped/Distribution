package typings
package googleDotFontsLib.googleNs.fontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebfontList extends js.Object {
  var items: js.Array[WebfontFamily]
  var kind: java.lang.String
}

object WebfontList {
  @scala.inline
  def apply(items: js.Array[WebfontFamily], kind: java.lang.String): WebfontList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[WebfontList]
  }
}

