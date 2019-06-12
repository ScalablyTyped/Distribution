package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleProtocolMethodSpec extends ProtocolMethodSpec {
  /**
    * Argument types.
    */
  var argTypes: js.Array[java.lang.String]
  /**
    * Whether this method is required or optional. Default is required.
    */
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Return type.
    */
  var retType: java.lang.String
}

object SimpleProtocolMethodSpec {
  @scala.inline
  def apply(
    argTypes: js.Array[java.lang.String],
    retType: java.lang.String,
    optional: js.UndefOr[scala.Boolean] = js.undefined
  ): SimpleProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(argTypes = argTypes, retType = retType)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[SimpleProtocolMethodSpec]
  }
}

