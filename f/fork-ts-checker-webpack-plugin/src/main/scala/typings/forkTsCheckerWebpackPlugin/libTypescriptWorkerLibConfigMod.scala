package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libFilesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.libFilesMatchMod.FilesMatch
import typings.forkTsCheckerWebpackPlugin.libIssueIssueMod.Issue
import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibConfigMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def didConfigFileChanged(param0: FilesChange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("didConfigFileChanged")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def didDependenciesProbablyChanged(dependencies: FilesMatch, param1: FilesChange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("didDependenciesProbablyChanged")(dependencies.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def didRootFilesChanged(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("didRootFilesChanged")().asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getConfigFilePathFromBuilderProgram(builderProgram: BuilderProgram): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFilePathFromBuilderProgram")(builderProgram.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getConfigFilePathFromCompilerOptions(compilerOptions: CompilerOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFilePathFromCompilerOptions")(compilerOptions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getConfigFilePathFromProgram(program: Program): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFilePathFromProgram")(program.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getParseConfigIssues(): js.Array[Issue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParseConfigIssues")().asInstanceOf[js.Array[Issue]]
  
  inline def getParsedConfig(): ParsedCommandLine = ^.asInstanceOf[js.Dynamic].applyDynamic("getParsedConfig")().asInstanceOf[ParsedCommandLine]
  inline def getParsedConfig(force: Boolean): ParsedCommandLine = ^.asInstanceOf[js.Dynamic].applyDynamic("getParsedConfig")(force.asInstanceOf[js.Any]).asInstanceOf[ParsedCommandLine]
  
  inline def invalidateConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateConfig")().asInstanceOf[Unit]
  
  inline def parseConfig(configFileName: String, configFileContext: String): ParsedCommandLine = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFileName.asInstanceOf[js.Any], configFileContext.asInstanceOf[js.Any])).asInstanceOf[ParsedCommandLine]
  
  inline def parseNextConfig(): js.Tuple2[js.UndefOr[ParsedCommandLine], ParsedCommandLine] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNextConfig")().asInstanceOf[js.Tuple2[js.UndefOr[ParsedCommandLine], ParsedCommandLine]]
}
