package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Push contains filter properties for matching GitHub git pushes.
  */
trait SchemaPushFilter extends StObject {
  
  /**
    * Regexes of branches to match.  The syntax of the regular expressions
    * accepted is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var branch: js.UndefOr[String] = js.undefined
  
  /**
    * Regexes of tags to match.  The syntax of the regular expressions accepted
    * is the syntax accepted by RE2 and described at
    * https://github.com/google/re2/wiki/Syntax
    */
  var tag: js.UndefOr[String] = js.undefined
}
object SchemaPushFilter {
  
  @scala.inline
  def apply(): SchemaPushFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushFilter]
  }
  
  @scala.inline
  implicit class SchemaPushFilterMutableBuilder[Self <: SchemaPushFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
