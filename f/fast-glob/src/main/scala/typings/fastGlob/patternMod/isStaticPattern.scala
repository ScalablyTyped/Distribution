package typings.fastGlob.patternMod

import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/utils/pattern", "isStaticPattern")
@js.native
object isStaticPattern extends js.Object {
  def apply(pattern: Pattern): Boolean = js.native
  def apply(pattern: Pattern, options: PatternTypeOptions): Boolean = js.native
}

