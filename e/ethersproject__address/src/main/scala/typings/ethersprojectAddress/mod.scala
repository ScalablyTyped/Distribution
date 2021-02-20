package typings.ethersprojectAddress

import typings.ethersprojectAddress.anon.From
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/address", "getAddress")
  @js.native
  def getAddress(address: String): String = js.native
  
  @JSImport("@ethersproject/address", "getContractAddress")
  @js.native
  def getContractAddress(transaction: From): String = js.native
  
  @JSImport("@ethersproject/address", "getCreate2Address")
  @js.native
  def getCreate2Address(from: String, salt: BytesLike, initCodeHash: BytesLike): String = js.native
  
  @JSImport("@ethersproject/address", "getIcapAddress")
  @js.native
  def getIcapAddress(address: String): String = js.native
  
  @JSImport("@ethersproject/address", "isAddress")
  @js.native
  def isAddress(address: String): Boolean = js.native
}
