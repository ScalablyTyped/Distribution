package typings.gapiDotClientDotPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  /** The author's name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** ID of the author. */
  var id: js.UndefOr[String] = js.undefined
  /** The author's Google profile image. */
  var image: js.UndefOr[Anon_Url] = js.undefined
  /** A link to the author's Google profile. */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_DisplayName {
  @scala.inline
  def apply(displayName: String = null, id: String = null, image: Anon_Url = null, url: String = null): Anon_DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

