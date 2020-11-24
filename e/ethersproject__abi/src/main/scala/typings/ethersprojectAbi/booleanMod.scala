package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import typings.ethersprojectAbi.abstractCoderMod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abi/lib/coders/boolean", JSImport.Namespace)
@js.native
object booleanMod extends js.Object {
  
  @js.native
  class BooleanCoder protected () extends Coder {
    def this(localName: String) = this()
    
    def encode(writer: Writer, value: Boolean): Double = js.native
  }
}
