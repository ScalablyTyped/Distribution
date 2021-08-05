package typings.envCi.mod

import typings.envCi.envCiStrings.`Travis CI`
import typings.envCi.envCiStrings.travis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TravisEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: js.UndefOr[String] = js.undefined
  
  var build: String
  
  var buildUrl: String
  
  var commit: String
  
  var isPr: Boolean
  
  var job: String
  
  var jobUrl: String
  
  var name: `Travis CI`
  
  var pr: js.UndefOr[String] = js.undefined
  
  var prBranch: String
  
  var root: String
  
  var service: travis
  
  var slug: String
  
  var tag: js.UndefOr[String] = js.undefined
}
object TravisEnv {
  
  inline def apply(
    build: String,
    buildUrl: String,
    commit: String,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    prBranch: String,
    root: String,
    slug: String
  ): TravisEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = "Travis CI", prBranch = prBranch.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = "travis", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[TravisEnv]
  }
  
  extension [Self <: TravisEnv](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUrl(value: String): Self = StObject.set(x, "buildUrl", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setIsPr(value: Boolean): Self = StObject.set(x, "isPr", value.asInstanceOf[js.Any])
    
    inline def setJob(value: String): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUrl(value: String): Self = StObject.set(x, "jobUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: `Travis CI`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPr(value: String): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    inline def setPrBranch(value: String): Self = StObject.set(x, "prBranch", value.asInstanceOf[js.Any])
    
    inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setService(value: travis): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
