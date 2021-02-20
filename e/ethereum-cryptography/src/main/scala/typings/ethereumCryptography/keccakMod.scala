package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keccakMod {
  
  @JSImport("ethereum-cryptography/keccak", "keccak224")
  @js.native
  def keccak224(msg: Buffer): Buffer = js.native
  
  @JSImport("ethereum-cryptography/keccak", "keccak256")
  @js.native
  def keccak256(msg: Buffer): Buffer = js.native
  
  @JSImport("ethereum-cryptography/keccak", "keccak384")
  @js.native
  def keccak384(msg: Buffer): Buffer = js.native
  
  @JSImport("ethereum-cryptography/keccak", "keccak512")
  @js.native
  def keccak512(msg: Buffer): Buffer = js.native
}
