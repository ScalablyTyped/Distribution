package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.typeScriptConfigurationOverwriteMod.TypeScriptConfigurationOverwrite
import typings.typescript.mod.ParseConfigFileHost
import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/TypeScriptConfigurationParser", JSImport.Namespace)
@js.native
object typeScriptConfigurationParserMod extends js.Object {
  def parseTypeScriptConfiguration(
    configFileName: String,
    configFileContext: String,
    configOverwriteJSON: TypeScriptConfigurationOverwrite,
    parseConfigFileHost: ParseConfigFileHost
  ): ParsedCommandLine = js.native
}

