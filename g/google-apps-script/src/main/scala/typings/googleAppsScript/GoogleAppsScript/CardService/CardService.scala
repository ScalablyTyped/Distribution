package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait CardService extends StObject {
  
  var ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any
  
  var ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any
  
  var Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any
  
  var ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any
  
  var LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any
  
  var OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any
  
  var OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any
  
  var SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any
  
  var SwitchControlType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ js.Any
  
  var TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any
  
  var UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any
  
  def newAction(): Action
  
  def newActionResponseBuilder(): ActionResponseBuilder
  
  def newAuthorizationAction(): AuthorizationAction
  
  def newAuthorizationException(): AuthorizationException
  
  def newButtonSet(): ButtonSet
  
  def newCalendarEventActionResponseBuilder(): CalendarEventActionResponseBuilder
  
  def newCardAction(): CardAction
  
  def newCardBuilder(): CardBuilder
  
  def newCardHeader(): CardHeader
  
  def newCardSection(): CardSection
  
  def newComposeActionResponseBuilder(): ComposeActionResponseBuilder
  
  def newDatePicker(): DatePicker
  
  def newDateTimePicker(): DateTimePicker
  
  def newDriveItemsSelectedActionResponseBuilder(): DriveItemsSelectedActionResponseBuilder
  
  def newFixedFooter(): FixedFooter
  
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
  
  inline def apply(
    ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any,
    ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any,
    Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any,
    ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any,
    LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any,
    OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any,
    OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any,
    SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any,
    SwitchControlType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ js.Any,
    TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any,
    UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any,
    newAction: () => Action,
    newActionResponseBuilder: () => ActionResponseBuilder,
    newAuthorizationAction: () => AuthorizationAction,
    newAuthorizationException: () => AuthorizationException,
    newButtonSet: () => ButtonSet,
    newCalendarEventActionResponseBuilder: () => CalendarEventActionResponseBuilder,
    newCardAction: () => CardAction,
    newCardBuilder: () => CardBuilder,
    newCardHeader: () => CardHeader,
    newCardSection: () => CardSection,
    newComposeActionResponseBuilder: () => ComposeActionResponseBuilder,
    newDatePicker: () => DatePicker,
    newDateTimePicker: () => DateTimePicker,
    newDriveItemsSelectedActionResponseBuilder: () => DriveItemsSelectedActionResponseBuilder,
    newFixedFooter: () => FixedFooter,
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
  ): typings.googleAppsScript.GoogleAppsScript.CardService.CardService = {
    val __obj = js.Dynamic.literal(ComposedEmailType = ComposedEmailType.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], ImageStyle = ImageStyle.asInstanceOf[js.Any], LoadIndicator = LoadIndicator.asInstanceOf[js.Any], OnClose = OnClose.asInstanceOf[js.Any], OpenAs = OpenAs.asInstanceOf[js.Any], SelectionInputType = SelectionInputType.asInstanceOf[js.Any], SwitchControlType = SwitchControlType.asInstanceOf[js.Any], TextButtonStyle = TextButtonStyle.asInstanceOf[js.Any], UpdateDraftBodyType = UpdateDraftBodyType.asInstanceOf[js.Any], newAction = js.Any.fromFunction0(newAction), newActionResponseBuilder = js.Any.fromFunction0(newActionResponseBuilder), newAuthorizationAction = js.Any.fromFunction0(newAuthorizationAction), newAuthorizationException = js.Any.fromFunction0(newAuthorizationException), newButtonSet = js.Any.fromFunction0(newButtonSet), newCalendarEventActionResponseBuilder = js.Any.fromFunction0(newCalendarEventActionResponseBuilder), newCardAction = js.Any.fromFunction0(newCardAction), newCardBuilder = js.Any.fromFunction0(newCardBuilder), newCardHeader = js.Any.fromFunction0(newCardHeader), newCardSection = js.Any.fromFunction0(newCardSection), newComposeActionResponseBuilder = js.Any.fromFunction0(newComposeActionResponseBuilder), newDatePicker = js.Any.fromFunction0(newDatePicker), newDateTimePicker = js.Any.fromFunction0(newDateTimePicker), newDriveItemsSelectedActionResponseBuilder = js.Any.fromFunction0(newDriveItemsSelectedActionResponseBuilder), newFixedFooter = js.Any.fromFunction0(newFixedFooter), newImage = js.Any.fromFunction0(newImage), newImageButton = js.Any.fromFunction0(newImageButton), newKeyValue = js.Any.fromFunction0(newKeyValue), newNavigation = js.Any.fromFunction0(newNavigation), newNotification = js.Any.fromFunction0(newNotification), newOpenLink = js.Any.fromFunction0(newOpenLink), newSelectionInput = js.Any.fromFunction0(newSelectionInput), newSuggestions = js.Any.fromFunction0(newSuggestions), newSuggestionsResponseBuilder = js.Any.fromFunction0(newSuggestionsResponseBuilder), newSwitch = js.Any.fromFunction0(newSwitch), newTextButton = js.Any.fromFunction0(newTextButton), newTextInput = js.Any.fromFunction0(newTextInput), newTextParagraph = js.Any.fromFunction0(newTextParagraph), newUniversalActionResponseBuilder = js.Any.fromFunction0(newUniversalActionResponseBuilder), newUpdateDraftActionResponseBuilder = js.Any.fromFunction0(newUpdateDraftActionResponseBuilder), newUpdateDraftBodyAction = js.Any.fromFunction0(newUpdateDraftBodyAction))
    __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.CardService.CardService]
  }
  
  extension [Self <: typings.googleAppsScript.GoogleAppsScript.CardService.CardService](x: Self) {
    
    inline def setComposedEmailType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any
    ): Self = StObject.set(x, "ComposedEmailType", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setImageStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any): Self = StObject.set(x, "ImageStyle", value.asInstanceOf[js.Any])
    
    inline def setLoadIndicator(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any
    ): Self = StObject.set(x, "LoadIndicator", value.asInstanceOf[js.Any])
    
    inline def setNewAction(value: () => Action): Self = StObject.set(x, "newAction", js.Any.fromFunction0(value))
    
    inline def setNewActionResponseBuilder(value: () => ActionResponseBuilder): Self = StObject.set(x, "newActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewAuthorizationAction(value: () => AuthorizationAction): Self = StObject.set(x, "newAuthorizationAction", js.Any.fromFunction0(value))
    
    inline def setNewAuthorizationException(value: () => AuthorizationException): Self = StObject.set(x, "newAuthorizationException", js.Any.fromFunction0(value))
    
    inline def setNewButtonSet(value: () => ButtonSet): Self = StObject.set(x, "newButtonSet", js.Any.fromFunction0(value))
    
    inline def setNewCalendarEventActionResponseBuilder(value: () => CalendarEventActionResponseBuilder): Self = StObject.set(x, "newCalendarEventActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewCardAction(value: () => CardAction): Self = StObject.set(x, "newCardAction", js.Any.fromFunction0(value))
    
    inline def setNewCardBuilder(value: () => CardBuilder): Self = StObject.set(x, "newCardBuilder", js.Any.fromFunction0(value))
    
    inline def setNewCardHeader(value: () => CardHeader): Self = StObject.set(x, "newCardHeader", js.Any.fromFunction0(value))
    
    inline def setNewCardSection(value: () => CardSection): Self = StObject.set(x, "newCardSection", js.Any.fromFunction0(value))
    
    inline def setNewComposeActionResponseBuilder(value: () => ComposeActionResponseBuilder): Self = StObject.set(x, "newComposeActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewDatePicker(value: () => DatePicker): Self = StObject.set(x, "newDatePicker", js.Any.fromFunction0(value))
    
    inline def setNewDateTimePicker(value: () => DateTimePicker): Self = StObject.set(x, "newDateTimePicker", js.Any.fromFunction0(value))
    
    inline def setNewDriveItemsSelectedActionResponseBuilder(value: () => DriveItemsSelectedActionResponseBuilder): Self = StObject.set(x, "newDriveItemsSelectedActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewFixedFooter(value: () => FixedFooter): Self = StObject.set(x, "newFixedFooter", js.Any.fromFunction0(value))
    
    inline def setNewImage(value: () => Image): Self = StObject.set(x, "newImage", js.Any.fromFunction0(value))
    
    inline def setNewImageButton(value: () => ImageButton): Self = StObject.set(x, "newImageButton", js.Any.fromFunction0(value))
    
    inline def setNewKeyValue(value: () => KeyValue): Self = StObject.set(x, "newKeyValue", js.Any.fromFunction0(value))
    
    inline def setNewNavigation(value: () => Navigation): Self = StObject.set(x, "newNavigation", js.Any.fromFunction0(value))
    
    inline def setNewNotification(value: () => Notification): Self = StObject.set(x, "newNotification", js.Any.fromFunction0(value))
    
    inline def setNewOpenLink(value: () => OpenLink): Self = StObject.set(x, "newOpenLink", js.Any.fromFunction0(value))
    
    inline def setNewSelectionInput(value: () => SelectionInput): Self = StObject.set(x, "newSelectionInput", js.Any.fromFunction0(value))
    
    inline def setNewSuggestions(value: () => Suggestions): Self = StObject.set(x, "newSuggestions", js.Any.fromFunction0(value))
    
    inline def setNewSuggestionsResponseBuilder(value: () => SuggestionsResponseBuilder): Self = StObject.set(x, "newSuggestionsResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewSwitch(value: () => Switch): Self = StObject.set(x, "newSwitch", js.Any.fromFunction0(value))
    
    inline def setNewTextButton(value: () => TextButton): Self = StObject.set(x, "newTextButton", js.Any.fromFunction0(value))
    
    inline def setNewTextInput(value: () => TextInput): Self = StObject.set(x, "newTextInput", js.Any.fromFunction0(value))
    
    inline def setNewTextParagraph(value: () => TextParagraph): Self = StObject.set(x, "newTextParagraph", js.Any.fromFunction0(value))
    
    inline def setNewUniversalActionResponseBuilder(value: () => UniversalActionResponseBuilder): Self = StObject.set(x, "newUniversalActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewUpdateDraftActionResponseBuilder(value: () => UpdateDraftActionResponseBuilder): Self = StObject.set(x, "newUpdateDraftActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewUpdateDraftBodyAction(value: () => UpdateDraftBodyAction): Self = StObject.set(x, "newUpdateDraftBodyAction", js.Any.fromFunction0(value))
    
    inline def setOnClose(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any): Self = StObject.set(x, "OnClose", value.asInstanceOf[js.Any])
    
    inline def setOpenAs(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any): Self = StObject.set(x, "OpenAs", value.asInstanceOf[js.Any])
    
    inline def setSelectionInputType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any
    ): Self = StObject.set(x, "SelectionInputType", value.asInstanceOf[js.Any])
    
    inline def setSwitchControlType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ js.Any
    ): Self = StObject.set(x, "SwitchControlType", value.asInstanceOf[js.Any])
    
    inline def setTextButtonStyle(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any
    ): Self = StObject.set(x, "TextButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateDraftBodyType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any
    ): Self = StObject.set(x, "UpdateDraftBodyType", value.asInstanceOf[js.Any])
  }
}
