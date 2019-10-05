package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedStyles extends js.Object {
  var styles: js.UndefOr[js.Array[NamedStyle]] = js.undefined
}

object NamedStyles {
  @scala.inline
  def apply(styles: js.Array[NamedStyle] = null): NamedStyles = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[NamedStyles]
  }
}

