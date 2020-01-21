package typings.expressValidator

import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.sanitizersMod.Sanitizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/sanitizers-impl", JSImport.Namespace)
@js.native
object sanitizersImplMod extends js.Object {
  @js.native
  class SanitizersImpl[Chain] protected () extends Sanitizers[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
    var addStandardSanitization: js.Any = js.native
    val builder: js.Any = js.native
    val chain: js.Any = js.native
  }
  
}

