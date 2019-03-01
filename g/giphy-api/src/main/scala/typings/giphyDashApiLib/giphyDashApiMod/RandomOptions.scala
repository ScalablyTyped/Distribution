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
  def apply(rating: giphyDashApiLib.Rating, tag: java.lang.String, fmt: giphyDashApiLib.Format = null): RandomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rating")(rating)
    __obj.updateDynamic("tag")(tag)
    if (fmt != null) __obj.updateDynamic("fmt")(fmt)
    __obj.asInstanceOf[RandomOptions]
  }
}

