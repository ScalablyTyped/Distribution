package typings.ethersprojectSha2

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/sha2/lib/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  
  @js.native
  sealed trait SupportedAlgorithm extends js.Object
  @js.native
  object SupportedAlgorithm extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SupportedAlgorithm with String] = js.native
    
    @js.native
    sealed trait sha256 extends SupportedAlgorithm
    /* "sha256" */ @js.native
    object sha256 extends TopLevel[sha256 with String]
    
    @js.native
    sealed trait sha512 extends SupportedAlgorithm
    /* "sha512" */ @js.native
    object sha512 extends TopLevel[sha512 with String]
  }
}
