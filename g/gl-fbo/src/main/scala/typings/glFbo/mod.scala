package typings.glFbo

import typings.glFbo.anon.FnCall
import typings.std.ReturnType
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-fbo", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, shape: js.Tuple2[Double, Double]): FrameBuffer = js.native
  @JSImport("gl-fbo", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, shape: js.Tuple2[Double, Double], options: FrameBufferOptions): FrameBuffer = js.native
  
  @js.native
  trait FrameBuffer extends StObject {
    
    def bind(): Unit = js.native
    
    var color: js.Array[Texture] = js.native
    
    var depth: Texture | Null = js.native
    
    def dispose(): Unit = js.native
    
    var gl: WebGLRenderingContext = js.native
    
    var handle: WebGLFramebuffer = js.native
    
    var shape: js.Tuple2[Double, Double] = js.native
  }
  object FrameBuffer {
    
    @scala.inline
    def apply(
      bind: () => Unit,
      color: js.Array[Texture],
      dispose: () => Unit,
      gl: WebGLRenderingContext,
      handle: WebGLFramebuffer,
      shape: js.Tuple2[Double, Double]
    ): FrameBuffer = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gl = gl.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameBuffer]
    }
    
    @scala.inline
    implicit class FrameBufferMutableBuilder[Self <: FrameBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: () => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction0(value))
      
      @scala.inline
      def setColor(value: js.Array[Texture]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorVarargs(value: Texture*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setDepth(value: Texture): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthNull: Self = StObject.set(x, "depth", null)
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandle(value: WebGLFramebuffer): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FrameBufferOptions extends StObject {
    
    var color: js.UndefOr[Double] = js.native
    
    var depth: js.UndefOr[Boolean] = js.native
    
    var float: js.UndefOr[Boolean] = js.native
    
    var preferFloat: js.UndefOr[Boolean] = js.native
    
    var stencil: js.UndefOr[Boolean] = js.native
  }
  object FrameBufferOptions {
    
    @scala.inline
    def apply(): FrameBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameBufferOptions]
    }
    
    @scala.inline
    implicit class FrameBufferOptionsMutableBuilder[Self <: FrameBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setPreferFloat(value: Boolean): Self = StObject.set(x, "preferFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferFloatUndefined: Self = StObject.set(x, "preferFloat", js.undefined)
      
      @scala.inline
      def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    }
  }
  
  type Texture = ReturnType[FnCall]
}
