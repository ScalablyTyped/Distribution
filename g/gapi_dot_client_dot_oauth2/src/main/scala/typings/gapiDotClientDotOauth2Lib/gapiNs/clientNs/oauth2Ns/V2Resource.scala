package typings
package gapiDotClientDotOauth2Lib.gapiNs.clientNs.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V2Resource extends js.Object {
  var me: MeResource
}

object V2Resource {
  @scala.inline
  def apply(me: MeResource): V2Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("me")(me)
    __obj.asInstanceOf[V2Resource]
  }
}

