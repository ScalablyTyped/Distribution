package typings.ethersprojectAbi

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Coder
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCodersTupleMod {
  
  @JSImport("@ethersproject/abi/lib/coders/tuple", "TupleCoder")
  @js.native
  open class TupleCoder protected () extends Coder {
    def this(coders: js.Array[Coder], localName: String) = this()
    
    val coders: js.Array[Coder] = js.native
    
    def encode(writer: Writer, value: js.Array[Any]): Double = js.native
    def encode(writer: Writer, value: StringDictionary[Any]): Double = js.native
  }
}
