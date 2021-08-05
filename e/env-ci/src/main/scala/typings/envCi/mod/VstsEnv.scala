package typings.envCi.mod

import typings.envCi.envCiStrings.`Visual Studio Team Services`
import typings.envCi.envCiStrings.vsts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VstsEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: String
  
  var build: String
  
  var commit: String
  
  var isPr: Boolean
  
  var name: `Visual Studio Team Services`
  
  var pr: js.UndefOr[String] = js.undefined
  
  var prBranch: js.UndefOr[String] = js.undefined
  
  var root: String
  
  var service: vsts
}
object VstsEnv {
  
  inline def apply(branch: String, build: String, commit: String, isPr: Boolean, root: String): VstsEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Visual Studio Team Services", root = root.asInstanceOf[js.Any], service = "vsts")
    __obj.asInstanceOf[VstsEnv]
  }
  
  extension [Self <: VstsEnv](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setIsPr(value: Boolean): Self = StObject.set(x, "isPr", value.asInstanceOf[js.Any])
    
    inline def setName(value: `Visual Studio Team Services`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPr(value: String): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    inline def setPrBranch(value: String): Self = StObject.set(x, "prBranch", value.asInstanceOf[js.Any])
    
    inline def setPrBranchUndefined: Self = StObject.set(x, "prBranch", js.undefined)
    
    inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setService(value: vsts): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
