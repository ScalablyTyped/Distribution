package typings.envCi.mod

import typings.envCi.envCiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonCiEnv extends CiEnv {
  
  var branch: js.UndefOr[String] = js.native
  
  var commit: js.UndefOr[String] = js.native
  
  var isCi: `false` = js.native
}
object NonCiEnv {
  
  @scala.inline
  def apply(isCi: `false`): NonCiEnv = {
    val __obj = js.Dynamic.literal(isCi = isCi.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonCiEnv]
  }
  
  @scala.inline
  implicit class NonCiEnvMutableBuilder[Self <: NonCiEnv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    @scala.inline
    def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    @scala.inline
    def setIsCi(value: `false`): Self = StObject.set(x, "isCi", value.asInstanceOf[js.Any])
  }
}
