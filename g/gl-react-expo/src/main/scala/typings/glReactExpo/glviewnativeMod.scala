package typings.glReactExpo

import typings.glReactExpo.anon.Height
import typings.react.mod.Component
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glviewnativeMod {
  
  @JSImport("gl-react-expo/GLViewNative", "GLViewNative")
  @js.native
  class GLViewNative protected ()
    extends Component[GLViewNativeProps, js.Object, js.Any] {
    def this(props: GLViewNativeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GLViewNativeProps, context: js.Any) = this()
    
    var afterDraw: js.UndefOr[js.Function0[Unit]] = js.native
    
    def capture(opt: js.Any): js.Promise[Height] = js.native
    
    def onContextCreate(gl: WebGLRenderingContext): Unit = js.native
    
    def onRef(ref: js.Any): Unit = js.native
    
    var ref: js.UndefOr[js.Any] = js.native
  }
  
  @js.native
  trait GLViewNativeProps extends StObject {
    
    var children: js.UndefOr[js.Any] = js.native
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
  }
  object GLViewNativeProps {
    
    @scala.inline
    def apply(): GLViewNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GLViewNativeProps]
    }
    
    @scala.inline
    implicit class GLViewNativePropsMutableBuilder[Self <: GLViewNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextCreateUndefined: Self = StObject.set(x, "onContextCreate", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
