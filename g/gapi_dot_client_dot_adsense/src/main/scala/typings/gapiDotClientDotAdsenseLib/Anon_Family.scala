package typings
package gapiDotClientDotAdsenseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Family extends js.Object {
  /** The family of the font. */
  var family: js.UndefOr[java.lang.String] = js.undefined
  /** The size of the font. */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Family {
  @scala.inline
  def apply(family: java.lang.String = null, size: java.lang.String = null): Anon_Family = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Family]
  }
}

