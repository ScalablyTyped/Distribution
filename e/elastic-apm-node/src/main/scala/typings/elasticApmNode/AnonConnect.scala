package typings.elasticApmNode

import typings.elasticApmNode.mod.Connect.ErrorHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnect extends js.Object {
  def connect(): ErrorHandleFunction
}

object AnonConnect {
  @scala.inline
  def apply(connect: () => ErrorHandleFunction): AnonConnect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect))
  
    __obj.asInstanceOf[AnonConnect]
  }
}

