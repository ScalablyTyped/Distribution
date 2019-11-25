package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AspectRating extends js.Object {
  /** the user's rating for this particular aspect, from 0 to 3. */
  var rating: Double
  /** the name of the aspect that is being rated. */
  var `type`: AspectRatingType
}

object AspectRating {
  @scala.inline
  def apply(rating: Double, `type`: AspectRatingType): AspectRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AspectRating]
  }
}

