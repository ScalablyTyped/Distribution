package typings.glimmerInterfaces

import typings.glimmerInterfaces.anon.AlwaysRevalidate
import typings.glimmerInterfaces.distTypesLibCoreMod.RichIteratorResult
import typings.glimmerInterfaces.distTypesLibDomBoundsMod.Bounds
import typings.glimmerInterfaces.distTypesLibRuntimeEnvironmentMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibRuntimeRenderMod {
  
  trait ExceptionHandler extends StObject {
    
    def handleException(): Unit
  }
  object ExceptionHandler {
    
    inline def apply(handleException: () => Unit): ExceptionHandler = {
      val __obj = js.Dynamic.literal(handleException = js.Any.fromFunction0(handleException))
      __obj.asInstanceOf[ExceptionHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionHandler] (val x: Self) extends AnyVal {
      
      inline def setHandleException(value: () => Unit): Self = StObject.set(x, "handleException", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait RenderResult
    extends StObject
       with Bounds
       with ExceptionHandler {
    
    val drop: js.Object = js.native
    
    val env: Environment = js.native
    
    def rerender(): Unit = js.native
    def rerender(options: AlwaysRevalidate): Unit = js.native
  }
  
  trait TemplateIterator extends StObject {
    
    def next(): RichIteratorResult[Null, RenderResult]
    
    def sync(): RenderResult
  }
  object TemplateIterator {
    
    inline def apply(next: () => RichIteratorResult[Null, RenderResult], sync: () => RenderResult): TemplateIterator = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), sync = js.Any.fromFunction0(sync))
      __obj.asInstanceOf[TemplateIterator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateIterator] (val x: Self) extends AnyVal {
      
      inline def setNext(value: () => RichIteratorResult[Null, RenderResult]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setSync(value: () => RenderResult): Self = StObject.set(x, "sync", js.Any.fromFunction0(value))
    }
  }
}
