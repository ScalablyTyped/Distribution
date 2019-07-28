package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSearchResponse[T] extends js.Object {
  var responses: js.UndefOr[js.Array[SearchResponse[T]]] = js.undefined
}

object MSearchResponse {
  @scala.inline
  def apply[T](responses: js.Array[SearchResponse[T]] = null): MSearchResponse[T] = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses)
    __obj.asInstanceOf[MSearchResponse[T]]
  }
}

