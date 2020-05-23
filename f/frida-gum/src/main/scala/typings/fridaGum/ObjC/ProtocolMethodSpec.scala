package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.ObjC.SimpleProtocolMethodSpec
  - typings.fridaGum.ObjC.DetailedProtocolMethodSpec
*/
trait ProtocolMethodSpec extends js.Object

object ProtocolMethodSpec {
  @scala.inline
  def SimpleProtocolMethodSpec(argTypes: js.Array[String], retType: String, optional: js.UndefOr[Boolean] = js.undefined): ProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolMethodSpec]
  }
  @scala.inline
  def DetailedProtocolMethodSpec(types: String, optional: js.UndefOr[Boolean] = js.undefined): ProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolMethodSpec]
  }
}

