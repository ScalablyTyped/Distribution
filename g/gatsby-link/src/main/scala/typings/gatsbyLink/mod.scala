package typings.gatsbyLink

import typings.reachRouter.mod.LinkProps
import typings.reachRouter.mod.NavigateFn
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gatsby-link", JSImport.Default)
  @js.native
  class default[TState] ()
    extends Component[GatsbyLinkProps[TState], js.Any, js.Any]
  
  @JSImport("gatsby-link", "navigate")
  @js.native
  val navigate: NavigateFn = js.native
  
  inline def navigateTo(to: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(to.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def push(to: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(to.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def replace(to: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(to.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withAssetPrefix(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withAssetPrefix")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def withPrefix(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withPrefix")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type GatsbyLink[TState] = Component[GatsbyLinkProps[TState], js.Any, js.Any]
  
  trait GatsbyLinkProps[TState]
    extends StObject
       with LinkProps[TState] {
    
    /** A class to apply when this Link is active */
    var activeClassName: js.UndefOr[String] = js.undefined
    
    /** Inline styles for when this Link is active */
    var activeStyle: js.UndefOr[js.Object] = js.undefined
    
    @JSName("onClick")
    var onClick_GatsbyLinkProps: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], Unit]] = js.undefined
    
    /** Class the link as highlighted if there is a partial match via a the `to` being prefixed to the current url */
    var partiallyActive: js.UndefOr[Boolean] = js.undefined
  }
  object GatsbyLinkProps {
    
    inline def apply[TState](to: String): GatsbyLinkProps[TState] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatsbyLinkProps[TState]]
    }
    
    extension [Self <: GatsbyLinkProps[?], TState](x: Self & GatsbyLinkProps[TState]) {
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setActiveStyle(value: js.Object): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setOnClick(value: /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPartiallyActive(value: Boolean): Self = StObject.set(x, "partiallyActive", value.asInstanceOf[js.Any])
      
      inline def setPartiallyActiveUndefined: Self = StObject.set(x, "partiallyActive", js.undefined)
    }
  }
}
