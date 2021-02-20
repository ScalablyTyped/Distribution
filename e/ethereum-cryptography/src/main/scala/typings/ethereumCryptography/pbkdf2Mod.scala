package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2Mod {
  
  @JSImport("ethereum-cryptography/pbkdf2", "pbkdf2")
  @js.native
  def pbkdf2(password: Buffer, salt: Buffer, iterations: Double, keylen: Double, digest: String): js.Promise[Buffer] = js.native
  
  @JSImport("ethereum-cryptography/pbkdf2", "pbkdf2Sync")
  @js.native
  def pbkdf2Sync(password: Buffer, salt: Buffer, iterations: Double, keylen: Double, digest: String): Buffer = js.native
}
