package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageElementProperties extends js.Object {
  // The object ID of the page where the element is located.
  var page_object_id: java.lang.String
  // The size of the element.
  var size: Size
  // The transform for the element.
  var transform: AffineTransform
}

object PageElementProperties {
  @scala.inline
  def apply(page_object_id: java.lang.String, size: Size, transform: AffineTransform): PageElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("page_object_id")(page_object_id)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[PageElementProperties]
  }
}

