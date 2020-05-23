package typings.gapiClientFirebaserules.gapi.client.firebaserules

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFirebaserules.anon.Accesstoken
import typings.gapiClientFirebaserules.anon.Bearertoken
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
  def create(request: Accesstoken): Request[Ruleset]
  /**
    * Delete a `Ruleset` by resource name.
    *
    * If the `Ruleset` is referenced by a `Release` the operation will fail.
    */
  def delete(request: Accesstoken): Request[js.Object]
  /** Get a `Ruleset` by name including the full `Source` contents. */
  def get(request: Accesstoken): Request[Ruleset]
  /**
    * List `Ruleset` metadata only and optionally filter the results by `Ruleset`
    * name.
    *
    * The full `Source` contents of a `Ruleset` may be retrieved with
    * GetRuleset.
    */
  def list(request: Bearertoken): Request[ListRulesetsResponse]
}

object RulesetsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[Ruleset],
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[Ruleset],
    list: Bearertoken => Request[ListRulesetsResponse]
  ): RulesetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RulesetsResource]
  }
}

