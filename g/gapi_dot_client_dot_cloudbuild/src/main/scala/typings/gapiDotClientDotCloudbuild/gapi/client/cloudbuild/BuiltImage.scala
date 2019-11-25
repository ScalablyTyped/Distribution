package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltImage extends js.Object {
  /** Docker Registry 2.0 digest. */
  var digest: js.UndefOr[String] = js.undefined
  /**
    * Name used to push the container image to Google Container Registry, as
    * presented to `docker push`.
    */
  var name: js.UndefOr[String] = js.undefined
}

object BuiltImage {
  @scala.inline
  def apply(digest: String = null, name: String = null): BuiltImage = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltImage]
  }
}

