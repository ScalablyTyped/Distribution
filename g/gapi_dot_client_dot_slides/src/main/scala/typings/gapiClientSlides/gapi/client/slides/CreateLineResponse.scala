package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLineResponse extends js.Object {
  /** The object ID of the created line. */
  var objectId: js.UndefOr[String] = js.undefined
}

object CreateLineResponse {
  @scala.inline
  def apply(objectId: String = null): CreateLineResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLineResponse]
  }
}

