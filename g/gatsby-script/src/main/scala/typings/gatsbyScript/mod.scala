package typings.gatsbyScript

import typings.gatsbyScript.anon.Error
import typings.gatsbyScript.gatsbyScriptMod.ScriptProps
import typings.react.mod.global.JSX.Element
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Script(props: ScriptProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Script")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("gatsby-script", "ScriptStrategy")
  @js.native
  object ScriptStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.gatsbyScript.gatsbyScriptMod.ScriptStrategy & String] = js.native
    
    /* "idle" */ val idle: typings.gatsbyScript.gatsbyScriptMod.ScriptStrategy.idle & String = js.native
    
    /* "off-main-thread" */ val offMainThread: typings.gatsbyScript.gatsbyScriptMod.ScriptStrategy.offMainThread & String = js.native
    
    /* "post-hydrate" */ val postHydrate: typings.gatsbyScript.gatsbyScriptMod.ScriptStrategy.postHydrate & String = js.native
  }
  
  object collectedScriptsByPage {
    
    @JSImport("gatsby-script", "collectedScriptsByPage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def delete(pathname: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(pathname.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def get(pathname: String): js.Array[ScriptProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(pathname.asInstanceOf[js.Any]).asInstanceOf[js.Array[ScriptProps]]
    
    inline def set(pathname: String, collectedScript: ScriptProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(pathname.asInstanceOf[js.Any], collectedScript.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("gatsby-script", "scriptCache")
  @js.native
  val scriptCache: Set[String] = js.native
  
  @JSImport("gatsby-script", "scriptCallbackCache")
  @js.native
  val scriptCallbackCache: Map[String, Error] = js.native
}
