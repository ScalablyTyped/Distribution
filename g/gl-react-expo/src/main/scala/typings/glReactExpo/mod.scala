package typings.glReactExpo

import typings.glReactExpo.glviewnativeMod.GLViewNative
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-react-expo", "Surface")
  @js.native
  open class Surface protected ()
    extends typings.glReact.mod.Surface[GLViewNative] {
    def this(props: typings.glReact.mod.SurfaceProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.glReact.mod.SurfaceProps, context: Any) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.glReactExpo.glviewnativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate */ trait SurfaceProps
    extends StObject
       with typings.glReact.mod.SurfaceProps {
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
  }
  object SurfaceProps {
    
    inline def apply(): SurfaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SurfaceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SurfaceProps] (val x: Self) extends AnyVal {
      
      inline def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1(value))
      
      inline def setOnContextCreateUndefined: Self = StObject.set(x, "onContextCreate", js.undefined)
    }
  }
}
