package typings.ethersprojectAbstractProvider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abstract-provider", "TransactionOrderForkEvent")
@js.native
class TransactionOrderForkEvent protected () extends ForkEvent {
  def this(beforeHash: String, afterHash: String) = this()
  def this(beforeHash: String, afterHash: String, expiry: Double) = this()
  
  val afterHash: String = js.native
  
  val beforeHash: String = js.native
}
