package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSlideResponse extends js.Object {
  /** The object ID of the created slide. */
  var objectId: js.UndefOr[String] = js.undefined
}

object CreateSlideResponse {
  @scala.inline
  def apply(objectId: String = null): CreateSlideResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[CreateSlideResponse]
  }
}

