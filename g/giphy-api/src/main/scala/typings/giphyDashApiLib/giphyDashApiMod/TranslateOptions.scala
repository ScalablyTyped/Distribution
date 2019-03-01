package typings
package giphyDashApiLib.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateOptions extends BaseOptions {
  var s: java.lang.String
}

object TranslateOptions {
  @scala.inline
  def apply(rating: giphyDashApiLib.Rating, s: java.lang.String, fmt: giphyDashApiLib.Format = null): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rating")(rating)
    __obj.updateDynamic("s")(s)
    if (fmt != null) __obj.updateDynamic("fmt")(fmt)
    __obj.asInstanceOf[TranslateOptions]
  }
}

