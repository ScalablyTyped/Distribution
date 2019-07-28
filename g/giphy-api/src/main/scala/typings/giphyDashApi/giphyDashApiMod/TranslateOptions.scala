package typings.giphyDashApi.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateOptions extends BaseOptions {
  var s: String
}

object TranslateOptions {
  @scala.inline
  def apply(rating: Rating, s: String, fmt: Format = null): TranslateOptions = {
    val __obj = js.Dynamic.literal(rating = rating, s = s)
    if (fmt != null) __obj.updateDynamic("fmt")(fmt)
    __obj.asInstanceOf[TranslateOptions]
  }
}

