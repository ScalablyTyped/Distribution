package typings.envCi.mod

import typings.envCi.envCiStrings.Buddy
import typings.envCi.envCiStrings.buddy_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuddyEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: js.UndefOr[String] = js.undefined
  
  var build: String
  
  var buildUrl: String
  
  var commit: String
  
  var isPr: Boolean
  
  var name: Buddy
  
  var pr: js.UndefOr[String] = js.undefined
  
  var service: buddy_
  
  var slug: String
  
  var tag: js.UndefOr[String] = js.undefined
}
object BuddyEnv {
  
  @scala.inline
  def apply(build: String, buildUrl: String, commit: String, isPr: Boolean, slug: String): BuddyEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Buddy", service = "buddy", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuddyEnv]
  }
  
  @scala.inline
  implicit class BuddyEnvMutableBuilder[Self <: BuddyEnv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    @scala.inline
    def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUrl(value: String): Self = StObject.set(x, "buildUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPr(value: Boolean): Self = StObject.set(x, "isPr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Buddy): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPr(value: String): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    @scala.inline
    def setService(value: buddy_): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
