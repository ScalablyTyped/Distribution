package typings.gatsbyCli

import typings.opentracing.mod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterPhantomMod {
  
  @JSImport("gatsby-cli/lib/reporter/reporter-phantom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPhantomReporter(hasTextIdSpan: ICreatePhantomReporterArguments): IPhantomReporter = ^.asInstanceOf[js.Dynamic].applyDynamic("createPhantomReporter")(hasTextIdSpan.asInstanceOf[js.Any]).asInstanceOf[IPhantomReporter]
  
  trait ICreatePhantomReporterArguments extends StObject {
    
    var id: String
    
    var span: Span
    
    var text: String
  }
  object ICreatePhantomReporterArguments {
    
    inline def apply(id: String, span: Span, text: String): ICreatePhantomReporterArguments = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreatePhantomReporterArguments]
    }
    
    extension [Self <: ICreatePhantomReporterArguments](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPhantomReporter extends StObject {
    
    def end(): Unit
    
    var span: Span
    
    def start(): Unit
  }
  object IPhantomReporter {
    
    inline def apply(end: () => Unit, span: Span, start: () => Unit): IPhantomReporter = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), span = span.asInstanceOf[js.Any], start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[IPhantomReporter]
    }
    
    extension [Self <: IPhantomReporter](x: Self) {
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
}
