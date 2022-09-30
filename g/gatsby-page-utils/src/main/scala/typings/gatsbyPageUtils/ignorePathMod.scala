package typings.gatsbyPageUtils

import typings.micromatch.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ignorePathMod {
  
  @JSImport("gatsby-page-utils/dist/ignore-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ignorePath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ignorePath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ignorePath(path: String, ignore: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ignorePath")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ignorePath(path: String, ignore: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ignorePath")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ignorePath(path: String, ignore: IPathIgnoreOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ignorePath")(path.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IPathIgnoreOptions extends StObject {
    
    var options: js.UndefOr[Options] = js.undefined
    
    var patterns: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object IPathIgnoreOptions {
    
    inline def apply(): IPathIgnoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPathIgnoreOptions]
    }
    
    extension [Self <: IPathIgnoreOptions](x: Self) {
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPatterns(value: String | js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
}
