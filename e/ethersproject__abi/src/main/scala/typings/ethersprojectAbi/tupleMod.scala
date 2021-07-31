package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import typings.ethersprojectAbi.abstractCoderMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tupleMod {
  
  @JSImport("@ethersproject/abi/lib/coders/tuple", "TupleCoder")
  @js.native
  class TupleCoder protected () extends Coder {
    def this(coders: js.Array[Coder], localName: String) = this()
    
    val coders: js.Array[Coder] = js.native
    
    def encode(writer: Writer, value: js.Array[js.Any]): Double = js.native
  }
}
