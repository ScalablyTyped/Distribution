package typings.ecdsaSigFormatter

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ecdsa-sig-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def derToJose(signature: String, alg: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("derToJose")(signature.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def derToJose(signature: Buffer, alg: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("derToJose")(signature.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def joseToDer(signature: String, alg: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("joseToDer")(signature.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def joseToDer(signature: Buffer, alg: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("joseToDer")(signature.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
