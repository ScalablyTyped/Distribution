package typings.ethersprojectAbstractProvider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abstract-provider", "BlockForkEvent")
@js.native
class BlockForkEvent protected () extends ForkEvent {
  def this(blockHash: String) = this()
  def this(blockHash: String, expiry: Double) = this()
  
  val _isBlockForkEvent: js.UndefOr[Boolean] = js.native
  
  val blockHash: String = js.native
}
