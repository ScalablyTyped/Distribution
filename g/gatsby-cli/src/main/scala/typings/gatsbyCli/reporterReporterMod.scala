package typings.gatsbyCli

import org.scalablytyped.runtime.StringDictionary
import typings.commonTags.mod.TemplateTag
import typings.gatsbyCli.anon.BackgroundColor
import typings.gatsbyCli.anon.Id
import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.diagnosticsMod.AdditionalDiagnosticsOutputHandler
import typings.gatsbyCli.errorMapMod.ErrorId
import typings.gatsbyCli.errorMapMod.IErrorMapEntry
import typings.gatsbyCli.reporterPhantomMod.IPhantomReporter
import typings.gatsbyCli.reporterProgressMod.IProgressReporter
import typings.gatsbyCli.reporterTimerMod.ITimerReporter
import typings.gatsbyCli.reporterTypesMod.CreateLogAction
import typings.gatsbyCli.reporterTypesMod.ErrorMeta
import typings.gatsbyCli.reporterTypesMod.ILogIntent
import typings.gatsbyCli.reporterTypesMod.IRenderPageArgs
import typings.gatsbyCli.structuredErrorsTypesMod.IStructuredError
import typings.gatsbyCli.typesMod.IPendingActivity
import typings.gatsbyCli.typesMod.ISetStatus
import typings.opentracing.mod.Span
import typings.opentracing.mod.SpanContext
import typings.redux.mod.Dispatch
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterReporterMod {
  
  /**
    * Reporter module.
    * @module reporter
    */
  @JSImport("gatsby-cli/lib/reporter/reporter", "Reporter")
  @js.native
  open class Reporter_ () extends StObject {
    
    def _initReporterMessagingInMain(onMessage: js.Function1[/* listener */ js.Function1[/* msg */ ILogIntent | Any, Unit], Unit]): Unit = js.native
    
    def _initReporterMessagingInWorker(sendMessage: js.Function1[/* msg */ ILogIntent, Unit]): Unit = js.native
    
    def _registerAdditionalDiagnosticOutputHandler(handler: AdditionalDiagnosticsOutputHandler): Unit = js.native
    
    def _renderPageTree(args: IRenderPageArgs): Unit = js.native
    
    def _setStage(): Unit = js.native
    
    /**
      * Time an activity.
      */
    def activityTimer(text: String): ITimerReporter = js.native
    def activityTimer(text: String, activityArgs: IActivityArgs): ITimerReporter = js.native
    
    def completeActivity(id: String): Unit = js.native
    def completeActivity(id: String, status: ActivityStatuses): Unit = js.native
    
    /**
      * Create a progress bar for an activity
      */
    def createProgress(text: String): IProgressReporter = js.native
    def createProgress(text: String, total: Double): IProgressReporter = js.native
    def createProgress(text: String, total: Double, start: Double): IProgressReporter = js.native
    def createProgress(text: String, total: Double, start: Double, activityArgs: IActivityArgs): IProgressReporter = js.native
    def createProgress(text: String, total: Double, start: Unit, activityArgs: IActivityArgs): IProgressReporter = js.native
    def createProgress(text: String, total: Unit, start: Double): IProgressReporter = js.native
    def createProgress(text: String, total: Unit, start: Double, activityArgs: IActivityArgs): IProgressReporter = js.native
    def createProgress(text: String, total: Unit, start: Unit, activityArgs: IActivityArgs): IProgressReporter = js.native
    
    def error(errorMeta: js.Array[ErrorMeta]): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: js.Array[ErrorMeta], error: js.Array[js.Error]): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: js.Array[ErrorMeta], error: js.Array[js.Error], pluginName: String): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: js.Array[ErrorMeta], error: js.Error): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: js.Array[ErrorMeta], error: js.Error, pluginName: String): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: js.Array[ErrorMeta], error: Unit, pluginName: String): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: ErrorMeta): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: ErrorMeta, error: js.Array[js.Error]): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: ErrorMeta, error: js.Array[js.Error], pluginName: String): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: ErrorMeta, error: js.Error): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: ErrorMeta, error: js.Error, pluginName: String): IStructuredError | js.Array[IStructuredError] = js.native
    def error(errorMeta: ErrorMeta, error: Unit, pluginName: String): IStructuredError | js.Array[IStructuredError] = js.native
    
    var errorMap: Record[ErrorId, IErrorMapEntry] = js.native
    
    var format: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any) & BackgroundColor = js.native
    
    def info(): CreateLogAction = js.native
    def info(text: String): CreateLogAction = js.native
    
    def log(): CreateLogAction = js.native
    def log(text: String): CreateLogAction = js.native
    
    /**
      * Log arguments and exit process with status 1.
      */
    def panic(errorMeta: ErrorMeta): scala.Nothing = js.native
    def panic(errorMeta: ErrorMeta, error: js.Array[js.Error]): scala.Nothing = js.native
    def panic(errorMeta: ErrorMeta, error: js.Array[js.Error], pluginName: String): scala.Nothing = js.native
    def panic(errorMeta: ErrorMeta, error: js.Error): scala.Nothing = js.native
    def panic(errorMeta: ErrorMeta, error: js.Error, pluginName: String): scala.Nothing = js.native
    def panic(errorMeta: ErrorMeta, error: Unit, pluginName: String): scala.Nothing = js.native
    
    def panicOnBuild(errorMeta: ErrorMeta): IStructuredError | js.Array[IStructuredError] = js.native
    def panicOnBuild(errorMeta: ErrorMeta, error: js.Array[js.Error]): IStructuredError | js.Array[IStructuredError] = js.native
    def panicOnBuild(errorMeta: ErrorMeta, error: js.Array[js.Error], pluginName: String): IStructuredError | js.Array[IStructuredError] = js.native
    def panicOnBuild(errorMeta: ErrorMeta, error: js.Error): IStructuredError | js.Array[IStructuredError] = js.native
    def panicOnBuild(errorMeta: ErrorMeta, error: js.Error, pluginName: String): IStructuredError | js.Array[IStructuredError] = js.native
    def panicOnBuild(errorMeta: ErrorMeta, error: Unit, pluginName: String): IStructuredError | js.Array[IStructuredError] = js.native
    
    def pendingActivity(hasIdStatus: Id): js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IPendingActivity] = js.native
    
    /**
      * Create an Activity that is not visible to the user
      *
      * During the lifecycle of the Gatsby process, sometimes we need to do some
      * async work and wait for it to complete. A typical example of this is a job.
      * This work should set the status of the process to `in progress` while running and
      * `complete` (or `failure`) when complete. Activities do just this! However, they
      * are visible to the user. So this function can be used to create a _hidden_ activity
      * that while not displayed in the CLI, still triggers a change in process status.
      */
    def phantomActivity(text: String): IPhantomReporter = js.native
    def phantomActivity(text: String, activityArgs: IActivityArgs): IPhantomReporter = js.native
    
    /**
      * Set a custom error map to the reporter. This allows
      * the reporter to extend the internal error map
      *
      * Please note: The entered IDs ideally should be different from the ones we internally use:
      * https://github.com/gatsbyjs/gatsby/blob/master/packages/gatsby-cli/src/structured-errors/error-map.ts
      */
    def setErrorMap(entry: Record[String, IErrorMapEntry]): Unit = js.native
    
    /**
      * Turn off colors in error output.
      */
    def setNoColor(): Unit = js.native
    def setNoColor(isNoColor: Boolean): Unit = js.native
    
    /**
      * Toggle verbosity.
      */
    def setVerbose(): Unit = js.native
    def setVerbose(_isVerbose: Boolean): Unit = js.native
    
    /**
      * Strip initial indentation template function.
      */
    var stripIndent: TemplateTag = js.native
    
    def success(): CreateLogAction = js.native
    def success(text: String): CreateLogAction = js.native
    
    /**
      * Set prefix on uptime.
      */
    def uptime(prefix: String): Unit = js.native
    
    def verbose(text: String): Unit = js.native
    
    def warn(): CreateLogAction = js.native
    def warn(text: String): CreateLogAction = js.native
  }
  
  @JSImport("gatsby-cli/lib/reporter/reporter", "reporter")
  @js.native
  val reporter: Reporter_ = js.native
  
  trait IActivityArgs extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var parentSpan: js.UndefOr[Span | SpanContext] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object IActivityArgs {
    
    inline def apply(): IActivityArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActivityArgs]
    }
    
    extension [Self <: IActivityArgs](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setParentSpan(value: Span | SpanContext): Self = StObject.set(x, "parentSpan", value.asInstanceOf[js.Any])
      
      inline def setParentSpanUndefined: Self = StObject.set(x, "parentSpan", js.undefined)
      
      inline def setTags(value: StringDictionary[Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
