package typings
package giphyDashApiLib.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomOptions extends BaseOptions {
  var tag: java.lang.String
}

object RandomOptions {
  @scala.inline
  def apply(rating: Rating, tag: java.lang.String, fmt: Format = null): RandomOptions = {
    val __obj = js.Dynamic.literal(rating = rating, tag = tag)
    if (fmt != null) __obj.updateDynamic("fmt")(fmt)
    __obj.asInstanceOf[RandomOptions]
  }
}

