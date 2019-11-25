package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Del extends js.Object {
  var del: js.Function
  var get: js.Function
  var getAndPassUp: js.Function
  var mget: js.Function
  var mset: js.Function
  var reset: js.Function
  var set: js.Function
  var wrap: js.Function
}

object Anon_Del {
  @scala.inline
  def apply(
    del: js.Function,
    get: js.Function,
    getAndPassUp: js.Function,
    mget: js.Function,
    mset: js.Function,
    reset: js.Function,
    set: js.Function,
    wrap: js.Function
  ): Anon_Del = {
    val __obj = js.Dynamic.literal(del = del.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getAndPassUp = getAndPassUp.asInstanceOf[js.Any], mget = mget.asInstanceOf[js.Any], mset = mset.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Del]
  }
}

