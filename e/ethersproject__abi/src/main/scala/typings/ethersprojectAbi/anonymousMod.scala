package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anonymousMod {
  
  @JSImport("@ethersproject/abi/lib/coders/anonymous", "AnonymousCoder")
  @js.native
  open class AnonymousCoder protected () extends Coder {
    def this(coder: Coder) = this()
    
    /* private */ var coder: Any = js.native
  }
}
