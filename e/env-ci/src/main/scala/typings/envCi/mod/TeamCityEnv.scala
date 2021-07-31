package typings.envCi.mod

import typings.envCi.envCiStrings.TeamCity
import typings.envCi.envCiStrings.teamcity_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamCityEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: js.UndefOr[String] = js.undefined
  
  var build: String
  
  var commit: String
  
  var name: TeamCity
  
  var root: js.UndefOr[String] = js.undefined
  
  var service: teamcity_
  
  var slug: String
}
object TeamCityEnv {
  
  @scala.inline
  def apply(build: String, commit: String, slug: String): TeamCityEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, name = "TeamCity", service = "teamcity", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamCityEnv]
  }
  
  @scala.inline
  implicit class TeamCityEnvMutableBuilder[Self <: TeamCityEnv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    @scala.inline
    def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: TeamCity): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setService(value: teamcity_): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
  }
}
