package typings.gatsbyCli

import typings.opentracing.mod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterPhantomMod {
  
  @JSImport("gatsby-cli/lib/reporter/reporter-phantom", "createPhantomReporter")
  @js.native
  def createPhantomReporter(hasTextIdSpan: ICreatePhantomReporterArguments): IPhantomReporter = js.native
  
  @js.native
  trait ICreatePhantomReporterArguments extends StObject {
    
    var id: String = js.native
    
    var span: Span = js.native
    
    var text: String = js.native
  }
  object ICreatePhantomReporterArguments {
    
    @scala.inline
    def apply(id: String, span: Span, text: String): ICreatePhantomReporterArguments = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreatePhantomReporterArguments]
    }
    
    @scala.inline
    implicit class ICreatePhantomReporterArgumentsMutableBuilder[Self <: ICreatePhantomReporterArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPhantomReporter extends StObject {
    
    def end(): Unit = js.native
    
    var span: Span = js.native
    
    def start(): Unit = js.native
  }
  object IPhantomReporter {
    
    @scala.inline
    def apply(end: () => Unit, span: Span, start: () => Unit): IPhantomReporter = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), span = span.asInstanceOf[js.Any], start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[IPhantomReporter]
    }
    
    @scala.inline
    implicit class IPhantomReporterMutableBuilder[Self <: IPhantomReporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
}
