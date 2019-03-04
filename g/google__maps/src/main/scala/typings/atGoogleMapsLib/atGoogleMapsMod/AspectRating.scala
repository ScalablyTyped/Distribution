package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AspectRating extends js.Object {
  /** the user's rating for this particular aspect, from 0 to 3. */
  var rating: scala.Double
  /** the name of the aspect that is being rated. */
  var `type`: AspectRatingType
}

object AspectRating {
  @scala.inline
  def apply(rating: scala.Double, `type`: AspectRatingType): AspectRating = {
    val __obj = js.Dynamic.literal(rating = rating)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AspectRating]
  }
}

