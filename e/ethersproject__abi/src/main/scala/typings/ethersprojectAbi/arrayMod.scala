package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import typings.ethersprojectAbi.abstractCoderMod.Reader
import typings.ethersprojectAbi.abstractCoderMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("@ethersproject/abi/lib/coders/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/abi/lib/coders/array", "ArrayCoder")
  @js.native
  class ArrayCoder protected () extends Coder {
    def this(coder: Coder, length: Double, localName: String) = this()
    
    val coder: Coder = js.native
    
    def encode(writer: Writer, value: js.Array[js.Any]): Double = js.native
    
    val length: Double = js.native
  }
  
  @scala.inline
  def pack(writer: Writer, coders: js.Array[Coder], values: js.Array[js.Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(writer.asInstanceOf[js.Any], coders.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def unpack(reader: Reader, coders: js.Array[Coder]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(reader.asInstanceOf[js.Any], coders.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
}
