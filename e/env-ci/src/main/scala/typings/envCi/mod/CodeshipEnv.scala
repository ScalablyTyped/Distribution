package typings.envCi.mod

import typings.envCi.envCiStrings.Codeship
import typings.envCi.envCiStrings.codeship_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeshipEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: String
  
  var build: String
  
  var buildUrl: String
  
  var commit: String
  
  var name: Codeship
  
  var service: codeship_
  
  var slug: String
}
object CodeshipEnv {
  
  inline def apply(branch: String, build: String, buildUrl: String, commit: String, slug: String): CodeshipEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, name = "Codeship", service = "codeship", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeshipEnv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeshipEnv] (val x: Self) extends AnyVal {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUrl(value: String): Self = StObject.set(x, "buildUrl", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setName(value: Codeship): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setService(value: codeship_): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
  }
}
