package typings.devextremeRuntime

import typings.inferno.distCoreTypesMod.VNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmInfernoHooksPortalMod {
  
  @JSImport("@devextreme/runtime/esm/inferno-hooks/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Portal(param0: PortalProps): VNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(param0.asInstanceOf[js.Any]).asInstanceOf[VNode | Null]
  
  trait PortalProps extends StObject {
    
    var children: Any
    
    var container: js.UndefOr[HTMLElement | Null] = js.undefined
  }
  object PortalProps {
    
    inline def apply(children: Any): PortalProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
}
