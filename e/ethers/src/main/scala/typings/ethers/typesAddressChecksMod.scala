package typings.ethers

import typings.ethers.typesAddressMod.AddressLike
import typings.ethers.typesAddressMod.NameResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAddressChecksMod {
  
  @JSImport("ethers/types/address/checks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAddress(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddress")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isAddressable(value: Any): /* is ethers.ethers/types/address.Addressable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddressable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/address.Addressable */ Boolean]
  
  inline def resolveAddress(target: AddressLike): String | js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAddress")(target.asInstanceOf[js.Any]).asInstanceOf[String | js.Promise[String]]
  inline def resolveAddress(target: AddressLike, resolver: NameResolver): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAddress")(target.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
}
