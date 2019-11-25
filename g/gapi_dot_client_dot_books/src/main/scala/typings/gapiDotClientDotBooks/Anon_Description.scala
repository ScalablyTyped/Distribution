package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /** Name of the source. */
  var description: js.UndefOr[String] = js.undefined
  /** Extra text about the source of the review. */
  var extraDescription: js.UndefOr[String] = js.undefined
  /** URL of the source of the review. */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(description: String = null, extraDescription: String = null, url: String = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extraDescription != null) __obj.updateDynamic("extraDescription")(extraDescription.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Description]
  }
}

