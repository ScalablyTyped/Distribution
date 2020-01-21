package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedObjectBorderSuggestionState extends js.Object {
  var colorSuggested: js.UndefOr[Boolean] = js.undefined
  var dashStyleSuggested: js.UndefOr[Boolean] = js.undefined
  var propertyStateSuggested: js.UndefOr[Boolean] = js.undefined
  var widthSuggested: js.UndefOr[Boolean] = js.undefined
}

object EmbeddedObjectBorderSuggestionState {
  @scala.inline
  def apply(
    colorSuggested: js.UndefOr[Boolean] = js.undefined,
    dashStyleSuggested: js.UndefOr[Boolean] = js.undefined,
    propertyStateSuggested: js.UndefOr[Boolean] = js.undefined,
    widthSuggested: js.UndefOr[Boolean] = js.undefined
  ): EmbeddedObjectBorderSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorSuggested)) __obj.updateDynamic("colorSuggested")(colorSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(dashStyleSuggested)) __obj.updateDynamic("dashStyleSuggested")(dashStyleSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(propertyStateSuggested)) __obj.updateDynamic("propertyStateSuggested")(propertyStateSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(widthSuggested)) __obj.updateDynamic("widthSuggested")(widthSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedObjectBorderSuggestionState]
  }
}

