package typings.envCi.mod

import typings.envCi.envCiStrings.`AWS CodeBuild`
import typings.envCi.envCiStrings.codebuild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeBuildEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: String
  
  var build: String
  
  var buildUrl: String
  
  var commit: String
  
  var name: `AWS CodeBuild`
  
  var root: String
  
  var service: codebuild
}
object CodeBuildEnv {
  
  inline def apply(branch: String, build: String, buildUrl: String, commit: String, root: String): CodeBuildEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, name = "AWS CodeBuild", root = root.asInstanceOf[js.Any], service = "codebuild")
    __obj.asInstanceOf[CodeBuildEnv]
  }
  
  extension [Self <: CodeBuildEnv](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUrl(value: String): Self = StObject.set(x, "buildUrl", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setName(value: `AWS CodeBuild`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setService(value: codebuild): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
