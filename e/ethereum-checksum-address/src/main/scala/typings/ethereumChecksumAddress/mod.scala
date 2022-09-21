package typings.ethereumChecksumAddress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereum-checksum-address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkAddressChecksum(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkAddressChecksum")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def checkAddressChecksum(address: String, chainId: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAddressChecksum")(address.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def checkAddressChecksum(address: String, chainId: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAddressChecksum")(address.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toChecksumAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toChecksumAddress(address: String, chainId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(address.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toChecksumAddress(address: String, chainId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(address.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[String]
}
