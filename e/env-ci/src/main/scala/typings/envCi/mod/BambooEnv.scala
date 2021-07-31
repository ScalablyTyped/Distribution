package typings.envCi.mod

import typings.envCi.envCiStrings.Bamboo
import typings.envCi.envCiStrings.bamboo_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BambooEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: String
  
  var build: String
  
  var buildUrl: String
  
  var commit: String
  
  var job: String
  
  var name: Bamboo
  
  var root: String
  
  var service: bamboo_
}
object BambooEnv {
  
  @scala.inline
  def apply(branch: String, build: String, buildUrl: String, commit: String, job: String, root: String): BambooEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, job = job.asInstanceOf[js.Any], name = "Bamboo", root = root.asInstanceOf[js.Any], service = "bamboo")
    __obj.asInstanceOf[BambooEnv]
  }
  
  @scala.inline
  implicit class BambooEnvMutableBuilder[Self <: BambooEnv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUrl(value: String): Self = StObject.set(x, "buildUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob(value: String): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Bamboo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: bamboo_): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
