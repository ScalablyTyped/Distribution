package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleBlockSignature extends BlockSignature {
  /**
    * Argument types.
    */
  var argTypes: js.Array[String]
  /**
    * Return type.
    */
  var retType: String
}

object SimpleBlockSignature {
  @scala.inline
  def apply(argTypes: js.Array[String], retType: String): SimpleBlockSignature = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleBlockSignature]
  }
}

