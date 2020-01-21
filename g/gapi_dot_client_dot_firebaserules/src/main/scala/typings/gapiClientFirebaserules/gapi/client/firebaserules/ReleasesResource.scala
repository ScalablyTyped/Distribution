package typings.gapiClientFirebaserules.gapi.client.firebaserules

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFirebaserules.AnonAccesstoken
import typings.gapiClientFirebaserules.AnonAccesstokenAlt
import typings.gapiClientFirebaserules.AnonAccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleasesResource extends js.Object {
  /**
    * Create a `Release`.
    *
    * Release names should reflect the developer's deployment practices. For
    * example, the release name may include the environment name, application
    * name, application version, or any other name meaningful to the developer.
    * Once a `Release` refers to a `Ruleset`, the rules can be enforced by
    * Firebase Rules-enabled services.
    *
    * More than one `Release` may be 'live' concurrently. Consider the following
    * three `Release` names for `projects/foo` and the `Ruleset` to which they
    * refer.
    *
    * Release Name                    | Ruleset Name
    * --------------------------------|-------------
    * projects/foo/releases/prod      | projects/foo/rulesets/uuid123
    * projects/foo/releases/prod/beta | projects/foo/rulesets/uuid123
    * projects/foo/releases/prod/v23  | projects/foo/rulesets/uuid456
    *
    * The table reflects the `Ruleset` rollout in progress. The `prod` and
    * `prod/beta` releases refer to the same `Ruleset`. However, `prod/v23`
    * refers to a new `Ruleset`. The `Ruleset` reference for a `Release` may be
    * updated using the UpdateRelease method.
    */
  def create(request: AnonAccesstoken): Request_[Release]
  /** Delete a `Release` by resource name. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Get a `Release` by name. */
  def get(request: AnonAccesstoken): Request_[Release]
  /** Get the `Release` executable to use when enforcing rules. */
  def getExecutable(request: AnonAccesstokenAlt): Request_[GetReleaseExecutableResponse]
  /**
    * List the `Release` values for a project. This list may optionally be
    * filtered by `Release` name, `Ruleset` name, `TestSuite` name, or any
    * combination thereof.
    */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListReleasesResponse]
  /**
    * Update a `Release`.
    *
    * Only updates to the `ruleset_name` and `test_suite_name` fields will be
    * honored. `Release` rename is not supported. To create a `Release` use the
    * CreateRelease method.
    */
  def update(request: AnonAccesstoken): Request_[Release]
}

object ReleasesResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[Release],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[Release],
    getExecutable: AnonAccesstokenAlt => Request_[GetReleaseExecutableResponse],
    list: AnonAccesstokenAltBearertoken => Request_[ListReleasesResponse],
    update: AnonAccesstoken => Request_[Release]
  ): ReleasesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getExecutable = js.Any.fromFunction1(getExecutable), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ReleasesResource]
  }
}

