package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertInlineImageRequest extends js.Object {
  var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var objectSize: js.UndefOr[Size] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object InsertInlineImageRequest {
  @scala.inline
  def apply(
    endOfSegmentLocation: EndOfSegmentLocation = null,
    location: Location = null,
    objectSize: Size = null,
    uri: String = null
  ): InsertInlineImageRequest = {
    val __obj = js.Dynamic.literal()
    if (endOfSegmentLocation != null) __obj.updateDynamic("endOfSegmentLocation")(endOfSegmentLocation.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (objectSize != null) __obj.updateDynamic("objectSize")(objectSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertInlineImageRequest]
  }
}

