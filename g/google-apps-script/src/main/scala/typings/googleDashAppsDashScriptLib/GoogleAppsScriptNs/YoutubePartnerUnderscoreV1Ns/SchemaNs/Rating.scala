package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rating extends js.Object {
  var rating: js.UndefOr[java.lang.String] = js.undefined
  var ratingSystem: js.UndefOr[java.lang.String] = js.undefined
}

object Rating {
  @scala.inline
  def apply(rating: java.lang.String = null, ratingSystem: java.lang.String = null): Rating = {
    val __obj = js.Dynamic.literal()
    if (rating != null) __obj.updateDynamic("rating")(rating)
    if (ratingSystem != null) __obj.updateDynamic("ratingSystem")(ratingSystem)
    __obj.asInstanceOf[Rating]
  }
}

