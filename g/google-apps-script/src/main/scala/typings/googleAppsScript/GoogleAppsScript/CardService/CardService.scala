package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CardService provides the ability to create generic cards used across different Google
  * extensibility products, such as Gmail add-ons.
  *
  * Currently you can only use this service to construct Gmail add-ons.
  *
  *     return CardService.newCardBuilder()
  *              .setHeader(CardService.newCardHeader().setTitle("CardTitle"))
  *              .build();
  *
  * Or you can return multiple Cards like so:
  *
  *     return [
  *       CardService.newCardBuilder().build(),
  *       CardService.newCardBuilder().build(),
  *       CardService.newCardBuilder().build()
  *     ]
  *
  * The following shows how you could define a card with a header, text, an image and a menu item:
  *
  *     function createWidgetDemoCard() {
  *       return CardService
  *          .newCardBuilder()
  *          .setHeader(
  *              CardService.newCardHeader()
  *                  .setTitle('Widget demonstration')
  *                  .setSubtitle('Check out these widgets')
  *                  .setImageStyle(CardService.ImageStyle.SQUARE)
  *                  .setImageUrl(
  *                      'https://www.example.com/images/headerImage.png'))
  *          .addSection(
  *               CardService.newCardSection()
  *                   .setHeader('Simple widgets')  // optional
  *                   .addWidget(CardService.newTextParagraph().setText(
  *                       'These widgets are display-only. ' +
  *                       'A text paragraph can have multiple lines and ' +
  *                       'formatting.'))
  *                   .addWidget(CardService.newImage().setImageUrl(
  *                       'https://www.example.com/images/mapsImage.png')))
  *          .addCardAction(CardService.newCardAction().setText('Gmail').setOpenLink(
  *              CardService.newOpenLink().setUrl('https://mail.google.com/mail')))
  *          .build();
  *     }
  */
trait CardService extends js.Object {
  var ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any
  var ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any
  var Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any
  var ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any
  var LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any
  var OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any
  var OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any
  var SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any
  var TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any
  var UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any
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
  def newUpdateDraftActionResponseBuilder(): UpdateDraftActionResponseBuilder
  def newUpdateDraftBodyAction(): UpdateDraftBodyAction
}

object CardService {
  @scala.inline
  def apply(
    ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any,
    ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any,
    Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any,
    ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any,
    LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any,
    OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any,
    OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any,
    SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any,
    TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any,
    UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any,
    newAction: () => Action,
    newActionResponseBuilder: () => ActionResponseBuilder,
    newAuthorizationAction: () => AuthorizationAction,
    newAuthorizationException: () => AuthorizationException,
    newButtonSet: () => ButtonSet,
    newCardAction: () => CardAction,
    newCardBuilder: () => CardBuilder,
    newCardHeader: () => CardHeader,
    newCardSection: () => CardSection,
    newComposeActionResponseBuilder: () => ComposeActionResponseBuilder,
    newImage: () => Image,
    newImageButton: () => ImageButton,
    newKeyValue: () => KeyValue,
    newNavigation: () => Navigation,
    newNotification: () => Notification,
    newOpenLink: () => OpenLink,
    newSelectionInput: () => SelectionInput,
    newSuggestions: () => Suggestions,
    newSuggestionsResponseBuilder: () => SuggestionsResponseBuilder,
    newSwitch: () => Switch,
    newTextButton: () => TextButton,
    newTextInput: () => TextInput,
    newTextParagraph: () => TextParagraph,
    newUniversalActionResponseBuilder: () => UniversalActionResponseBuilder,
    newUpdateDraftActionResponseBuilder: () => UpdateDraftActionResponseBuilder,
    newUpdateDraftBodyAction: () => UpdateDraftBodyAction
  ): CardService = {
    val __obj = js.Dynamic.literal(ComposedEmailType = ComposedEmailType.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], ImageStyle = ImageStyle.asInstanceOf[js.Any], LoadIndicator = LoadIndicator.asInstanceOf[js.Any], OnClose = OnClose.asInstanceOf[js.Any], OpenAs = OpenAs.asInstanceOf[js.Any], SelectionInputType = SelectionInputType.asInstanceOf[js.Any], TextButtonStyle = TextButtonStyle.asInstanceOf[js.Any], UpdateDraftBodyType = UpdateDraftBodyType.asInstanceOf[js.Any], newAction = js.Any.fromFunction0(newAction), newActionResponseBuilder = js.Any.fromFunction0(newActionResponseBuilder), newAuthorizationAction = js.Any.fromFunction0(newAuthorizationAction), newAuthorizationException = js.Any.fromFunction0(newAuthorizationException), newButtonSet = js.Any.fromFunction0(newButtonSet), newCardAction = js.Any.fromFunction0(newCardAction), newCardBuilder = js.Any.fromFunction0(newCardBuilder), newCardHeader = js.Any.fromFunction0(newCardHeader), newCardSection = js.Any.fromFunction0(newCardSection), newComposeActionResponseBuilder = js.Any.fromFunction0(newComposeActionResponseBuilder), newImage = js.Any.fromFunction0(newImage), newImageButton = js.Any.fromFunction0(newImageButton), newKeyValue = js.Any.fromFunction0(newKeyValue), newNavigation = js.Any.fromFunction0(newNavigation), newNotification = js.Any.fromFunction0(newNotification), newOpenLink = js.Any.fromFunction0(newOpenLink), newSelectionInput = js.Any.fromFunction0(newSelectionInput), newSuggestions = js.Any.fromFunction0(newSuggestions), newSuggestionsResponseBuilder = js.Any.fromFunction0(newSuggestionsResponseBuilder), newSwitch = js.Any.fromFunction0(newSwitch), newTextButton = js.Any.fromFunction0(newTextButton), newTextInput = js.Any.fromFunction0(newTextInput), newTextParagraph = js.Any.fromFunction0(newTextParagraph), newUniversalActionResponseBuilder = js.Any.fromFunction0(newUniversalActionResponseBuilder), newUpdateDraftActionResponseBuilder = js.Any.fromFunction0(newUpdateDraftActionResponseBuilder), newUpdateDraftBodyAction = js.Any.fromFunction0(newUpdateDraftBodyAction))
  
    __obj.asInstanceOf[CardService]
  }
}

