package typings.ethersprojectAbi

import typings.ethersprojectAbi.libCodersAbstractCoderMod.Coder
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCodersBooleanMod {
  
  @JSImport("@ethersproject/abi/lib/coders/boolean", "BooleanCoder")
  @js.native
  open class BooleanCoder protected () extends Coder {
    def this(localName: String) = this()
    
    def encode(writer: Writer, value: Boolean): Double = js.native
  }
}
