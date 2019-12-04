package typings.forkDashTsDashCheckerDashWebpackDashPlugin.libVueProgramMod

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.Typeofts
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libFilesRegisterMod.FilesRegister
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libFilesWatcherMod.FilesWatcher
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libResolutionMod.ResolveModuleName
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libResolutionMod.ResolveTypeReferenceDirective
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.ParsedCommandLine
import typings.typescript.typescriptMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/VueProgram", "VueProgram")
@js.native
class VueProgram () extends js.Object

/* static members */
@JSImport("fork-ts-checker-webpack-plugin/lib/VueProgram", "VueProgram")
@js.native
object VueProgram extends js.Object {
  var getScriptKindByLang: js.Any = js.native
  def createProgram(
    typescript: Typeofts,
    programConfig: ParsedCommandLine,
    basedir: String,
    files: FilesRegister,
    watcher: FilesWatcher,
    oldProgram: Program
  ): Program = js.native
  def createProgram(
    typescript: Typeofts,
    programConfig: ParsedCommandLine,
    basedir: String,
    files: FilesRegister,
    watcher: FilesWatcher,
    oldProgram: Program,
    userResolveModuleName: js.UndefOr[scala.Nothing],
    userResolveTypeReferenceDirective: ResolveTypeReferenceDirective
  ): Program = js.native
  def createProgram(
    typescript: Typeofts,
    programConfig: ParsedCommandLine,
    basedir: String,
    files: FilesRegister,
    watcher: FilesWatcher,
    oldProgram: Program,
    userResolveModuleName: ResolveModuleName
  ): Program = js.native
  def createProgram(
    typescript: Typeofts,
    programConfig: ParsedCommandLine,
    basedir: String,
    files: FilesRegister,
    watcher: FilesWatcher,
    oldProgram: Program,
    userResolveModuleName: ResolveModuleName,
    userResolveTypeReferenceDirective: ResolveTypeReferenceDirective
  ): Program = js.native
  def isVue(filePath: String): Boolean = js.native
  def loadProgramConfig(typescript: Typeofts, configFile: String, compilerOptions: js.Object): ParsedCommandLine = js.native
  /**
    * Search for default wildcard or wildcard from options, we only search for that in tsconfig CompilerOptions.paths.
    * The path is resolved with thie given substitution and includes the CompilerOptions.baseUrl (if given).
    * If no paths given in tsconfig, then the default substitution is '[tsconfig directory]/src'.
    * (This is a fast, simplified inspiration of what's described here: https://github.com/Microsoft/TypeScript/issues/5039)
    */
  def resolveNonTsModuleName(moduleName: String, containingFile: String, basedir: String, options: CompilerOptions): String = js.native
  def resolveScriptBlock(typescript: Typeofts, content: String): ResolvedScript = js.native
}

