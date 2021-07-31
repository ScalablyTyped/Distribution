package typings.gatsbyCli

import typings.gatsbyCli.reporterReporterMod.Reporter_
import typings.gatsbyCli.structuredErrorsTypesMod.IStructuredError
import typings.opentracing.mod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterProgressMod {
  
  @JSImport("gatsby-cli/lib/reporter/reporter-progress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createProgressReporter(hasIdTextStartTotalSpanReporter: ICreateProgressReporterArguments): IProgressReporter = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgressReporter")(hasIdTextStartTotalSpanReporter.asInstanceOf[js.Any]).asInstanceOf[IProgressReporter]
  
  trait ICreateProgressReporterArguments extends StObject {
    
    var id: String
    
    var reporter: Reporter_
    
    var span: Span
    
    var start: Double
    
    var text: String
    
    var total: Double
  }
  object ICreateProgressReporterArguments {
    
    @scala.inline
    def apply(id: String, reporter: Reporter_, span: Span, start: Double, text: String, total: Double): ICreateProgressReporterArguments = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreateProgressReporterArguments]
    }
    
    @scala.inline
    implicit class ICreateProgressReporterArgumentsMutableBuilder[Self <: ICreateProgressReporterArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReporter(value: Reporter_): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProgressReporter extends StObject {
    
    def done(): Unit = js.native
    
    def end(): Unit = js.native
    
    def panic(arg: js.Any, otherArgs: js.Any*): Unit = js.native
    
    def panicOnBuild(arg: js.Any, otherArgs: js.Any*): IStructuredError | js.Array[IStructuredError] = js.native
    
    def setStatus(statusText: String): Unit = js.native
    
    var span: Span = js.native
    
    def start(): Unit = js.native
    
    def tick(): Unit = js.native
    def tick(increment: Double): Unit = js.native
    
    var total: Double = js.native
  }
}
