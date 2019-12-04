package typings.forkDashTsDashCheckerDashWebpackDashPlugin

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libResolutionMod.ResolveModuleName
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libResolutionMod.ResolveTypeReferenceDirective
import typings.std.Set
import typings.typescript.typescriptMod.BuilderProgramHost
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.Diagnostic
import typings.typescript.typescriptMod.EmitAndSemanticDiagnosticsBuilderProgram
import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.ResolvedModule
import typings.typescript.typescriptMod.ResolvedProjectReference
import typings.typescript.typescriptMod.ResolvedTypeReferenceDirective
import typings.typescript.typescriptMod.WatchCompilerHostOfConfigFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/CompilerHost", JSImport.Namespace)
@js.native
object libCompilerHostMod extends js.Object {
  @js.native
  class CompilerHost protected () extends WatchCompilerHostOfConfigFile[EmitAndSemanticDiagnosticsBuilderProgram] {
    def this(
      typescript: Typeofts,
      programConfigFile: String,
      compilerOptions: CompilerOptions,
      checkSyntacticErrors: Boolean
    ) = this()
    def this(
      typescript: Typeofts,
      programConfigFile: String,
      compilerOptions: CompilerOptions,
      checkSyntacticErrors: Boolean,
      userResolveModuleName: ResolveModuleName
    ) = this()
    def this(
      typescript: Typeofts,
      programConfigFile: String,
      compilerOptions: CompilerOptions,
      checkSyntacticErrors: Boolean,
      userResolveModuleName: ResolveModuleName,
      userResolveTypeReferenceDirective: ResolveTypeReferenceDirective
    ) = this()
    var afterCompile: js.Any = js.native
    var compilationStarted: js.Any = js.native
    @JSName("createProgram")
    var createProgram_Original_CompilerHost: Fn_ConfigFileParsingDiagnostics = js.native
    var directoryWatchers: js.Any = js.native
    var fileWatchers: js.Any = js.native
    var gatheredDiagnostic: js.Any = js.native
    var knownFiles: js.Any = js.native
    var lastProcessing: js.UndefOr[js.Promise[js.Array[Diagnostic]]] = js.native
    var onCachedDirectoryStructureHostCreate: js.UndefOr[js.Function1[/* _host */ js.Any, Unit]] = js.native
    @JSName("optionsToExtend")
    var optionsToExtend_CompilerHost: CompilerOptions = js.native
    var program: js.UndefOr[js.Any] = js.native
    @JSName("resolveModuleNames")
    var resolveModuleNames_CompilerHost: js.UndefOr[
        js.Function4[
          /* moduleNames */ js.Array[String], 
          /* containingFile */ String, 
          /* reusedNames */ js.UndefOr[js.Array[String]], 
          /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
          js.Array[js.UndefOr[ResolvedModule]]
        ]
      ] = js.native
    @JSName("resolveTypeReferenceDirectives")
    var resolveTypeReferenceDirectives_CompilerHost: js.UndefOr[
        js.Function3[
          /* typeReferenceDirectiveNames */ js.Array[String], 
          /* containingFile */ String, 
          /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
          js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
        ]
      ] = js.native
    val tsHost: js.Any = js.native
    var typescript: js.Any = js.native
    @JSName("afterProgramCreate")
    def afterProgramCreate_MCompilerHost(program: EmitAndSemanticDiagnosticsBuilderProgram): Unit = js.native
    @JSName("clearTimeout")
    def clearTimeout_MCompilerHost(timeoutId: js.Any): Unit = js.native
    def createDirectory(_path: String): Unit = js.native
    def createProgram(newProgram: Program, host: BuilderProgramHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
    def createProgram(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
    ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
    def createProgram(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
    @JSName("directoryExists")
    def directoryExists_MCompilerHost(path: String): Boolean = js.native
    def getAllKnownFiles(): Set[String] = js.native
    @JSName("getDirectories")
    def getDirectories_MCompilerHost(path: String): js.Array[String] = js.native
    @JSName("getEnvironmentVariable")
    def getEnvironmentVariable_MCompilerHost(name: String): js.UndefOr[String] = js.native
    def getProgram(): Program = js.native
    @JSName("onWatchStatusChange")
    def onWatchStatusChange_MCompilerHost(_diagnostic: Diagnostic, _newLine: String, _options: CompilerOptions): Unit = js.native
    def processChanges(): js.Promise[Anon_RemovedFiles] = js.native
    @JSName("readDirectory")
    def readDirectory_MCompilerHost(path: String): js.Array[String] = js.native
    @JSName("readDirectory")
    def readDirectory_MCompilerHost(path: String, extensions: js.Array[String]): js.Array[String] = js.native
    @JSName("readDirectory")
    def readDirectory_MCompilerHost(path: String, extensions: js.Array[String], exclude: js.Array[String]): js.Array[String] = js.native
    @JSName("readDirectory")
    def readDirectory_MCompilerHost(path: String, extensions: js.Array[String], exclude: js.Array[String], include: js.Array[String]): js.Array[String] = js.native
    @JSName("readDirectory")
    def readDirectory_MCompilerHost(
      path: String,
      extensions: js.Array[String],
      exclude: js.Array[String],
      include: js.Array[String],
      depth: Double
    ): js.Array[String] = js.native
    @JSName("realpath")
    def realpath_MCompilerHost(path: String): String = js.native
    @JSName("setTimeout")
    def setTimeout_MCompilerHost(callback: js.Function1[/* repeated */ js.Any, Unit], _ms: Double, args: js.Any*): js.Any = js.native
    @JSName("trace")
    def trace_MCompilerHost(s: String): Unit = js.native
    def writeFile(_path: String, _data: String): Unit = js.native
    def writeFile(_path: String, _data: String, _writeByteOrderMark: Boolean): Unit = js.native
  }
  
}

