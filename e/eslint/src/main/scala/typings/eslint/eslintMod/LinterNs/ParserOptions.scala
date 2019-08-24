package typings.eslint.eslintMod.LinterNs

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.Anon_ExperimentalObjectRestSpread
import typings.eslint.eslintNumbers.`10`
import typings.eslint.eslintNumbers.`11`
import typings.eslint.eslintNumbers.`2015`
import typings.eslint.eslintNumbers.`2016`
import typings.eslint.eslintNumbers.`2017`
import typings.eslint.eslintNumbers.`2018`
import typings.eslint.eslintNumbers.`2019`
import typings.eslint.eslintNumbers.`2020`
import typings.eslint.eslintNumbers.`3`
import typings.eslint.eslintNumbers.`5`
import typings.eslint.eslintNumbers.`6`
import typings.eslint.eslintNumbers.`7`
import typings.eslint.eslintNumbers.`8`
import typings.eslint.eslintNumbers.`9`
import typings.eslint.eslintStrings.module
import typings.eslint.eslintStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions
  extends /* key */ StringDictionary[js.Any] {
  var ecmaFeatures: js.UndefOr[Anon_ExperimentalObjectRestSpread] = js.undefined
  var ecmaVersion: js.UndefOr[
    `3` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020`
  ] = js.undefined
  var sourceType: js.UndefOr[script | module] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    ecmaFeatures: Anon_ExperimentalObjectRestSpread = null,
    ecmaVersion: `3` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020` = null,
    sourceType: script | module = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ecmaFeatures != null) __obj.updateDynamic("ecmaFeatures")(ecmaFeatures)
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

