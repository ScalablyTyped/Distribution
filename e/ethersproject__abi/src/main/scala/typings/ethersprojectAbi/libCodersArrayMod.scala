package typings.ethersprojectAbi

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Coder
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Reader
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Result
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCodersArrayMod {
  
  @JSImport("@ethersproject/abi/lib/coders/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/abi/lib/coders/array", "ArrayCoder")
  @js.native
  open class ArrayCoder protected () extends Coder {
    def this(coder: Coder, length: Double, localName: String) = this()
    
    val coder: Coder = js.native
    
    def encode(writer: Writer, value: js.Array[Any]): Double = js.native
    
    val length: Double = js.native
  }
  
  inline def pack(writer: Writer, coders: js.Array[Coder], values: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(writer.asInstanceOf[js.Any], coders.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def pack(writer: Writer, coders: js.Array[Coder], values: StringDictionary[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(writer.asInstanceOf[js.Any], coders.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def unpack(reader: Reader, coders: js.Array[Coder]): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(reader.asInstanceOf[js.Any], coders.asInstanceOf[js.Any])).asInstanceOf[Result]
}
