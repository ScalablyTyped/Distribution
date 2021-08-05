package typings.gatsbyCli

import typings.gatsbyCli.reporterReporterMod.Reporter_
import typings.gatsbyCli.structuredErrorsTypesMod.IStructuredError
import typings.opentracing.mod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterTimerMod {
  
  @JSImport("gatsby-cli/lib/reporter/reporter-timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTimerReporter(hasTextIdSpanReporter: ICreateTimerReporterArguments): ITimerReporter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTimerReporter")(hasTextIdSpanReporter.asInstanceOf[js.Any]).asInstanceOf[ITimerReporter]
  
  trait ICreateTimerReporterArguments extends StObject {
    
    var id: String
    
    var reporter: Reporter_
    
    var span: Span
    
    var text: String
  }
  object ICreateTimerReporterArguments {
    
    inline def apply(id: String, reporter: Reporter_, span: Span, text: String): ICreateTimerReporterArguments = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreateTimerReporterArguments]
    }
    
    extension [Self <: ICreateTimerReporterArguments](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setReporter(value: Reporter_): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimerReporter extends StObject {
    
    def end(): Unit
    
    def panic(arg: js.Any, otherArgs: js.Any*): Unit
    
    def panicOnBuild(arg: js.Any, otherArgs: js.Any*): IStructuredError | js.Array[IStructuredError]
    
    def setStatus(statusText: String): Unit
    
    var span: Span
    
    def start(): Unit
  }
  object ITimerReporter {
    
    inline def apply(
      end: () => Unit,
      panic: (js.Any, /* repeated */ js.Any) => Unit,
      panicOnBuild: (js.Any, /* repeated */ js.Any) => IStructuredError | js.Array[IStructuredError],
      setStatus: String => Unit,
      span: Span,
      start: () => Unit
    ): ITimerReporter = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), panic = js.Any.fromFunction2(panic), panicOnBuild = js.Any.fromFunction2(panicOnBuild), setStatus = js.Any.fromFunction1(setStatus), span = span.asInstanceOf[js.Any], start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[ITimerReporter]
    }
    
    extension [Self <: ITimerReporter](x: Self) {
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setPanic(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "panic", js.Any.fromFunction2(value))
      
      inline def setPanicOnBuild(value: (js.Any, /* repeated */ js.Any) => IStructuredError | js.Array[IStructuredError]): Self = StObject.set(x, "panicOnBuild", js.Any.fromFunction2(value))
      
      inline def setSetStatus(value: String => Unit): Self = StObject.set(x, "setStatus", js.Any.fromFunction1(value))
      
      inline def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
}
