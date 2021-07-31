package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GitHubEventsConfig describes the configuration of a trigger that creates a
  * build whenever a GitHub event is received.  This message is experimental.
  */
trait SchemaGitHubEventsConfig extends StObject {
  
  /**
    * Output only. Indicates that a build was generated from a check suite
    * event.
    */
  var checkSuite: js.UndefOr[SchemaCheckSuiteFilter] = js.undefined
  
  /**
    * The installationID that emmits the GitHub event.
    */
  var installationId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the repository.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Owner of the repository.
    */
  var owner: js.UndefOr[String] = js.undefined
  
  /**
    * filter to match changes in pull requests.
    */
  var pullRequest: js.UndefOr[SchemaPullRequestFilter] = js.undefined
  
  /**
    * filter to match changes in refs like branches, tags.
    */
  var push: js.UndefOr[SchemaPushFilter] = js.undefined
}
object SchemaGitHubEventsConfig {
  
  @scala.inline
  def apply(): SchemaGitHubEventsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitHubEventsConfig]
  }
  
  @scala.inline
  implicit class SchemaGitHubEventsConfigMutableBuilder[Self <: SchemaGitHubEventsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckSuite(value: SchemaCheckSuiteFilter): Self = StObject.set(x, "checkSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckSuiteUndefined: Self = StObject.set(x, "checkSuite", js.undefined)
    
    @scala.inline
    def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationIdUndefined: Self = StObject.set(x, "installationId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPullRequest(value: SchemaPullRequestFilter): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
    
    @scala.inline
    def setPush(value: SchemaPushFilter): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
  }
}
