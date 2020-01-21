package typings.gapiClientFirebaserules.gapi.client.firebaserules

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFirebaserules.AnonAccesstoken
import typings.gapiClientFirebaserules.AnonAccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesetsResource extends js.Object {
  /**
    * Create a `Ruleset` from `Source`.
    *
    * The `Ruleset` is given a unique generated name which is returned to the
    * caller. `Source` containing syntactic or semantics errors will result in an
    * error response indicating the first error encountered. For a detailed view
    * of `Source` issues, use TestRuleset.
    */
  def create(request: AnonAccesstoken): Request_[Ruleset]
  /**
    * Delete a `Ruleset` by resource name.
    *
    * If the `Ruleset` is referenced by a `Release` the operation will fail.
    */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Get a `Ruleset` by name including the full `Source` contents. */
  def get(request: AnonAccesstoken): Request_[Ruleset]
  /**
    * List `Ruleset` metadata only and optionally filter the results by `Ruleset`
    * name.
    *
    * The full `Source` contents of a `Ruleset` may be retrieved with
    * GetRuleset.
    */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListRulesetsResponse]
}

object RulesetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[Ruleset],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[Ruleset],
    list: AnonAccesstokenAltBearertoken => Request_[ListRulesetsResponse]
  ): RulesetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RulesetsResource]
  }
}

