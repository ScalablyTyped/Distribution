package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsDefault extends js.Object {
  /** Whether the person's profile photo is the default one */
  var isDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The URL of the person's profile photo. To resize the image and crop it to a square, append the query string ?sz=x, where x is the dimension in pixels
    * of each side.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_IsDefault {
  @scala.inline
  def apply(isDefault: js.UndefOr[scala.Boolean] = js.undefined, url: java.lang.String = null): Anon_IsDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_IsDefault]
  }
}

