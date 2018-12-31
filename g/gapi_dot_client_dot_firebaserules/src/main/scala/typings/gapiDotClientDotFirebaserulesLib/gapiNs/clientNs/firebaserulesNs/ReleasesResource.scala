package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

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
  def create(request: gapiDotClientDotFirebaserulesLib.Anon_NameAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Release]
  /** Delete a `Release` by resource name. */
  def delete(request: gapiDotClientDotFirebaserulesLib.Anon_NameAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Get a `Release` by name. */
  def get(request: gapiDotClientDotFirebaserulesLib.Anon_NameAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Release]
  /** Get the `Release` executable to use when enforcing rules. */
  def getExecutable(request: gapiDotClientDotFirebaserulesLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[GetReleaseExecutableResponse]
  /**
    * List the `Release` values for a project. This list may optionally be
    * filtered by `Release` name, `Ruleset` name, `TestSuite` name, or any
    * combination thereof.
    */
  def list(request: gapiDotClientDotFirebaserulesLib.Anon_NameAccesstokenPageSize): gapiDotClientLib.gapiNs.clientNs.Request[ListReleasesResponse]
  /**
    * Update a `Release`.
    *
    * Only updates to the `ruleset_name` and `test_suite_name` fields will be
    * honored. `Release` rename is not supported. To create a `Release` use the
    * CreateRelease method.
    */
  def update(request: gapiDotClientDotFirebaserulesLib.Anon_NameAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Release]
}

