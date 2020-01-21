package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  /** Name of the source. */
  var description: js.UndefOr[String] = js.undefined
  /** Extra text about the source of the review. */
  var extraDescription: js.UndefOr[String] = js.undefined
  /** URL of the source of the review. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonDescription {
  @scala.inline
  def apply(description: String = null, extraDescription: String = null, url: String = null): AnonDescription = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extraDescription != null) __obj.updateDynamic("extraDescription")(extraDescription.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

