package typings.glReactNative

import typings.react.mod.Component
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glviewnativeMod {
  
  @JSImport("gl-react-native/GLViewNative", "GLViewNative")
  @js.native
  open class GLViewNative protected ()
    extends Component[GLViewNativeProps, js.Object, Any] {
    def this(props: GLViewNativeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GLViewNativeProps, context: Any) = this()
    
    var afterDraw: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  trait GLViewNativeProps extends StObject {
    
    var children: js.UndefOr[Any] = js.undefined
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
    
    var onContextFailure: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object GLViewNativeProps {
    
    inline def apply(): GLViewNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GLViewNativeProps]
    }
    
    extension [Self <: GLViewNativeProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1(value))
      
      inline def setOnContextCreateUndefined: Self = StObject.set(x, "onContextCreate", js.undefined)
      
      inline def setOnContextFailure(value: /* e */ js.Error => Unit): Self = StObject.set(x, "onContextFailure", js.Any.fromFunction1(value))
      
      inline def setOnContextFailureUndefined: Self = StObject.set(x, "onContextFailure", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
