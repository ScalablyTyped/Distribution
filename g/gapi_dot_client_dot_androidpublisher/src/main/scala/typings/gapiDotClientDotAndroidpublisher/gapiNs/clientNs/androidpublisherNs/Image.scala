package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /** A unique id representing this image. */
  var id: js.UndefOr[String] = js.undefined
  /** A sha1 hash of the image that was uploaded. */
  var sha1: js.UndefOr[String] = js.undefined
  /** A URL that will serve a preview of the image. */
  var url: js.UndefOr[String] = js.undefined
}

object Image {
  @scala.inline
  def apply(id: String = null, sha1: String = null, url: String = null): Image = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (sha1 != null) __obj.updateDynamic("sha1")(sha1)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Image]
  }
}

