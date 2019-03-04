package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

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
  def create(request: gapiDotClientDotFirebaserulesLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Ruleset]
  /**
    * Delete a `Ruleset` by resource name.
    *
    * If the `Ruleset` is referenced by a `Release` the operation will fail.
    */
  def delete(request: gapiDotClientDotFirebaserulesLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Get a `Ruleset` by name including the full `Source` contents. */
  def get(request: gapiDotClientDotFirebaserulesLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Ruleset]
  /**
    * List `Ruleset` metadata only and optionally filter the results by `Ruleset`
    * name.
    *
    * The full `Source` contents of a `Ruleset` may be retrieved with
    * GetRuleset.
    */
  def list(request: gapiDotClientDotFirebaserulesLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListRulesetsResponse]
}

object RulesetsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotFirebaserulesLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Ruleset]
    ],
    delete: js.Function1[
      gapiDotClientDotFirebaserulesLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotFirebaserulesLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Ruleset]
    ],
    list: js.Function1[
      gapiDotClientDotFirebaserulesLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListRulesetsResponse]
    ]
  ): RulesetsResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list)
  
    __obj.asInstanceOf[RulesetsResource]
  }
}

