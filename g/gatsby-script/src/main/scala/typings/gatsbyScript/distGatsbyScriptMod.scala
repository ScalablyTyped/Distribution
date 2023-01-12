package typings.gatsbyScript

import typings.gatsbyScript.anon.Error
import typings.react.mod.global.JSX.Element
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGatsbyScriptMod {
  
  @JSImport("gatsby-script/dist/gatsby-script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Script(props: ScriptProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Script")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  sealed trait ScriptStrategy extends StObject
  @JSImport("gatsby-script/dist/gatsby-script", "ScriptStrategy")
  @js.native
  object ScriptStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ScriptStrategy & String] = js.native
    
    @js.native
    sealed trait idle
      extends StObject
         with ScriptStrategy
    /* "idle" */ val idle: typings.gatsbyScript.distGatsbyScriptMod.ScriptStrategy.idle & String = js.native
    
    @js.native
    sealed trait offMainThread
      extends StObject
         with ScriptStrategy
    /* "off-main-thread" */ val offMainThread: typings.gatsbyScript.distGatsbyScriptMod.ScriptStrategy.offMainThread & String = js.native
    
    @js.native
    sealed trait postHydrate
      extends StObject
         with ScriptStrategy
    /* "post-hydrate" */ val postHydrate: typings.gatsbyScript.distGatsbyScriptMod.ScriptStrategy.postHydrate & String = js.native
  }
  
  @JSImport("gatsby-script/dist/gatsby-script", "scriptCache")
  @js.native
  val scriptCache: Set[String] = js.native
  
  @JSImport("gatsby-script/dist/gatsby-script", "scriptCallbackCache")
  @js.native
  val scriptCallbackCache: Map[String, Error] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.ScriptHTMLAttributes<std.HTMLScriptElement>, / * template literal string: onLoad * / string> ]: react.react.ScriptHTMLAttributes<std.HTMLScriptElement>[P]} */ trait ScriptProps extends StObject {
    
    var children: js.UndefOr[String] = js.undefined
    
    var forward: js.UndefOr[js.Array[String]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* event */ ErrorEvent, Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var strategy: js.UndefOr[ScriptStrategy | (/* template literal string: post-hydrate */ String)] = js.undefined
  }
  object ScriptProps {
    
    inline def apply(): ScriptProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScriptProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScriptProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForward(value: js.Array[String]): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      inline def setForwardVarargs(value: String*): Self = StObject.set(x, "forward", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnError(value: /* event */ ErrorEvent => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: /* event */ Event => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setStrategy(value: ScriptStrategy | (/* template literal string: post-hydrate */ String)): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
