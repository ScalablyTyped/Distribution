package typings.ethersprojectHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNamehashMod {
  
  @JSImport("@ethersproject/hash/lib/namehash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dnsEncode(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsEncode")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ensNormalize(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensNormalize")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def namehash(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("namehash")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
