package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPullRequestFilter extends StObject {
  
  /**
    * Regex of branches to match. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
    */
  var branch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configure builds to run whether a repository owner or collaborator need to comment `/gcbrun`.
    */
  var commentControl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, branches that do NOT match the git_ref will trigger a build.
    */
  var invertRegex: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPullRequestFilter {
  
  inline def apply(): SchemaPullRequestFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullRequestFilter]
  }
  
  extension [Self <: SchemaPullRequestFilter](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchNull: Self = StObject.set(x, "branch", null)
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCommentControl(value: String): Self = StObject.set(x, "commentControl", value.asInstanceOf[js.Any])
    
    inline def setCommentControlNull: Self = StObject.set(x, "commentControl", null)
    
    inline def setCommentControlUndefined: Self = StObject.set(x, "commentControl", js.undefined)
    
    inline def setInvertRegex(value: Boolean): Self = StObject.set(x, "invertRegex", value.asInstanceOf[js.Any])
    
    inline def setInvertRegexNull: Self = StObject.set(x, "invertRegex", null)
    
    inline def setInvertRegexUndefined: Self = StObject.set(x, "invertRegex", js.undefined)
  }
}
