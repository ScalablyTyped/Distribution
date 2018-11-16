package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CardService extends js.Object {
  var ComposedEmailType: js.Any
  var Icon: js.Any
  var ImageStyle: js.Any
  var LoadIndicator: js.Any
  var NotificationType: js.Any
  var OnClose: js.Any
  var OpenAs: js.Any
  var SelectionInputType: js.Any
  def newAction(): Action
  def newActionResponseBuilder(): ActionResponseBuilder
  def newAuthorizationAction(): AuthorizationAction
  def newAuthorizationException(): AuthorizationException
  def newButtonSet(): ButtonSet
  def newCardAction(): CardAction
  def newCardBuilder(): CardBuilder
  def newCardHeader(): CardHeader
  def newCardSection(): CardSection
  def newComposeActionResponseBuilder(): ComposeActionResponseBuilder
  def newImage(): Image
  def newImageButton(): ImageButton
  def newKeyValue(): KeyValue
  def newNavigation(): Navigation
  def newNotification(): Notification
  def newOpenLink(): OpenLink
  def newSelectionInput(): SelectionInput
  def newSuggestions(): Suggestions
  def newSuggestionsResponseBuilder(): SuggestionsResponseBuilder
  def newSwitch(): Switch
  def newTextButton(): TextButton
  def newTextInput(): TextInput
  def newTextParagraph(): TextParagraph
  def newUniversalActionResponseBuilder(): UniversalActionResponseBuilder
}

