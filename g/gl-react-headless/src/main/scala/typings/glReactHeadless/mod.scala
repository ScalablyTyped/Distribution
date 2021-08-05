package typings.glReactHeadless

import typings.glReactHeadless.glviewheadlessMod.GLViewHeadless
import typings.glReactHeadless.glviewheadlessMod.GLViewHeadlessProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-react-headless", "Surface")
  @js.native
  class Surface protected ()
    extends typings.glReact.mod.Surface[GLViewHeadless] {
    def this(props: typings.glReact.mod.SurfaceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.glReact.mod.SurfaceProps, context: js.Any) = this()
  }
  
  trait SurfaceProps
    extends StObject
       with typings.glReact.mod.SurfaceProps
       with GLViewHeadlessProps
  object SurfaceProps {
    
    inline def apply(height: Double, width: Double): SurfaceProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SurfaceProps]
    }
  }
}
