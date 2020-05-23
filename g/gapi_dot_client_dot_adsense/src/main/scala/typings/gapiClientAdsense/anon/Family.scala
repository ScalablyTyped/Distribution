package typings.gapiClientAdsense.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Family extends js.Object {
  /** The family of the font. */
  var family: js.UndefOr[String] = js.undefined
  /** The size of the font. */
  var size: js.UndefOr[String] = js.undefined
}

object Family {
  @scala.inline
  def apply(family: String = null, size: String = null): Family = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Family]
  }
}

