package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImageResponse extends js.Object {
  /** The object ID of the created image. */
  var objectId: js.UndefOr[String] = js.undefined
}

object CreateImageResponse {
  @scala.inline
  def apply(objectId: String = null): CreateImageResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageResponse]
  }
}

