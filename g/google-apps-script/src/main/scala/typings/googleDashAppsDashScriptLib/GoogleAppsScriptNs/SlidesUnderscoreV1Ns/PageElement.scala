package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageElement extends js.Object {
  // The description of the page element. Combined with title to display alt
  // text.
  var description: java.lang.String
  // The kind of element that this PageElement represents. Each message
  // contains any properties that are specific to that kind of page element.
  var element_kind: googleDashAppsDashScriptLib.Anon_Elementgroup
  // The object ID for this page element. Object IDs used by
  // Page and PageElement share the same namespace.
  var object_id: java.lang.String
  // The size of the page element.
  var size: Size
  // The title of the page element. Combined with description to display alt
  // text.
  var title: java.lang.String
  // The transform of the page element.
  //
  // The visual appearance of the page element is determined by its absolute
  // transform. To compute the absolute transform, preconcatenate a page
  // element's transform with the transforms of all of its parent groups. If the
  // page element is not in a group, its absolute transform is the same as the
  // value in this field.
  //
  // The initial transform for the newly created Group is always the identity transform.
  var transform: AffineTransform
}

object PageElement {
  @scala.inline
  def apply(
    description: java.lang.String,
    element_kind: googleDashAppsDashScriptLib.Anon_Elementgroup,
    object_id: java.lang.String,
    size: Size,
    title: java.lang.String,
    transform: AffineTransform
  ): PageElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("element_kind")(element_kind)
    __obj.updateDynamic("object_id")(object_id)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[PageElement]
  }
}

