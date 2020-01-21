package typings.giphyApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomOptions extends BaseOptions {
  var tag: String
}

object RandomOptions {
  @scala.inline
  def apply(rating: Rating, tag: String, fmt: Format = null): RandomOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (fmt != null) __obj.updateDynamic("fmt")(fmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomOptions]
  }
}

