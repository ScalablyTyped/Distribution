package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.AccountId
import typings.gapiClientAdexchangeseller.anon.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedResource extends js.Object {
  /** Generate an Ad Exchange report based on the saved report ID sent in the query parameters. */
  def generate(request: Locale): Request[Report] = js.native
  /** List all saved reports in this Ad Exchange account. */
  def list(request: AccountId): Request[SavedReports] = js.native
}

object SavedResource {
  @scala.inline
  def apply(generate: Locale => Request[Report], list: AccountId => Request[SavedReports]): SavedResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SavedResource]
  }
  @scala.inline
  implicit class SavedResourceOps[Self <: SavedResource] (val x: Self) extends AnyVal {
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
    def setGenerate(value: Locale => Request[Report]): Self = this.set("generate", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AccountId => Request[SavedReports]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

