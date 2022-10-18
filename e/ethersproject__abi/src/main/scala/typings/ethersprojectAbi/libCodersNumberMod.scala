package typings.ethersprojectAbi

import typings.ethersprojectAbi.libCodersAbstractCoderMod.Coder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCodersNumberMod {
  
  @JSImport("@ethersproject/abi/lib/coders/number", "NumberCoder")
  @js.native
  open class NumberCoder protected () extends Coder {
    def this(size: Double, signed: Boolean, localName: String) = this()
    
    val signed: Boolean = js.native
    
    val size: Double = js.native
  }
}
