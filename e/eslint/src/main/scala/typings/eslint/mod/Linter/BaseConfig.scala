package typings.eslint.mod.Linter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConfig extends HasRules {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  var env: js.UndefOr[StringDictionary[Boolean]] = js.native
  var `extends`: js.UndefOr[String | js.Array[String]] = js.native
  var globals: js.UndefOr[StringDictionary[Boolean]] = js.native
  var noInlineConfig: js.UndefOr[Boolean] = js.native
  var overrides: js.UndefOr[js.Array[ConfigOverride]] = js.native
  var parser: js.UndefOr[String] = js.native
  var parserOptions: js.UndefOr[ParserOptions] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  var processor: js.UndefOr[String] = js.native
  var reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.native
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object BaseConfig {
  @scala.inline
  def apply(): BaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfig]
  }
  @scala.inline
  implicit class BaseConfigOps[Self <: BaseConfig] (val x: Self) extends AnyVal {
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
    def set$schema(value: String): Self = this.set("$schema", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$schema: Self = this.set("$schema", js.undefined)
    @scala.inline
    def setEnv(value: StringDictionary[Boolean]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setExtendsVarargs(value: String*): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: String | js.Array[String]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setGlobals(value: StringDictionary[Boolean]): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setNoInlineConfig(value: Boolean): Self = this.set("noInlineConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoInlineConfig: Self = this.set("noInlineConfig", js.undefined)
    @scala.inline
    def setOverridesVarargs(value: ConfigOverride*): Self = this.set("overrides", js.Array(value :_*))
    @scala.inline
    def setOverrides(value: js.Array[ConfigOverride]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setParser(value: String): Self = this.set("parser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setParserOptions(value: ParserOptions): Self = this.set("parserOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParserOptions: Self = this.set("parserOptions", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setProcessor(value: String): Self = this.set("processor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessor: Self = this.set("processor", js.undefined)
    @scala.inline
    def setReportUnusedDisableDirectives(value: Boolean): Self = this.set("reportUnusedDisableDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportUnusedDisableDirectives: Self = this.set("reportUnusedDisableDirectives", js.undefined)
    @scala.inline
    def setSettings(value: StringDictionary[js.Any]): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
  
}

