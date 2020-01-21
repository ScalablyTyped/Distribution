package typings.googleGax.apitypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GRPCCallResult extends js.Object {
  def cancel(): Unit
}

object GRPCCallResult {
  @scala.inline
  def apply(cancel: () => Unit): GRPCCallResult = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[GRPCCallResult]
  }
}

