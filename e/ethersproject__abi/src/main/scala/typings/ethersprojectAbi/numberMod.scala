package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import typings.ethersprojectAbi.abstractCoderMod.Writer
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/abi/lib/coders/number", JSImport.Namespace)
@js.native
object numberMod extends js.Object {
  @js.native
  class NumberCoder protected () extends Coder {
    def this(size: Double, signed: Boolean, localName: String) = this()
    val signed: Boolean = js.native
    val size: Double = js.native
    def encode(writer: Writer, value: BigNumberish): Double = js.native
  }
  
}

