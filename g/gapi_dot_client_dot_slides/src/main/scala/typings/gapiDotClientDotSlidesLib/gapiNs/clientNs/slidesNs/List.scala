package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  /** The ID of the list. */
  var listId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A map of nesting levels to the properties of bullets at the associated
    * level. A list has at most nine levels of nesting, so the possible values
    * for the keys of this map are 0 through 8, inclusive.
    */
  var nestingLevel: js.UndefOr[stdLib.Record[java.lang.String, NestingLevel]] = js.undefined
}

object List {
  @scala.inline
  def apply(
    listId: java.lang.String = null,
    nestingLevel: stdLib.Record[java.lang.String, NestingLevel] = null
  ): List = {
    val __obj = js.Dynamic.literal()
    if (listId != null) __obj.updateDynamic("listId")(listId)
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel)
    __obj.asInstanceOf[List]
  }
}

