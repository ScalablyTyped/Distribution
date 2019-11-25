package typings.fridaDashGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleProtocolMethodSpec extends ProtocolMethodSpec {
  /**
    * Argument types.
    */
  var argTypes: js.Array[String]
  /**
    * Whether this method is required or optional. Default is required.
    */
  var optional: js.UndefOr[Boolean] = js.undefined
  /**
    * Return type.
    */
  var retType: String
}

object SimpleProtocolMethodSpec {
  @scala.inline
  def apply(argTypes: js.Array[String], retType: String, optional: js.UndefOr[Boolean] = js.undefined): SimpleProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleProtocolMethodSpec]
  }
}

