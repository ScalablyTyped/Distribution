package typings.fastGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/matchers/partial", JSImport.Namespace)
@js.native
object partialMod extends js.Object {
  @js.native
  trait PartialMatcher
    extends typings.fastGlob.matcherMod.default {
    def `match`(filepath: String): Boolean = js.native
  }
  
  @js.native
  class default () extends PartialMatcher
  
}

