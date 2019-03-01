package typings
package gapiDotClientDotWebfontsLib.gapiNs.clientNs.webfontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebfontList extends js.Object {
  /** The list of fonts currently served by the Google Fonts API. */
  var items: js.UndefOr[js.Array[Webfont]] = js.undefined
  /** This kind represents a list of webfont objects in the webfonts service. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object WebfontList {
  @scala.inline
  def apply(items: js.Array[Webfont] = null, kind: java.lang.String = null): WebfontList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[WebfontList]
  }
}

