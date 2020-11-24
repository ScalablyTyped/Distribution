package typings.ethereumCryptography

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereum-cryptography/scrypt", JSImport.Namespace)
@js.native
object scryptMod extends js.Object {
  
  def scrypt(password: Buffer, salt: Buffer, n: Double, p: Double, r: Double, dklen: Double): js.Promise[Buffer] = js.native
  
  def scryptSync(password: Buffer, salt: Buffer, n: Double, p: Double, r: Double, dklen: Double): Buffer = js.native
}
