package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AspectRating extends js.Object {
  /** the user's rating for this particular aspect, from 0 to 3. */
  var rating: Double = js.native
  /** the name of the aspect that is being rated. */
  var `type`: AspectRatingType = js.native
}

object AspectRating {
  @scala.inline
  def apply(rating: Double, `type`: AspectRatingType): AspectRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AspectRating]
  }
  @scala.inline
  implicit class AspectRatingOps[Self <: AspectRating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AspectRatingType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

