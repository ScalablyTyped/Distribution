package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTextRequest extends js.Object {
  var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object InsertTextRequest {
  @scala.inline
  def apply(endOfSegmentLocation: EndOfSegmentLocation = null, location: Location = null, text: String = null): InsertTextRequest = {
    val __obj = js.Dynamic.literal()
    if (endOfSegmentLocation != null) __obj.updateDynamic("endOfSegmentLocation")(endOfSegmentLocation.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTextRequest]
  }
}

