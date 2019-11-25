package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ethereumDashProtocol.ethereumDashProtocolStrings.pure
  - typings.ethereumDashProtocol.ethereumDashProtocolStrings.view
  - typings.ethereumDashProtocol.ethereumDashProtocolStrings.nonpayable
  - typings.ethereumDashProtocol.ethereumDashProtocolStrings.payable
*/
trait StateMutability extends js.Object

object StateMutability {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nonpayable: typings.ethereumDashProtocol.ethereumDashProtocolStrings.nonpayable = this.cast("nonpayable")
  @scala.inline
  def payable: typings.ethereumDashProtocol.ethereumDashProtocolStrings.payable = this.cast("payable")
  @scala.inline
  def pure: typings.ethereumDashProtocol.ethereumDashProtocolStrings.pure = this.cast("pure")
  @scala.inline
  def view: typings.ethereumDashProtocol.ethereumDashProtocolStrings.view = this.cast("view")
}

