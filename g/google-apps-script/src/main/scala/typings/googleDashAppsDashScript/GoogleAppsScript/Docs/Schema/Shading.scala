package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shading extends js.Object {
  var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
}

object Shading {
  @scala.inline
  def apply(backgroundColor: OptionalColor = null): Shading = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shading]
  }
}

