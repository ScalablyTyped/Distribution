package typings.fastGlob.patternMod

import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.PatternRe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-glob/out/utils/pattern", "convertPatternsToRe")
@js.native
object convertPatternsToRe extends js.Object {
  
  def apply(patterns: js.Array[Pattern], options: MicromatchOptions): js.Array[PatternRe] = js.native
}
