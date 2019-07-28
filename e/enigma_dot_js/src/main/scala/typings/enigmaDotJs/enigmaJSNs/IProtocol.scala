package typings.enigmaDotJs.enigmaJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProtocol extends js.Object {
  // Set to false to disable the use of the bandwidth-reducing delta protocol.
  var delta: js.UndefOr[Boolean] = js.undefined
}

object IProtocol {
  @scala.inline
  def apply(delta: js.UndefOr[Boolean] = js.undefined): IProtocol = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta)
    __obj.asInstanceOf[IProtocol]
  }
}

