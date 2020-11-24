package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import typings.ethersprojectAbi.abstractCoderMod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abi/lib/coders/address", JSImport.Namespace)
@js.native
object addressMod extends js.Object {
  
  @js.native
  class AddressCoder protected () extends Coder {
    def this(localName: String) = this()
    
    def encode(writer: Writer, value: String): Double = js.native
  }
}
