package typings.fastGlob.matcherMod

import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/matchers/matcher", JSImport.Default)
@js.native
abstract class default protected () extends Matcher {
  def this(
    _patterns: js.Array[Pattern],
    _settings: typings.fastGlob.settingsMod.default,
    _micromatchOptions: MicromatchOptions
  ) = this()
}

