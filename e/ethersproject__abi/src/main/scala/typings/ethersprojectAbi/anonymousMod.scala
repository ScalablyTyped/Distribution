package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anonymousMod {
  
  @JSImport("@ethersproject/abi/lib/coders/anonymous", "AnonymousCoder")
  @js.native
  class AnonymousCoder protected () extends Coder {
    def this(coder: Coder) = this()
    
    /* private */ var coder: js.Any = js.native
  }
}
