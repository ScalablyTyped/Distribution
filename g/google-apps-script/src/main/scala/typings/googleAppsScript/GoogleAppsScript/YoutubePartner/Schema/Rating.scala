package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rating extends js.Object {
  var rating: js.UndefOr[String] = js.undefined
  var ratingSystem: js.UndefOr[String] = js.undefined
}

object Rating {
  @scala.inline
  def apply(rating: String = null, ratingSystem: String = null): Rating = {
    val __obj = js.Dynamic.literal()
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (ratingSystem != null) __obj.updateDynamic("ratingSystem")(ratingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rating]
  }
}

