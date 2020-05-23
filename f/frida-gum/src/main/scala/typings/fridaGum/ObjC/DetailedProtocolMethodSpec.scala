package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedProtocolMethodSpec extends ProtocolMethodSpec {
  /**
    * Whether this method is required or optional. Default is required.
    */
  var optional: js.UndefOr[Boolean] = js.undefined
  /**
    * Method signature.
    */
  var types: String
}

object DetailedProtocolMethodSpec {
  @scala.inline
  def apply(types: String, optional: js.UndefOr[Boolean] = js.undefined): DetailedProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedProtocolMethodSpec]
  }
}

