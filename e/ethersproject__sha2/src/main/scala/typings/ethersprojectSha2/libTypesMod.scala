package typings.ethersprojectSha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @js.native
  sealed trait SupportedAlgorithm extends StObject
  @JSImport("@ethersproject/sha2/lib/types", "SupportedAlgorithm")
  @js.native
  object SupportedAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SupportedAlgorithm & String] = js.native
    
    @js.native
    sealed trait sha256
      extends StObject
         with SupportedAlgorithm
    /* "sha256" */ val sha256: typings.ethersprojectSha2.libTypesMod.SupportedAlgorithm.sha256 & String = js.native
    
    @js.native
    sealed trait sha512
      extends StObject
         with SupportedAlgorithm
    /* "sha512" */ val sha512: typings.ethersprojectSha2.libTypesMod.SupportedAlgorithm.sha512 & String = js.native
  }
}
