package typings.ethereumCryptography

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereum-cryptography/pbkdf2", JSImport.Namespace)
@js.native
object pbkdf2Mod extends js.Object {
  
  def pbkdf2(password: Buffer, salt: Buffer, iterations: Double, keylen: Double, digest: String): js.Promise[Buffer] = js.native
  
  def pbkdf2Sync(password: Buffer, salt: Buffer, iterations: Double, keylen: Double, digest: String): Buffer = js.native
}
