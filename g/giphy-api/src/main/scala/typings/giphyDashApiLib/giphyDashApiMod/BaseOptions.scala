package typings
package giphyDashApiLib.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var fmt: js.UndefOr[Format] = js.undefined
  var rating: Rating
}

object BaseOptions {
  @scala.inline
  def apply(rating: Rating, fmt: Format = null): BaseOptions = {
    val __obj = js.Dynamic.literal(rating = rating)
    if (fmt != null) __obj.updateDynamic("fmt")(fmt)
    __obj.asInstanceOf[BaseOptions]
  }
}

