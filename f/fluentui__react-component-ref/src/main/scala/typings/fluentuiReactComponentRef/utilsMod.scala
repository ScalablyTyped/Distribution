package typings.fluentuiReactComponentRef

import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@fluentui/react-component-ref/dist/es/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleRef[N](ref: js.Function1[/* instance */ N | Null, Unit], node: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def handleRef[N](ref: Null, node: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def handleRef[N](ref: Unit, node: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def handleRef[N](ref: RefObject[N], node: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefObject")(ref.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.RefObject<any> */ Boolean]
  
  trait RefProps extends StObject {
    
    var children: ReactElement
    
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param node - Referred node.
      */
    var innerRef: Ref[HTMLElement]
  }
  object RefProps {
    
    inline def apply(children: ReactElement): RefProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = null)
      __obj.asInstanceOf[RefProps]
    }
    
    extension [Self <: RefProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    }
  }
}
