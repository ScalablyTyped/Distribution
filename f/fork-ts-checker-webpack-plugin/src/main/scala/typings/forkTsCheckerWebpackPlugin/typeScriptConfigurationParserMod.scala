package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Typeofts
import typings.forkTsCheckerWebpackPlugin.dependenciesMod.Dependencies
import typings.forkTsCheckerWebpackPlugin.typeScriptConfigurationOverwriteMod.TypeScriptConfigurationOverwrite
import typings.typescript.mod.ParseConfigFileHost
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptConfigurationParserMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/TypeScriptConfigurationParser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependenciesFromTypeScriptConfiguration(
    typescript: Typeofts,
    parsedConfiguration: ParsedCommandLine,
    configFileContext: String,
    parseConfigFileHost: ParseConfigFileHost
  ): Dependencies = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependenciesFromTypeScriptConfiguration")(typescript.asInstanceOf[js.Any], parsedConfiguration.asInstanceOf[js.Any], configFileContext.asInstanceOf[js.Any], parseConfigFileHost.asInstanceOf[js.Any])).asInstanceOf[Dependencies]
  inline def getDependenciesFromTypeScriptConfiguration(
    typescript: Typeofts,
    parsedConfiguration: ParsedCommandLine,
    configFileContext: String,
    parseConfigFileHost: ParseConfigFileHost,
    processedConfigFiles: js.Array[String]
  ): Dependencies = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependenciesFromTypeScriptConfiguration")(typescript.asInstanceOf[js.Any], parsedConfiguration.asInstanceOf[js.Any], configFileContext.asInstanceOf[js.Any], parseConfigFileHost.asInstanceOf[js.Any], processedConfigFiles.asInstanceOf[js.Any])).asInstanceOf[Dependencies]
  
  inline def parseTypeScriptConfiguration(
    typescript: Typeofts,
    configFileName: String,
    configFileContext: String,
    configOverwriteJSON: TypeScriptConfigurationOverwrite,
    parseConfigFileHost: ParseConfigFileHost
  ): ParsedCommandLine = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeScriptConfiguration")(typescript.asInstanceOf[js.Any], configFileName.asInstanceOf[js.Any], configFileContext.asInstanceOf[js.Any], configOverwriteJSON.asInstanceOf[js.Any], parseConfigFileHost.asInstanceOf[js.Any])).asInstanceOf[ParsedCommandLine]
}
