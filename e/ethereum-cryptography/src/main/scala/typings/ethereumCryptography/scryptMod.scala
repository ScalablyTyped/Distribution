package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scryptMod {
  
  @JSImport("ethereum-cryptography/scrypt", "scrypt")
  @js.native
  def scrypt(password: Buffer, salt: Buffer, n: Double, p: Double, r: Double, dklen: Double): js.Promise[Buffer] = js.native
  
  @JSImport("ethereum-cryptography/scrypt", "scryptSync")
  @js.native
  def scryptSync(password: Buffer, salt: Buffer, n: Double, p: Double, r: Double, dklen: Double): Buffer = js.native
}
