package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    checkSuite: SchemaCheckSuiteFilter = null,
    installationId: String = null,
    name: String = null,
    owner: String = null,
    pullRequest: SchemaPullRequestFilter = null,
    push: SchemaPushFilter = null
  ): SchemaGitHubEventsConfig = {
    val __obj = js.Dynamic.literal()
    if (checkSuite != null) __obj.updateDynamic("checkSuite")(checkSuite.asInstanceOf[js.Any])
    if (installationId != null) __obj.updateDynamic("installationId")(installationId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (pullRequest != null) __obj.updateDynamic("pullRequest")(pullRequest.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGitHubEventsConfig]
  }
}

