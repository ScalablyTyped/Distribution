package typings.ecdsaSigFormatter

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ecdsa-sig-formatter", "derToJose")
  @js.native
  def derToJose(signature: String, alg: String): String = js.native
  @JSImport("ecdsa-sig-formatter", "derToJose")
  @js.native
  def derToJose(signature: Buffer, alg: String): String = js.native
  
  @JSImport("ecdsa-sig-formatter", "joseToDer")
  @js.native
  def joseToDer(signature: String, alg: String): Buffer = js.native
  @JSImport("ecdsa-sig-formatter", "joseToDer")
  @js.native
  def joseToDer(signature: Buffer, alg: String): Buffer = js.native
}
