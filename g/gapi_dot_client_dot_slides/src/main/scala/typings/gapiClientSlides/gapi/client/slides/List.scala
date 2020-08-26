package typings.gapiClientSlides.gapi.client.slides

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List extends js.Object {
  /** The ID of the list. */
  var listId: js.UndefOr[String] = js.native
  /**
    * A map of nesting levels to the properties of bullets at the associated
    * level. A list has at most nine levels of nesting, so the possible values
    * for the keys of this map are 0 through 8, inclusive.
    */
  var nestingLevel: js.UndefOr[Record[String, NestingLevel]] = js.native
}

object List {
  @scala.inline
  def apply(): List = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[List]
  }
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
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
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListId: Self = this.set("listId", js.undefined)
    @scala.inline
    def setNestingLevel(value: Record[String, NestingLevel]): Self = this.set("nestingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingLevel: Self = this.set("nestingLevel", js.undefined)
  }
  
}

