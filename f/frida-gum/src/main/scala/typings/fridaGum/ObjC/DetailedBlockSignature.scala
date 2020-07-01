package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedBlockSignature extends BlockSignature {
  /**
    * Signature.
    */
  var types: String
}

object DetailedBlockSignature {
  @scala.inline
  def apply(types: String): DetailedBlockSignature = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedBlockSignature]
  }
}

