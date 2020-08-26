package typings.gapiClientFirebaserules.gapi.client.firebaserules

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFirebaserules.anon.Accesstoken
import typings.gapiClientFirebaserules.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesetsResource extends js.Object {
  /**
    * Create a `Ruleset` from `Source`.
    *
    * The `Ruleset` is given a unique generated name which is returned to the
    * caller. `Source` containing syntactic or semantics errors will result in an
    * error response indicating the first error encountered. For a detailed view
    * of `Source` issues, use TestRuleset.
    */
  def create(request: Accesstoken): Request[Ruleset] = js.native
  /**
    * Delete a `Ruleset` by resource name.
    *
    * If the `Ruleset` is referenced by a `Release` the operation will fail.
    */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /** Get a `Ruleset` by name including the full `Source` contents. */
  def get(request: Accesstoken): Request[Ruleset] = js.native
  /**
    * List `Ruleset` metadata only and optionally filter the results by `Ruleset`
    * name.
    *
    * The full `Source` contents of a `Ruleset` may be retrieved with
    * GetRuleset.
    */
  def list(request: Bearertoken): Request[ListRulesetsResponse] = js.native
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
  @scala.inline
  implicit class RulesetsResourceOps[Self <: RulesetsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[Ruleset]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Accesstoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[Ruleset]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Bearertoken => Request[ListRulesetsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

