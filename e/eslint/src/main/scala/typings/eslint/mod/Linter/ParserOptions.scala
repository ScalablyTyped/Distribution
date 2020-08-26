package typings.eslint.mod.Linter

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.anon.Dictkey
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

@js.native
trait ParserOptions
  extends /* key */ StringDictionary[js.Any] {
  var ecmaFeatures: js.UndefOr[Dictkey] = js.native
  var ecmaVersion: js.UndefOr[
    `3` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020`
  ] = js.native
  var sourceType: js.UndefOr[script | module] = js.native
}

object ParserOptions {
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEcmaFeatures(value: Dictkey): Self = this.set("ecmaFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcmaFeatures: Self = this.set("ecmaFeatures", js.undefined)
    @scala.inline
    def setEcmaVersion(
      value: `3` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020`
    ): Self = this.set("ecmaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcmaVersion: Self = this.set("ecmaVersion", js.undefined)
    @scala.inline
    def setSourceType(value: script | module): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
  
}

