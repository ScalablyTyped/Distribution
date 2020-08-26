package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CountriesListResponse
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Country
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountriesCollection extends js.Object {
  // Gets one country by ID.
  def get(profileId: String, dartId: String): Country = js.native
  // Retrieves a list of countries.
  def list(profileId: String): CountriesListResponse = js.native
}

object CountriesCollection {
  @scala.inline
  def apply(get: (String, String) => Country, list: String => CountriesListResponse): CountriesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CountriesCollection]
  }
  @scala.inline
  implicit class CountriesCollectionOps[Self <: CountriesCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, String) => Country): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => CountriesListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

