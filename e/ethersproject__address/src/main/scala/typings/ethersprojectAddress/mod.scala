package typings.ethersprojectAddress

import typings.ethersprojectAddress.anon.From
import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/address", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getAddress(address: String): String = js.native
  
  def getContractAddress(transaction: From): String = js.native
  
  def getCreate2Address(from: String, salt: BytesLike, initCodeHash: BytesLike): String = js.native
  
  def getIcapAddress(address: String): String = js.native
  
  def isAddress(address: String): Boolean = js.native
}
