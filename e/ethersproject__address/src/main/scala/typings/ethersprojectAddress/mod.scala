package typings.ethersprojectAddress

import typings.ethersprojectAddress.anon.From
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getContractAddress(transaction: From): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(transaction.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getCreate2Address(from: String, salt: BytesLike, initCodeHash: BytesLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCreate2Address")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCodeHash.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getIcapAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcapAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
