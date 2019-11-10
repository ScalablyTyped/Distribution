package typings.fridaDashGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedMethodSpec[I] extends MethodSpec[I] {
  /**
    * Implementation.
    */
  var implementation: I
  /**
    * Signature.
    */
  var types: String
}

object DetailedMethodSpec {
  @scala.inline
  def apply[I](implementation: I, types: String): DetailedMethodSpec[I] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any], types = types)
  
    __obj.asInstanceOf[DetailedMethodSpec[I]]
  }
}

