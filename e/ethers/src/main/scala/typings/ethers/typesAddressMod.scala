package typings.ethers

import typings.ethers.anon.From
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAddressMod {
  
  @JSImport("ethers/types/address", JSImport.Namespace)
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
  
  type AddressLike = String | js.Promise[String] | Addressable
  
  trait Addressable extends StObject {
    
    /**
      *  Get the object address.
      */
    def getAddress(): js.Promise[String]
  }
  object Addressable {
    
    inline def apply(getAddress: () => js.Promise[String]): Addressable = {
      val __obj = js.Dynamic.literal(getAddress = js.Any.fromFunction0(getAddress))
      __obj.asInstanceOf[Addressable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Addressable] (val x: Self) extends AnyVal {
      
      inline def setGetAddress(value: () => js.Promise[String]): Self = StObject.set(x, "getAddress", js.Any.fromFunction0(value))
    }
  }
  
  trait NameResolver extends StObject {
    
    /**
      *  Resolve to the address for the ENS %%name%%.
      *
      *  Resolves to ``null`` if the name is unconfigued. Use
      *  [[resolveAddress]] (passing this object as %%resolver%%) to
      *  throw for names that are unconfigured.
      */
    def resolveName(name: String): js.Promise[Null | String]
  }
  object NameResolver {
    
    inline def apply(resolveName: String => js.Promise[Null | String]): NameResolver = {
      val __obj = js.Dynamic.literal(resolveName = js.Any.fromFunction1(resolveName))
      __obj.asInstanceOf[NameResolver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameResolver] (val x: Self) extends AnyVal {
      
      inline def setResolveName(value: String => js.Promise[Null | String]): Self = StObject.set(x, "resolveName", js.Any.fromFunction1(value))
    }
  }
}
