package typings.gitlab.distTypesCoreInfrastructureBaseServiceMod

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
    val __obj = js.Dynamic.literal(delete = delete, get = get, post = post, put = put)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Requester]
  }
}

