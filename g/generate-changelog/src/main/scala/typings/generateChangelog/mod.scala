package typings.generateChangelog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("generate-changelog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(options: Options): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait Options extends StObject {
    
    /** allow unkown commit types */
    var allowUnknown: js.UndefOr[Boolean] = js.undefined
    
    /** exclude listed commit types (e.g. `['chore', 'style', 'refactor']`) */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /** whether it should be a major changelog */
    var major: js.UndefOr[Boolean] = js.undefined
    
    /** whether it should be a minor changelog */
    var minor: js.UndefOr[Boolean] = js.undefined
    
    /** whether it should be a patch changelog */
    var patch: js.UndefOr[Boolean] = js.undefined
    
    /** repo URL that will be used when linking commits */
    var repoUrl: js.UndefOr[String] = js.undefined
    
    /** generate from specific tag or range (e.g. `v1.2.3` or `v1.2.3..v1.2.4`)' */
    var tag: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowUnknown(value: Boolean): Self = StObject.set(x, "allowUnknown", value.asInstanceOf[js.Any])
      
      inline def setAllowUnknownUndefined: Self = StObject.set(x, "allowUnknown", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setMajor(value: Boolean): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      inline def setMinor(value: Boolean): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      inline def setPatch(value: Boolean): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setRepoUrl(value: String): Self = StObject.set(x, "repoUrl", value.asInstanceOf[js.Any])
      
      inline def setRepoUrlUndefined: Self = StObject.set(x, "repoUrl", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
