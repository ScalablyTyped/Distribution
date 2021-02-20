package typings.ethersprojectSha2

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectSha2.typesMod.SupportedAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/sha2", "SupportedAlgorithm")
  @js.native
  object SupportedAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethersprojectSha2.typesMod.SupportedAlgorithm with String] = js.native
    
    /* "sha256" */ val sha256: typings.ethersprojectSha2.typesMod.SupportedAlgorithm.sha256 with String = js.native
    
    /* "sha512" */ val sha512: typings.ethersprojectSha2.typesMod.SupportedAlgorithm.sha512 with String = js.native
  }
  
  @JSImport("@ethersproject/sha2", "computeHmac")
  @js.native
  def computeHmac(algorithm: SupportedAlgorithm, key: BytesLike, data: BytesLike): String = js.native
  
  @JSImport("@ethersproject/sha2", "ripemd160")
  @js.native
  def ripemd160(data: BytesLike): String = js.native
  
  @JSImport("@ethersproject/sha2", "sha256")
  @js.native
  def sha256(data: BytesLike): String = js.native
  
  @JSImport("@ethersproject/sha2", "sha512")
  @js.native
  def sha512(data: BytesLike): String = js.native
}
