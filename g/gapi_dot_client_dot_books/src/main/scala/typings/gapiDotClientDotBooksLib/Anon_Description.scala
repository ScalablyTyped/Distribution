package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /** Name of the source. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Extra text about the source of the review. */
  var extraDescription: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the source of the review. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    extraDescription: java.lang.String = null,
    url: java.lang.String = null
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (extraDescription != null) __obj.updateDynamic("extraDescription")(extraDescription)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Description]
  }
}

