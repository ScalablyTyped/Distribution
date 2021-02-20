package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PullRequestFilter contains filter properties for matching GitHub Pull
  * Requests.
  */
@js.native
trait SchemaPullRequestFilter extends StObject {
  
  /**
    * Regex of branches to match.  The syntax of the regular expressions
    * accepted is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var branch: js.UndefOr[String] = js.native
  
  /**
    * Whether to block builds on a &quot;/gcbrun&quot; comment from a
    * repository owner or collaborator.
    */
  var commentControl: js.UndefOr[String] = js.native
}
object SchemaPullRequestFilter {
  
  @scala.inline
  def apply(): SchemaPullRequestFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullRequestFilter]
  }
  
  @scala.inline
  implicit class SchemaPullRequestFilterMutableBuilder[Self <: SchemaPullRequestFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    @scala.inline
    def setCommentControl(value: String): Self = StObject.set(x, "commentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentControlUndefined: Self = StObject.set(x, "commentControl", js.undefined)
  }
}
