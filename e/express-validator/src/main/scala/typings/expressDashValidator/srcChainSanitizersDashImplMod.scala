package typings.expressDashValidator

import typings.expressDashValidator.srcChainSanitizersMod.Sanitizers
import typings.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/sanitizers-impl", JSImport.Namespace)
@js.native
object srcChainSanitizersDashImplMod extends js.Object {
  @js.native
  class SanitizersImpl[Chain] protected () extends Sanitizers[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
    var addStandardSanitization: js.Any = js.native
    val builder: js.Any = js.native
    val chain: js.Any = js.native
  }
  
}

