package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  /** The display name. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The identifier of the Post creator. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The Post author's avatar. */
  var image: js.UndefOr[Anon_Url] = js.undefined
  /** The URL of the Post creator's Profile page. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DisplayName {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    image: Anon_Url = null,
    url: java.lang.String = null
  ): Anon_DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

