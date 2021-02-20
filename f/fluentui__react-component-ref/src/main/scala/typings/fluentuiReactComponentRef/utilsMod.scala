package typings.fluentuiReactComponentRef

import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@fluentui/react-component-ref/dist/es/utils", "handleRef")
  @js.native
  def handleRef[N](ref: js.UndefOr[scala.Nothing], node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref/dist/es/utils", "handleRef")
  @js.native
  def handleRef[N](ref: js.Function1[/* instance */ N | Null, Unit], node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref/dist/es/utils", "handleRef")
  @js.native
  def handleRef[N](ref: Null, node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref/dist/es/utils", "handleRef")
  @js.native
  def handleRef[N](ref: RefObject[N], node: N): Unit = js.native
  
  @JSImport("@fluentui/react-component-ref/dist/es/utils", "isRefObject")
  @js.native
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = js.native
  
  @js.native
  trait RefProps extends StObject {
    
    var children: ReactElement = js.native
    
    /**
      * Called when a child component will be mounted or updated.
      *
      * @param node - Referred node.
      */
    var innerRef: Ref[HTMLElement] = js.native
  }
  object RefProps {
    
    @scala.inline
    def apply(children: ReactElement): RefProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefProps]
    }
    
    @scala.inline
    implicit class RefPropsMutableBuilder[Self <: RefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    }
  }
}
