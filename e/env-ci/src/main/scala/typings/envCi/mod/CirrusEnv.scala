package typings.envCi.mod

import typings.envCi.envCiStrings.`Cirrus CI`
import typings.envCi.envCiStrings.cirrus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CirrusEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: String
  
  var build: String
  
  var buildUrl: String
  
  var commit: String
  
  var isPr: Boolean
  
  var job: String
  
  var jobUrl: String
  
  var name: `Cirrus CI`
  
  var pr: js.UndefOr[String] = js.undefined
  
  var root: String
  
  var service: cirrus
  
  var slug: String
  
  var tag: js.UndefOr[String] = js.undefined
}
object CirrusEnv {
  
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    root: String,
    slug: String
  ): CirrusEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = "Cirrus CI", root = root.asInstanceOf[js.Any], service = "cirrus", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[CirrusEnv]
  }
  
  @scala.inline
  implicit class CirrusEnvMutableBuilder[Self <: CirrusEnv] (val x: Self) extends AnyVal {
    
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
    def setJob(value: String): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUrl(value: String): Self = StObject.set(x, "jobUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: `Cirrus CI`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPr(value: String): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: cirrus): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
