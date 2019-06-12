package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedProtocolMethodSpec extends ProtocolMethodSpec {
  /**
    * Whether this method is required or optional. Default is required.
    */
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Method signature.
    */
  var types: java.lang.String
}

object DetailedProtocolMethodSpec {
  @scala.inline
  def apply(types: java.lang.String, optional: js.UndefOr[scala.Boolean] = js.undefined): DetailedProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(types = types)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[DetailedProtocolMethodSpec]
  }
}

