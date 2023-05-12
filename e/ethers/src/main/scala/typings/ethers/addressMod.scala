package typings.ethers

import typings.ethers.anon.From
import typings.ethers.typesAddressMod.AddressLike
import typings.ethers.typesAddressMod.NameResolver
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object addressMod {
  
  @JSImport("ethers/address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getCreate2Address(_from: String, _salt: BytesLike, _initCodeHash: BytesLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCreate2Address")(_from.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], _initCodeHash.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCreateAddress(tx: From): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreateAddress")(tx.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIcapAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcapAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAddress(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddress")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isAddressable(value: Any): /* is ethers.ethers/types/address.Addressable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddressable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/address.Addressable */ Boolean]
  
  inline def resolveAddress(target: AddressLike): String | js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAddress")(target.asInstanceOf[js.Any]).asInstanceOf[String | js.Promise[String]]
  inline def resolveAddress(target: AddressLike, resolver: NameResolver): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAddress")(target.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
}
