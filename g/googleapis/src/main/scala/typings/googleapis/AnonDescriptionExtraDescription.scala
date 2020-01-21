package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescriptionExtraDescription extends js.Object {
  var description: js.UndefOr[String] = js.native
  var extraDescription: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnonDescriptionExtraDescription {
  @scala.inline
  def apply(description: String = null, extraDescription: String = null, url: String = null): AnonDescriptionExtraDescription = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extraDescription != null) __obj.updateDynamic("extraDescription")(extraDescription.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionExtraDescription]
  }
}

