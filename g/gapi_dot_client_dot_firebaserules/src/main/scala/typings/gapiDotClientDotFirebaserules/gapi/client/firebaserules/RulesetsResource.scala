package typings.gapiDotClientDotFirebaserules.gapi.client.firebaserules

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFirebaserules.Anon_Accesstoken
import typings.gapiDotClientDotFirebaserules.Anon_AccesstokenAltBearertoken
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
  def create(request: Anon_Accesstoken): Request[Ruleset]
  /**
    * Delete a `Ruleset` by resource name.
    *
    * If the `Ruleset` is referenced by a `Release` the operation will fail.
    */
  def delete(request: Anon_Accesstoken): Request[js.Object]
  /** Get a `Ruleset` by name including the full `Source` contents. */
  def get(request: Anon_Accesstoken): Request[Ruleset]
  /**
    * List `Ruleset` metadata only and optionally filter the results by `Ruleset`
    * name.
    *
    * The full `Source` contents of a `Ruleset` may be retrieved with
    * GetRuleset.
    */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListRulesetsResponse]
}

object RulesetsResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[Ruleset],
    delete: Anon_Accesstoken => Request[js.Object],
    get: Anon_Accesstoken => Request[Ruleset],
    list: Anon_AccesstokenAltBearertoken => Request[ListRulesetsResponse]
  ): RulesetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RulesetsResource]
  }
}

