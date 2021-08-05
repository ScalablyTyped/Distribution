package typings.envCi.mod

import typings.envCi.envCiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonCiEnv
  extends StObject
     with CiEnv {
  
  var branch: js.UndefOr[String] = js.undefined
  
  var commit: js.UndefOr[String] = js.undefined
  
  var isCi: `false`
}
object NonCiEnv {
  
  inline def apply(): NonCiEnv = {
    val __obj = js.Dynamic.literal(isCi = false)
    __obj.asInstanceOf[NonCiEnv]
  }
  
  extension [Self <: NonCiEnv](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    inline def setIsCi(value: `false`): Self = StObject.set(x, "isCi", value.asInstanceOf[js.Any])
  }
}
