package typings.fuzzaldrin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key[K /* <: /* keyof T */ String */, T] extends js.Object {
  var key: K
  var maxResults: js.UndefOr[Double] = js.undefined
}

object Key {
  @scala.inline
  def apply[K, T](key: K, maxResults: js.UndefOr[Double] = js.undefined): Key[K, T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[K, T]]
  }
}

