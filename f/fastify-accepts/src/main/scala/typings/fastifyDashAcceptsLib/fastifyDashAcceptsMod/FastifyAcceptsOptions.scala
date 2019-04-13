package typings
package fastifyDashAcceptsLib.fastifyDashAcceptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastifyAcceptsOptions extends js.Object {
  var decorateReplyToo: js.UndefOr[scala.Boolean] = js.undefined
}

object FastifyAcceptsOptions {
  @scala.inline
  def apply(decorateReplyToo: js.UndefOr[scala.Boolean] = js.undefined): FastifyAcceptsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decorateReplyToo)) __obj.updateDynamic("decorateReplyToo")(decorateReplyToo)
    __obj.asInstanceOf[FastifyAcceptsOptions]
  }
}

