package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GitHubEventsConfig describes the configuration of a trigger that creates a
  * build whenever a GitHub event is received.  This message is experimental.
  */
@js.native
trait SchemaGitHubEventsConfig extends js.Object {
  
  /**
    * Output only. Indicates that a build was generated from a check suite
    * event.
    */
  var checkSuite: js.UndefOr[SchemaCheckSuiteFilter] = js.native
  
  /**
    * The installationID that emmits the GitHub event.
    */
  var installationId: js.UndefOr[String] = js.native
  
  /**
    * Name of the repository.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Owner of the repository.
    */
  var owner: js.UndefOr[String] = js.native
  
  /**
    * filter to match changes in pull requests.
    */
  var pullRequest: js.UndefOr[SchemaPullRequestFilter] = js.native
  
  /**
    * filter to match changes in refs like branches, tags.
    */
  var push: js.UndefOr[SchemaPushFilter] = js.native
}
object SchemaGitHubEventsConfig {
  
  @scala.inline
  def apply(): SchemaGitHubEventsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitHubEventsConfig]
  }
  
  @scala.inline
  implicit class SchemaGitHubEventsConfigOps[Self <: SchemaGitHubEventsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckSuite(value: SchemaCheckSuiteFilter): Self = this.set("checkSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckSuite: Self = this.set("checkSuite", js.undefined)
    
    @scala.inline
    def setInstallationId(value: String): Self = this.set("installationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallationId: Self = this.set("installationId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPullRequest(value: SchemaPullRequestFilter): Self = this.set("pullRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequest: Self = this.set("pullRequest", js.undefined)
    
    @scala.inline
    def setPush(value: SchemaPushFilter): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
  }
}
