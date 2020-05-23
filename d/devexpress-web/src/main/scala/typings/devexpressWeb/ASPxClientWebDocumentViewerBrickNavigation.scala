package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientWebDocumentViewerBrickNavigation extends js.Object {
  var drillDownKey: String
  var target: String
  var url: String
}

object ASPxClientWebDocumentViewerBrickNavigation {
  @scala.inline
  def apply(drillDownKey: String, target: String, url: String): ASPxClientWebDocumentViewerBrickNavigation = {
    val __obj = js.Dynamic.literal(drillDownKey = drillDownKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerBrickNavigation]
  }
}

