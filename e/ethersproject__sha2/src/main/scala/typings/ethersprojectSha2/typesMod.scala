package typings.ethersprojectSha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait SupportedAlgorithm extends StObject
  @JSImport("@ethersproject/sha2/lib/types", "SupportedAlgorithm")
  @js.native
  object SupportedAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SupportedAlgorithm with String] = js.native
    
    @js.native
    sealed trait sha256 extends SupportedAlgorithm
    /* "sha256" */ val sha256: typings.ethersprojectSha2.typesMod.SupportedAlgorithm.sha256 with String = js.native
    
    @js.native
    sealed trait sha512 extends SupportedAlgorithm
    /* "sha512" */ val sha512: typings.ethersprojectSha2.typesMod.SupportedAlgorithm.sha512 with String = js.native
  }
}
