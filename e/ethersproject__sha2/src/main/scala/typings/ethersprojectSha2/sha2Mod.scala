package typings.ethersprojectSha2

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectSha2.typesMod.SupportedAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha2Mod {
  
  @JSImport("@ethersproject/sha2/lib/sha2", "computeHmac")
  @js.native
  def computeHmac(algorithm: SupportedAlgorithm, key: BytesLike, data: BytesLike): String = js.native
  
  @JSImport("@ethersproject/sha2/lib/sha2", "ripemd160")
  @js.native
  def ripemd160(data: BytesLike): String = js.native
  
  @JSImport("@ethersproject/sha2/lib/sha2", "sha256")
  @js.native
  def sha256(data: BytesLike): String = js.native
  
  @JSImport("@ethersproject/sha2/lib/sha2", "sha512")
  @js.native
  def sha512(data: BytesLike): String = js.native
}
