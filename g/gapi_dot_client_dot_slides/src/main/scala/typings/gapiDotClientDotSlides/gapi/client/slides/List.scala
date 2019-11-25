package typings.gapiDotClientDotSlides.gapi.client.slides

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  /** The ID of the list. */
  var listId: js.UndefOr[String] = js.undefined
  /**
    * A map of nesting levels to the properties of bullets at the associated
    * level. A list has at most nine levels of nesting, so the possible values
    * for the keys of this map are 0 through 8, inclusive.
    */
  var nestingLevel: js.UndefOr[Record[String, NestingLevel]] = js.undefined
}

object List {
  @scala.inline
  def apply(listId: String = null, nestingLevel: Record[String, NestingLevel] = null): List = {
    val __obj = js.Dynamic.literal()
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

