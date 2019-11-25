package typings.gapiDotClientDotAdsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Family extends js.Object {
  /** The family of the font. */
  var family: js.UndefOr[String] = js.undefined
  /** The size of the font. */
  var size: js.UndefOr[String] = js.undefined
}

object Anon_Family {
  @scala.inline
  def apply(family: String = null, size: String = null): Anon_Family = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Family]
  }
}

