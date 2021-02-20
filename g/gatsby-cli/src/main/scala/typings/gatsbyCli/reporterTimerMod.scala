package typings.gatsbyCli

import typings.gatsbyCli.reporterReporterMod.Reporter_
import typings.gatsbyCli.structuredErrorsTypesMod.IStructuredError
import typings.opentracing.mod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterTimerMod {
  
  @JSImport("gatsby-cli/lib/reporter/reporter-timer", "createTimerReporter")
  @js.native
  def createTimerReporter(hasTextIdSpanReporter: ICreateTimerReporterArguments): ITimerReporter = js.native
  
  @js.native
  trait ICreateTimerReporterArguments extends StObject {
    
    var id: String = js.native
    
    var reporter: Reporter_ = js.native
    
    var span: Span = js.native
    
    var text: String = js.native
  }
  object ICreateTimerReporterArguments {
    
    @scala.inline
    def apply(id: String, reporter: Reporter_, span: Span, text: String): ICreateTimerReporterArguments = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreateTimerReporterArguments]
    }
    
    @scala.inline
    implicit class ICreateTimerReporterArgumentsMutableBuilder[Self <: ICreateTimerReporterArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReporter(value: Reporter_): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITimerReporter extends StObject {
    
    def end(): Unit = js.native
    
    def panic(arg: js.Any, otherArgs: js.Any*): Unit = js.native
    
    def panicOnBuild(arg: js.Any, otherArgs: js.Any*): IStructuredError | js.Array[IStructuredError] = js.native
    
    def setStatus(statusText: String): Unit = js.native
    
    var span: Span = js.native
    
    def start(): Unit = js.native
  }
  object ITimerReporter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ITimerReporterMutableBuilder[Self <: ITimerReporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPanic(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "panic", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPanicOnBuild(value: (js.Any, /* repeated */ js.Any) => IStructuredError | js.Array[IStructuredError]): Self = StObject.set(x, "panicOnBuild", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStatus(value: String => Unit): Self = StObject.set(x, "setStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
}
