package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PullRequestFilter contains filter properties for matching GitHub Pull
  * Requests.
  */
trait SchemaPullRequestFilter extends StObject {
  
  /**
    * Regex of branches to match.  The syntax of the regular expressions
    * accepted is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var branch: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to block builds on a &quot;/gcbrun&quot; comment from a
    * repository owner or collaborator.
    */
  var commentControl: js.UndefOr[String] = js.undefined
}
object SchemaPullRequestFilter {
  
  inline def apply(): SchemaPullRequestFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullRequestFilter]
  }
  
  extension [Self <: SchemaPullRequestFilter](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCommentControl(value: String): Self = StObject.set(x, "commentControl", value.asInstanceOf[js.Any])
    
    inline def setCommentControlUndefined: Self = StObject.set(x, "commentControl", js.undefined)
  }
}
