package typings.ethersprojectSha2

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectSha2.libTypesMod.SupportedAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/sha2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/sha2", "SupportedAlgorithm")
  @js.native
  object SupportedAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethersprojectSha2.libTypesMod.SupportedAlgorithm & String] = js.native
    
    /* "sha256" */ val sha256: typings.ethersprojectSha2.libTypesMod.SupportedAlgorithm.sha256 & String = js.native
    
    /* "sha512" */ val sha512: typings.ethersprojectSha2.libTypesMod.SupportedAlgorithm.sha512 & String = js.native
  }
  
  inline def computeHmac(algorithm: SupportedAlgorithm, key: BytesLike, data: BytesLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ripemd160(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha256(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha512(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
