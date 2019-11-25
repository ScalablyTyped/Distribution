package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ethereumDashProtocol.ethereumDashProtocolStrings.nonpayable
  - typings.ethereumDashProtocol.ethereumDashProtocolStrings.payable
*/
trait ConstructorStateMutability extends js.Object

object ConstructorStateMutability {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nonpayable: typings.ethereumDashProtocol.ethereumDashProtocolStrings.nonpayable = this.cast("nonpayable")
  @scala.inline
  def payable: typings.ethereumDashProtocol.ethereumDashProtocolStrings.payable = this.cast("payable")
}

