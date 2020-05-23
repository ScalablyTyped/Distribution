package typings.ethersprojectAbi

import typings.ethersprojectAbi.bytesMod.DynamicBytesCoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/abi/lib/coders/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  @js.native
  class StringCoder protected () extends DynamicBytesCoder {
    def this(localName: String) = this()
  }
  
}

