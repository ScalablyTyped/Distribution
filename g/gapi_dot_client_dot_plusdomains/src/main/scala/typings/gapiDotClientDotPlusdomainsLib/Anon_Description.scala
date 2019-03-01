package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /** Potential name of the thumbnail. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Image resource. */
  var image: js.UndefOr[Anon_Height] = js.undefined
  /** URL of the webpage containing the image. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(description: java.lang.String = null, image: Anon_Height = null, url: java.lang.String = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (image != null) __obj.updateDynamic("image")(image)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Description]
  }
}

