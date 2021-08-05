package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Typeofts
import typings.forkTsCheckerWebpackPlugin.controlledTypeScriptSystemMod.ControlledTypeScriptSystem
import typings.forkTsCheckerWebpackPlugin.typeScriptExtensionMod.TypeScriptHostExtension
import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CreateProgram_
import typings.typescript.mod.DiagnosticReporter
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.WatchCompilerHostOfFilesAndCompilerOptions
import typings.typescript.mod.WatchStatusReporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlledWatchCompilerHostMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/ControlledWatchCompilerHost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](typescript: Typeofts, parsedCommandLine: ParsedCommandLine, system: ControlledTypeScriptSystem): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: Unit,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: Unit,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit],
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: Unit,
    reportWatchStatus: Unit,
    afterProgramCreate: Unit,
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit],
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: Unit,
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit],
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: Unit,
    afterProgramCreate: Unit,
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit],
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: Unit,
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: Unit,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: Unit,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit],
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: Unit,
    reportWatchStatus: Unit,
    afterProgramCreate: Unit,
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit],
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: Unit,
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit],
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: Unit,
    afterProgramCreate: Unit,
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit],
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createControlledWatchCompilerHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: Unit,
    hostExtensions: js.Array[TypeScriptHostExtension]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledWatchCompilerHost")(typescript.asInstanceOf[js.Any], parsedCommandLine.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any], hostExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
}
