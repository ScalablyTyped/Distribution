package typings.ethers

import org.scalablytyped.runtime.StringDictionary
import typings.ethers.typesAbiCodersAbstractCoderMod.Coder
import typings.ethers.typesAbiCodersAbstractCoderMod.Writer
import typings.ethers.typesAbiTypedMod.Typed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiCodersTupleMod {
  
  @JSImport("ethers/types/abi/coders/tuple", "TupleCoder")
  @js.native
  open class TupleCoder protected () extends Coder {
    def this(coders: js.Array[Coder], localName: String) = this()
    
    val coders: js.Array[Coder] = js.native
    
    def encode(writer: Writer, _value: js.Array[Any]): Double = js.native
    def encode(writer: Writer, _value: StringDictionary[Any]): Double = js.native
    def encode(writer: Writer, _value: Typed): Double = js.native
  }
}
