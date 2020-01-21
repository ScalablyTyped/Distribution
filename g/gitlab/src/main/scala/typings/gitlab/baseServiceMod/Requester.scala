package typings.gitlab.baseServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Requester extends js.Object {
  var delete: js.Function
  var get: js.Function
  var post: js.Function
  var put: js.Function
  var stream: js.UndefOr[js.Function] = js.undefined
}

object Requester {
  @scala.inline
  def apply(
    delete: js.Function,
    get: js.Function,
    post: js.Function,
    put: js.Function,
    stream: js.Function = null
  ): Requester = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requester]
  }
}

