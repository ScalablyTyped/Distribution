package typings.fuzzaldrin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[K /* <: String */] extends js.Object {
  var key: K
  var maxResults: js.UndefOr[Double] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply[K /* <: String */](key: K, maxResults: Int | Double = null): Anon_Key[K] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key[K]]
  }
}

