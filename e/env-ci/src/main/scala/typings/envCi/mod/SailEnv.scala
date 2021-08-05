package typings.envCi.mod

import typings.envCi.envCiStrings.`Sail CI`
import typings.envCi.envCiStrings.sail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SailEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: js.UndefOr[String] = js.undefined
  
  var commit: String
  
  var isPr: Boolean
  
  var name: `Sail CI`
  
  var pr: js.UndefOr[String] = js.undefined
  
  var root: String
  
  var service: sail
  
  var slug: String
}
object SailEnv {
  
  inline def apply(commit: String, isPr: Boolean, root: String, slug: String): SailEnv = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Sail CI", root = root.asInstanceOf[js.Any], service = "sail", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[SailEnv]
  }
  
  extension [Self <: SailEnv](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setIsPr(value: Boolean): Self = StObject.set(x, "isPr", value.asInstanceOf[js.Any])
    
    inline def setName(value: `Sail CI`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPr(value: String): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setService(value: sail): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
  }
}
