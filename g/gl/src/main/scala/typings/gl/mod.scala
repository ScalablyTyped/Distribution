package typings.gl

import typings.gl.glStrings.STACKGL_destroy_context
import typings.gl.glStrings.STACKGL_resize_drawingbuffer
import typings.std.GLint
import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(width: Double, height: Double): WebGLRenderingContext & StackGLExtension = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[WebGLRenderingContext & StackGLExtension]
  @scala.inline
  def apply(width: Double, height: Double, options: WebGLContextAttributes): WebGLRenderingContext & StackGLExtension = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebGLRenderingContext & StackGLExtension]
  
  @JSImport("gl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait STACKGLDestroyContext extends StObject {
    
    def destroy(): Unit
  }
  object STACKGLDestroyContext {
    
    @scala.inline
    def apply(destroy: () => Unit): STACKGLDestroyContext = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[STACKGLDestroyContext]
    }
    
    @scala.inline
    implicit class STACKGLDestroyContextMutableBuilder[Self <: STACKGLDestroyContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
  
  trait STACKGLResizeDrawingbuffer extends StObject {
    
    def resize(width: GLint, height: GLint): Unit
  }
  object STACKGLResizeDrawingbuffer {
    
    @scala.inline
    def apply(resize: (GLint, GLint) => Unit): STACKGLResizeDrawingbuffer = {
      val __obj = js.Dynamic.literal(resize = js.Any.fromFunction2(resize))
      __obj.asInstanceOf[STACKGLResizeDrawingbuffer]
    }
    
    @scala.inline
    implicit class STACKGLResizeDrawingbufferMutableBuilder[Self <: STACKGLResizeDrawingbuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResize(value: (GLint, GLint) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
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
