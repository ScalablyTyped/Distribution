package typings.ethersprojectAbstractProvider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abstract-provider", "TransactionForkEvent")
@js.native
class TransactionForkEvent protected () extends ForkEvent {
  def this(hash: String) = this()
  def this(hash: String, expiry: Double) = this()
  
  val _isTransactionOrderForkEvent: js.UndefOr[Boolean] = js.native
  
  val hash: String = js.native
}
