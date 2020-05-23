package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/abi/lib/coders/anonymous", JSImport.Namespace)
@js.native
object anonymousMod extends js.Object {
  @js.native
  class AnonymousCoder protected () extends Coder {
    def this(coder: Coder) = this()
    var coder: js.Any = js.native
  }
  
}

