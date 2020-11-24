package typings.ethereumCryptography

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereum-cryptography/random", JSImport.Namespace)
@js.native
object randomMod extends js.Object {
  
  def getRandomBytes(bytes: Double): js.Promise[Buffer] = js.native
  
  def getRandomBytesSync(bytes: Double): Buffer = js.native
}
