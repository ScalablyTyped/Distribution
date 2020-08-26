package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings

import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Filter
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListFiltersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiltersCollection extends js.Object {
  // Creates a filter.
  def create(resource: Filter, userId: String): Filter = js.native
  // Gets a filter.
  def get(userId: String, id: String): Filter = js.native
  // Lists the message filters of a Gmail user.
  def list(userId: String): ListFiltersResponse = js.native
  // Deletes a filter.
  def remove(userId: String, id: String): Unit = js.native
}

object FiltersCollection {
  @scala.inline
  def apply(
    create: (Filter, String) => Filter,
    get: (String, String) => Filter,
    list: String => ListFiltersResponse,
    remove: (String, String) => Unit
  ): FiltersCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[FiltersCollection]
  }
  @scala.inline
  implicit class FiltersCollectionOps[Self <: FiltersCollection] (val x: Self) extends AnyVal {
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
    def setCreate(value: (Filter, String) => Filter): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def setGet(value: (String, String) => Filter): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => ListFiltersResponse): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: (String, String) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
  }
  
}

