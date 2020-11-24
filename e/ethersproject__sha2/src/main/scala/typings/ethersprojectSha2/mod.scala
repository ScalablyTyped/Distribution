package typings.ethersprojectSha2

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectSha2.typesMod.SupportedAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/sha2", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def computeHmac(algorithm: SupportedAlgorithm, key: BytesLike, data: BytesLike): String = js.native
  
  def ripemd160(data: BytesLike): String = js.native
  
  def sha256(data: BytesLike): String = js.native
  
  def sha512(data: BytesLike): String = js.native
  
  @js.native
  object SupportedAlgorithm extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethersprojectSha2.typesMod.SupportedAlgorithm with String] = js.native
    
    /* "sha256" */ val sha256: typings.ethersprojectSha2.typesMod.SupportedAlgorithm.sha256 with String = js.native
    
    /* "sha512" */ val sha512: typings.ethersprojectSha2.typesMod.SupportedAlgorithm.sha512 with String = js.native
  }
}
