package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedPositionedObjectProperties extends js.Object {
  var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.undefined
  var positionedObjectPropertiesSuggestionState: js.UndefOr[PositionedObjectPropertiesSuggestionState] = js.undefined
}

object SuggestedPositionedObjectProperties {
  @scala.inline
  def apply(
    positionedObjectProperties: PositionedObjectProperties = null,
    positionedObjectPropertiesSuggestionState: PositionedObjectPropertiesSuggestionState = null
  ): SuggestedPositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (positionedObjectProperties != null) __obj.updateDynamic("positionedObjectProperties")(positionedObjectProperties)
    if (positionedObjectPropertiesSuggestionState != null) __obj.updateDynamic("positionedObjectPropertiesSuggestionState")(positionedObjectPropertiesSuggestionState)
    __obj.asInstanceOf[SuggestedPositionedObjectProperties]
  }
}

