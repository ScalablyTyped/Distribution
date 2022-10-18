package typings.gatsbyScript

import typings.gatsbyScript.distGatsbyScriptMod.ScriptProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectedScriptsByPageMod {
  
  object collectedScriptsByPage {
    
    @JSImport("gatsby-script/dist/collected-scripts-by-page", "collectedScriptsByPage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def delete(pathname: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(pathname.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def get(pathname: String): js.Array[ScriptProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(pathname.asInstanceOf[js.Any]).asInstanceOf[js.Array[ScriptProps]]
    
    inline def set(pathname: String, collectedScript: ScriptProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(pathname.asInstanceOf[js.Any], collectedScript.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
