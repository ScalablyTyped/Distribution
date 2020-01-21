package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ethereumProtocol.ethereumProtocolStrings.pure
  - typings.ethereumProtocol.ethereumProtocolStrings.view
  - typings.ethereumProtocol.ethereumProtocolStrings.nonpayable
  - typings.ethereumProtocol.ethereumProtocolStrings.payable
*/
trait StateMutability extends js.Object

object StateMutability {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nonpayable: typings.ethereumProtocol.ethereumProtocolStrings.nonpayable = this.cast("nonpayable")
  @scala.inline
  def payable: typings.ethereumProtocol.ethereumProtocolStrings.payable = this.cast("payable")
  @scala.inline
  def pure: typings.ethereumProtocol.ethereumProtocolStrings.pure = this.cast("pure")
  @scala.inline
  def view: typings.ethereumProtocol.ethereumProtocolStrings.view = this.cast("view")
}

