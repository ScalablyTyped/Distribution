package typings.forkTsCheckerWebpackPlugin.linterConfigHelpersMod

import typings.forkTsCheckerWebpackPlugin.AnonExclude
import typings.std.Map
import typings.std.Partial
import typings.tslint.configurationMod.IConfigurationFile
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.RuleSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationFile extends IConfigurationFile {
  @JSName("linterOptions")
  var linterOptions_ConfigurationFile: js.UndefOr[AnonExclude] = js.undefined
}

object ConfigurationFile {
  @scala.inline
  def apply(
    `extends`: js.Array[String],
    jsRules: Map[String, Partial[IOptions]],
    rules: Map[String, Partial[IOptions]],
    rulesDirectory: js.Array[String],
    defaultSeverity: RuleSeverity = null,
    linterOptions: AnonExclude = null
  ): ConfigurationFile = {
    val __obj = js.Dynamic.literal(jsRules = jsRules.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], rulesDirectory = rulesDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (defaultSeverity != null) __obj.updateDynamic("defaultSeverity")(defaultSeverity.asInstanceOf[js.Any])
    if (linterOptions != null) __obj.updateDynamic("linterOptions")(linterOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationFile]
  }
}

