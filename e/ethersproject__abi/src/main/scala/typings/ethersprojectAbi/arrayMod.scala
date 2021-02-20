package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import typings.ethersprojectAbi.abstractCoderMod.Reader
import typings.ethersprojectAbi.abstractCoderMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("@ethersproject/abi/lib/coders/array", "ArrayCoder")
  @js.native
  class ArrayCoder protected () extends Coder {
    def this(coder: Coder, length: Double, localName: String) = this()
    
    val coder: Coder = js.native
    
    def encode(writer: Writer, value: js.Array[_]): Double = js.native
    
    val length: Double = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/coders/array", "pack")
  @js.native
  def pack(writer: Writer, coders: js.Array[Coder], values: js.Array[_]): Double = js.native
  
  @JSImport("@ethersproject/abi/lib/coders/array", "unpack")
  @js.native
  def unpack(reader: Reader, coders: js.Array[Coder]): js.Array[_] = js.native
}
