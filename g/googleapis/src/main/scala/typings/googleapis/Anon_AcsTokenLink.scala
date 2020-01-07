package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AcsTokenLink extends js.Object {
  var acsTokenLink: js.UndefOr[String] = js.native
  var downloadLink: js.UndefOr[String] = js.native
  var isAvailable: js.UndefOr[Boolean] = js.native
}

object Anon_AcsTokenLink {
  @scala.inline
  def apply(
    acsTokenLink: String = null,
    downloadLink: String = null,
    isAvailable: js.UndefOr[Boolean] = js.undefined
  ): Anon_AcsTokenLink = {
    val __obj = js.Dynamic.literal()
    if (acsTokenLink != null) __obj.updateDynamic("acsTokenLink")(acsTokenLink.asInstanceOf[js.Any])
    if (downloadLink != null) __obj.updateDynamic("downloadLink")(downloadLink.asInstanceOf[js.Any])
    if (!js.isUndefined(isAvailable)) __obj.updateDynamic("isAvailable")(isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AcsTokenLink]
  }
}

