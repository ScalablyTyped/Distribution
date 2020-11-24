package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Typeofts
import typings.forkTsCheckerWebpackPlugin.controlledTypeScriptSystemMod.ControlledTypeScriptSystem
import typings.forkTsCheckerWebpackPlugin.typeScriptExtensionMod.TypeScriptHostExtension
import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CreateProgram_
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticReporter
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.SolutionBuilderWithWatchHost
import typings.typescript.mod.WatchStatusReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/ControlledWatchSolutionBuilderHost", JSImport.Namespace)
@js.native
object controlledWatchSolutionBuilderHostMod extends js.Object {
  
  def createControlledWatchSolutionBuilderHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: js.UndefOr[CreateProgram_[TProgram]],
    reportDiagnostic: js.UndefOr[DiagnosticReporter],
    reportWatchStatus: js.UndefOr[WatchStatusReporter],
    reportSolutionBuilderStatus: js.UndefOr[js.Function1[/* diagnostic */ Diagnostic, Unit]],
    afterProgramCreate: js.UndefOr[js.Function1[/* program */ TProgram, Unit]],
    afterProgramEmitAndDiagnostics: js.UndefOr[js.Function1[/* program */ TProgram, Unit]],
    hostExtensions: js.UndefOr[js.Array[TypeScriptHostExtension]]
  ): SolutionBuilderWithWatchHost[TProgram] = js.native
}
