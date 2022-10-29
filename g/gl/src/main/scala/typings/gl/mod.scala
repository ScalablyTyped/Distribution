package typings.gl

import typings.gl.glStrings.STACKGL_destroy_context
import typings.gl.glStrings.STACKGL_resize_drawingbuffer
import typings.std.GLint
import typings.std.WebGLContextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(width: Double, height: Double): typings.gl.mod.WebGLRenderingContext = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.gl.mod.WebGLRenderingContext]
  inline def apply(width: Double, height: Double, options: WebGLContextAttributes): typings.gl.mod.WebGLRenderingContext = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.gl.mod.WebGLRenderingContext]
  
  @JSImport("gl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.WebGLRenderingContext * / any */ @js.native
  trait WebGLRenderingContext
    extends StObject
       with StackGLExtension
  @JSImport("gl", "WebGLRenderingContext")
  @js.native
  val WebGLRenderingContext: typings.gl.mod.WebGLRenderingContext = js.native
  
  trait STACKGLDestroyContext extends StObject {
    
    def destroy(): Unit
  }
  object STACKGLDestroyContext {
    
    inline def apply(destroy: () => Unit): STACKGLDestroyContext = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[STACKGLDestroyContext]
    }
    
    extension [Self <: STACKGLDestroyContext](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
  
  trait STACKGLResizeDrawingbuffer extends StObject {
    
    def resize(width: GLint, height: GLint): Unit
  }
  object STACKGLResizeDrawingbuffer {
    
    inline def apply(resize: (GLint, GLint) => Unit): STACKGLResizeDrawingbuffer = {
      val __obj = js.Dynamic.literal(resize = js.Any.fromFunction2(resize))
      __obj.asInstanceOf[STACKGLResizeDrawingbuffer]
    }
    
    extension [Self <: STACKGLResizeDrawingbuffer](x: Self) {
      
      inline def setResize(value: (GLint, GLint) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait StackGLExtension extends StObject {
    
    @JSName("getExtension")
    def getExtension_STACKGLdestroycontext(extensionName: STACKGL_destroy_context): STACKGLDestroyContext | Null = js.native
    @JSName("getExtension")
    def getExtension_STACKGLresizedrawingbuffer(extensionName: STACKGL_resize_drawingbuffer): STACKGLResizeDrawingbuffer | Null = js.native
  }
}
