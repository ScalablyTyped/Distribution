package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImageRequest extends js.Object {
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object CreateImageRequest {
  @scala.inline
  def apply(elementProperties: PageElementProperties = null, objectId: String = null, url: String = null): CreateImageRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CreateImageRequest]
  }
}

