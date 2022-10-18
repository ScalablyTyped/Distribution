package typings.forkTsCheckerWebpackPlugin

import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CreateProgram_
import typings.typescript.mod.DiagnosticReporter
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.WatchCompilerHostOfFilesAndCompilerOptions
import typings.typescript.mod.WatchStatusReporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWorkerLibHostWatchCompilerHostMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/worker/lib/host/watch-compiler-host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](parsedConfig: ParsedCommandLine): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any]).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: Unit,
    reportDiagnostic: Unit,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: Unit,
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: Unit,
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](parsedConfig: ParsedCommandLine, createProgram: Unit, reportDiagnostic: DiagnosticReporter): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: Unit,
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](parsedConfig: ParsedCommandLine, createProgram: CreateProgram_[TProgram]): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: Unit,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: Unit,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: Unit,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
  inline def createWatchCompilerHost[TProgram /* <: BuilderProgram */](
    parsedConfig: ParsedCommandLine,
    createProgram: CreateProgram_[TProgram],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    afterProgramCreate: js.Function1[/* program */ TProgram, Unit]
  ): WatchCompilerHostOfFilesAndCompilerOptions[TProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(parsedConfig.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], afterProgramCreate.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[TProgram]]
}
