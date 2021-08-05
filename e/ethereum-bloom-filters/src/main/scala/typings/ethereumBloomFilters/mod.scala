package typings.ethereumBloomFilters

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereum-bloom-filters/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBloom(bloom: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBloom")(bloom.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isContractAddressInBloom(bloom: String, contractAddress: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContractAddressInBloom")(bloom.asInstanceOf[js.Any], contractAddress.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInBloom(bloom: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInBloom")(bloom.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isInBloom(bloom: String, value: Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInBloom")(bloom.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTopic(topic: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTopic")(topic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTopicInBloom(bloom: String, topic: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTopicInBloom")(bloom.asInstanceOf[js.Any], topic.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUserEthereumAddressInBloom(bloom: String, ethereumAddress: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUserEthereumAddressInBloom")(bloom.asInstanceOf[js.Any], ethereumAddress.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
