package typings.envCi.mod

import typings.envCi.envCiStrings.Jenkins
import typings.envCi.envCiStrings.jenkins_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JenkinsEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: String
  
  var build: String
  
  var buildUrl: String
  
  var commit: String
  
  var isPr: Boolean
  
  var name: Jenkins
  
  var pr: js.UndefOr[String] = js.undefined
  
  var prBranch: js.UndefOr[String] = js.undefined
  
  var root: String
  
  var service: jenkins_
}
object JenkinsEnv {
  
  @scala.inline
  def apply(branch: String, build: String, buildUrl: String, commit: String, isPr: Boolean, root: String): JenkinsEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Jenkins", root = root.asInstanceOf[js.Any], service = "jenkins")
    __obj.asInstanceOf[JenkinsEnv]
  }
  
  @scala.inline
  implicit class JenkinsEnvMutableBuilder[Self <: JenkinsEnv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUrl(value: String): Self = StObject.set(x, "buildUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPr(value: Boolean): Self = StObject.set(x, "isPr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Jenkins): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPr(value: String): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrBranch(value: String): Self = StObject.set(x, "prBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrBranchUndefined: Self = StObject.set(x, "prBranch", js.undefined)
    
    @scala.inline
    def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: jenkins_): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
