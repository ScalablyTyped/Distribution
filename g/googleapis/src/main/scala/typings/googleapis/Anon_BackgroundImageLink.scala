package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BackgroundImageLink extends js.Object {
  var backgroundImageLink: js.UndefOr[String] = js.native
  var colorRgb: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
}

object Anon_BackgroundImageLink {
  @scala.inline
  def apply(backgroundImageLink: String = null, colorRgb: String = null, id: String = null): Anon_BackgroundImageLink = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink.asInstanceOf[js.Any])
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundImageLink]
  }
}

