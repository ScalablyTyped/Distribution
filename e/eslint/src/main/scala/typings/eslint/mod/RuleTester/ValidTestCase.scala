package typings.eslint.mod.RuleTester

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.mod.Linter.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidTestCase extends js.Object {
  var code: String = js.native
  var filename: js.UndefOr[String] = js.native
  var globals: js.UndefOr[StringDictionary[Boolean]] = js.native
  var options: js.UndefOr[js.Any] = js.native
  var parser: js.UndefOr[String] = js.native
  var parserOptions: js.UndefOr[ParserOptions] = js.native
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object ValidTestCase {
  @scala.inline
  def apply(code: String): ValidTestCase = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidTestCase]
  }
  @scala.inline
  implicit class ValidTestCaseOps[Self <: ValidTestCase] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setGlobals(value: StringDictionary[Boolean]): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setParser(value: String): Self = this.set("parser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setParserOptions(value: ParserOptions): Self = this.set("parserOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParserOptions: Self = this.set("parserOptions", js.undefined)
    @scala.inline
    def setSettings(value: StringDictionary[js.Any]): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
  
}

