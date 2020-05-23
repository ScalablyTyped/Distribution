package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import typings.ethersprojectAbi.abstractCoderMod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/abi/lib/coders/tuple", JSImport.Namespace)
@js.native
object tupleMod extends js.Object {
  @js.native
  class TupleCoder protected () extends Coder {
    def this(coders: js.Array[Coder], localName: String) = this()
    val coders: js.Array[Coder] = js.native
    def encode(writer: Writer, value: js.Array[_]): Double = js.native
  }
  
}

