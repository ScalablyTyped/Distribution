package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVideoRequest extends js.Object {
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object CreateVideoRequest {
  @scala.inline
  def apply(
    elementProperties: PageElementProperties = null,
    id: String = null,
    objectId: String = null,
    source: String = null
  ): CreateVideoRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVideoRequest]
  }
}

