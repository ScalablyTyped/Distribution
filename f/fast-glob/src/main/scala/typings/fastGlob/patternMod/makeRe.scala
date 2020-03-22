package typings.fastGlob.patternMod

import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.PatternRe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/utils/pattern", "makeRe")
@js.native
object makeRe extends js.Object {
  def apply(pattern: Pattern, options: MicromatchOptions): PatternRe = js.native
}

