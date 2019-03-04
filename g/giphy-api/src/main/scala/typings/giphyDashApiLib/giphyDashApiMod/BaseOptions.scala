package typings
package giphyDashApiLib.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var fmt: js.UndefOr[giphyDashApiLib.Format] = js.undefined
  var rating: giphyDashApiLib.Rating
}

object BaseOptions {
  @scala.inline
  def apply(rating: giphyDashApiLib.Rating, fmt: giphyDashApiLib.Format = null): BaseOptions = {
    val __obj = js.Dynamic.literal(rating = rating)
    if (fmt != null) __obj.updateDynamic("fmt")(fmt)
    __obj.asInstanceOf[BaseOptions]
  }
}

