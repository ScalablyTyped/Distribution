package typings.fluentuiReactComponentRef

import typings.propTypes.mod.Requireable
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@fluentui/react-component-ref/dist/es/types", "refPropType")
  @js.native
  val refPropType: Requireable[Ref[js.Any]] = js.native
  
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
    
    @scala.inline
    def apply(children: ReactElement): RefProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = null)
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
