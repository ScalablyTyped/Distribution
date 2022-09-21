package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPushFilter extends StObject {
  
  /**
    * Regexes matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
    */
  var branch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When true, only trigger a build if the revision regex does NOT match the git_ref regex.
    */
  var invertRegex: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Regexes matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaPushFilter {
  
  inline def apply(): SchemaPushFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushFilter]
  }
  
  extension [Self <: SchemaPushFilter](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchNull: Self = StObject.set(x, "branch", null)
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setInvertRegex(value: Boolean): Self = StObject.set(x, "invertRegex", value.asInstanceOf[js.Any])
    
    inline def setInvertRegexNull: Self = StObject.set(x, "invertRegex", null)
    
    inline def setInvertRegexUndefined: Self = StObject.set(x, "invertRegex", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
