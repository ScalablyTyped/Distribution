package typings.fuzzaldrin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey[K /* <: /* keyof T */ String */, T] extends js.Object {
  var key: K
  var maxResults: js.UndefOr[Double] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply[K /* <: /* keyof T */ String */, T](key: K, maxResults: Int | Double = null): AnonKey[K, T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey[K, T]]
  }
}

