package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DescriptionExtraDescription extends js.Object {
  var description: js.UndefOr[String] = js.native
  var extraDescription: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object Anon_DescriptionExtraDescription {
  @scala.inline
  def apply(description: String = null, extraDescription: String = null, url: String = null): Anon_DescriptionExtraDescription = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extraDescription != null) __obj.updateDynamic("extraDescription")(extraDescription.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionExtraDescription]
  }
}

