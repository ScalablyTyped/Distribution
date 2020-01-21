package typings.giphyApi.mod

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
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    if (fmt != null) __obj.updateDynamic("fmt")(fmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

