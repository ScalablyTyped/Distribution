package typings.gatsbyPluginBreakpoints

import typings.gatsbyPluginBreakpoints.gatsbyPluginBreakpointsStrings.`gatsby-plugin-breakpoints`
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ProviderExoticComponent
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-plugin-breakpoints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gatsby-plugin-breakpoints", "BreakpointContext")
  @js.native
  val BreakpointContext: Context[QueriesObject] = js.native
  
  @JSImport("gatsby-plugin-breakpoints", "BreakpointProvider")
  @js.native
  val BreakpointProvider: ProviderExoticComponent[BreakpointProviderProps] = js.native
  
  inline def useBreakpoint(): BreakpointsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("useBreakpoint")().asInstanceOf[BreakpointsObject]
  
  inline def withBreakpoints[P /* <: BreakpointProps */](Component: ComponentType[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withBreakpoints")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  
  trait BreakpointConfig extends StObject {
    
    var options: js.UndefOr[BreakpointOptions] = js.undefined
    
    var resolve: `gatsby-plugin-breakpoints`
  }
  object BreakpointConfig {
    
    inline def apply(): BreakpointConfig = {
      val __obj = js.Dynamic.literal(resolve = "gatsby-plugin-breakpoints")
      __obj.asInstanceOf[BreakpointConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreakpointConfig] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: BreakpointOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setResolve(value: `gatsby-plugin-breakpoints`): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  trait BreakpointOptions extends StObject {
    
    var queries: js.UndefOr[QueriesObject] = js.undefined
  }
  object BreakpointOptions {
    
    inline def apply(): BreakpointOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreakpointOptions] (val x: Self) extends AnyVal {
      
      inline def setQueries(value: QueriesObject): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    }
  }
  
  trait BreakpointProps extends StObject {
    
    var breakpoints: BreakpointsObject
  }
  object BreakpointProps {
    
    inline def apply(breakpoints: BreakpointsObject): BreakpointProps = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreakpointProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreakpointProps] (val x: Self) extends AnyVal {
      
      inline def setBreakpoints(value: BreakpointsObject): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    }
  }
  
  trait BreakpointProviderProps extends StObject {
    
    var children: ReactNode
    
    var queries: QueriesObject
  }
  object BreakpointProviderProps {
    
    inline def apply(queries: QueriesObject): BreakpointProviderProps = {
      val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreakpointProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreakpointProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setQueries(value: QueriesObject): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    }
  }
  
  type BreakpointsObject = Record[String, Boolean]
  
  type QueriesObject = Record[String, String]
}
