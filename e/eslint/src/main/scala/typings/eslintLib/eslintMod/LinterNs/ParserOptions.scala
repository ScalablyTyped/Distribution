package typings
package eslintLib.eslintMod.LinterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var ecmaFeatures: js.UndefOr[eslintLib.Anon_ExperimentalObjectRestSpread] = js.undefined
  var ecmaVersion: js.UndefOr[
    eslintLib.eslintLibNumbers.`3` | eslintLib.eslintLibNumbers.`5` | eslintLib.eslintLibNumbers.`6` | eslintLib.eslintLibNumbers.`7` | eslintLib.eslintLibNumbers.`8` | eslintLib.eslintLibNumbers.`9` | eslintLib.eslintLibNumbers.`2015` | eslintLib.eslintLibNumbers.`2016` | eslintLib.eslintLibNumbers.`2017` | eslintLib.eslintLibNumbers.`2018`
  ] = js.undefined
  var sourceType: js.UndefOr[eslintLib.eslintLibStrings.script | eslintLib.eslintLibStrings.module] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ecmaFeatures: eslintLib.Anon_ExperimentalObjectRestSpread = null,
    ecmaVersion: eslintLib.eslintLibNumbers.`3` | eslintLib.eslintLibNumbers.`5` | eslintLib.eslintLibNumbers.`6` | eslintLib.eslintLibNumbers.`7` | eslintLib.eslintLibNumbers.`8` | eslintLib.eslintLibNumbers.`9` | eslintLib.eslintLibNumbers.`2015` | eslintLib.eslintLibNumbers.`2016` | eslintLib.eslintLibNumbers.`2017` | eslintLib.eslintLibNumbers.`2018` = null,
    sourceType: eslintLib.eslintLibStrings.script | eslintLib.eslintLibStrings.module = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ecmaFeatures != null) __obj.updateDynamic("ecmaFeatures")(ecmaFeatures)
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

