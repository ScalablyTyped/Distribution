package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSlideRequest extends js.Object {
  var insertionIndex: js.UndefOr[scala.Double] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var placeholderIdMappings: js.UndefOr[js.Array[LayoutPlaceholderIdMapping]] = js.undefined
  var slideLayoutReference: js.UndefOr[LayoutReference] = js.undefined
}

object CreateSlideRequest {
  @scala.inline
  def apply(
    insertionIndex: scala.Int | scala.Double = null,
    objectId: java.lang.String = null,
    placeholderIdMappings: js.Array[LayoutPlaceholderIdMapping] = null,
    slideLayoutReference: LayoutReference = null
  ): CreateSlideRequest = {
    val __obj = js.Dynamic.literal()
    if (insertionIndex != null) __obj.updateDynamic("insertionIndex")(insertionIndex.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (placeholderIdMappings != null) __obj.updateDynamic("placeholderIdMappings")(placeholderIdMappings)
    if (slideLayoutReference != null) __obj.updateDynamic("slideLayoutReference")(slideLayoutReference)
    __obj.asInstanceOf[CreateSlideRequest]
  }
}

