package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerInfo extends js.Object {
  /**
    * URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples:
    * "gcr.io/my-project/image:tag" or "gcr.io/my-project/image@digest"
    */
  var image: js.UndefOr[String] = js.undefined
}

object ContainerInfo {
  @scala.inline
  def apply(image: String = null): ContainerInfo = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerInfo]
  }
}

