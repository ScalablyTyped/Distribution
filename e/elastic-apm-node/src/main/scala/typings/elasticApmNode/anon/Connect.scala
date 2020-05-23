package typings.elasticApmNode.anon

import typings.elasticApmNode.mod.Connect.ErrorHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connect extends js.Object {
  def connect(): ErrorHandleFunction
}

object Connect {
  @scala.inline
  def apply(connect: () => ErrorHandleFunction): Connect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect))
    __obj.asInstanceOf[Connect]
  }
}

