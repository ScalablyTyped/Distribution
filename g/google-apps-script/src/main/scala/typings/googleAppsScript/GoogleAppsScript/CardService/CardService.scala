package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait CardService extends StObject {
  
  var ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any = js.native
  
  var ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any = js.native
  
  var Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any = js.native
  
  var ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any = js.native
  
  var LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any = js.native
  
  var OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any = js.native
  
  var OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any = js.native
  
  var SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any = js.native
  
  var SwitchControlType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ js.Any = js.native
  
  var TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any = js.native
  
  var UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any = js.native
  
  def newAction(): Action = js.native
  
  def newActionResponseBuilder(): ActionResponseBuilder = js.native
  
  def newAuthorizationAction(): AuthorizationAction = js.native
  
  def newAuthorizationException(): AuthorizationException = js.native
  
  def newButtonSet(): ButtonSet = js.native
  
  def newCalendarEventActionResponseBuilder(): CalendarEventActionResponseBuilder = js.native
  
  def newCardAction(): CardAction = js.native
  
  def newCardBuilder(): CardBuilder = js.native
  
  def newCardHeader(): CardHeader = js.native
  
  def newCardSection(): CardSection = js.native
  
  def newComposeActionResponseBuilder(): ComposeActionResponseBuilder = js.native
  
  def newDatePicker(): DatePicker = js.native
  
  def newDateTimePicker(): DateTimePicker = js.native
  
  def newDriveItemsSelectedActionResponseBuilder(): DriveItemsSelectedActionResponseBuilder = js.native
  
  def newFixedFooter(): FixedFooter = js.native
  
  def newImage(): Image = js.native
  
  def newImageButton(): ImageButton = js.native
  
  def newKeyValue(): KeyValue = js.native
  
  def newNavigation(): Navigation = js.native
  
  def newNotification(): Notification = js.native
  
  def newOpenLink(): OpenLink = js.native
  
  def newSelectionInput(): SelectionInput = js.native
  
  def newSuggestions(): Suggestions = js.native
  
  def newSuggestionsResponseBuilder(): SuggestionsResponseBuilder = js.native
  
  def newSwitch(): Switch = js.native
  
  def newTextButton(): TextButton = js.native
  
  def newTextInput(): TextInput = js.native
  
  def newTextParagraph(): TextParagraph = js.native
  
  def newUniversalActionResponseBuilder(): UniversalActionResponseBuilder = js.native
  
  def newUpdateDraftActionResponseBuilder(): UpdateDraftActionResponseBuilder = js.native
  
  def newUpdateDraftBodyAction(): UpdateDraftBodyAction = js.native
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
  
  @scala.inline
  implicit class CardServiceMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.CardService.CardService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComposedEmailType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ js.Any
    ): Self = StObject.set(x, "ComposedEmailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ js.Any): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ js.Any): Self = StObject.set(x, "ImageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadIndicator(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ js.Any
    ): Self = StObject.set(x, "LoadIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewAction(value: () => Action): Self = StObject.set(x, "newAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewActionResponseBuilder(value: () => ActionResponseBuilder): Self = StObject.set(x, "newActionResponseBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAuthorizationAction(value: () => AuthorizationAction): Self = StObject.set(x, "newAuthorizationAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAuthorizationException(value: () => AuthorizationException): Self = StObject.set(x, "newAuthorizationException", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewButtonSet(value: () => ButtonSet): Self = StObject.set(x, "newButtonSet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCalendarEventActionResponseBuilder(value: () => CalendarEventActionResponseBuilder): Self = StObject.set(x, "newCalendarEventActionResponseBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCardAction(value: () => CardAction): Self = StObject.set(x, "newCardAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCardBuilder(value: () => CardBuilder): Self = StObject.set(x, "newCardBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCardHeader(value: () => CardHeader): Self = StObject.set(x, "newCardHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCardSection(value: () => CardSection): Self = StObject.set(x, "newCardSection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewComposeActionResponseBuilder(value: () => ComposeActionResponseBuilder): Self = StObject.set(x, "newComposeActionResponseBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDatePicker(value: () => DatePicker): Self = StObject.set(x, "newDatePicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDateTimePicker(value: () => DateTimePicker): Self = StObject.set(x, "newDateTimePicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDriveItemsSelectedActionResponseBuilder(value: () => DriveItemsSelectedActionResponseBuilder): Self = StObject.set(x, "newDriveItemsSelectedActionResponseBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFixedFooter(value: () => FixedFooter): Self = StObject.set(x, "newFixedFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewImage(value: () => Image): Self = StObject.set(x, "newImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewImageButton(value: () => ImageButton): Self = StObject.set(x, "newImageButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewKeyValue(value: () => KeyValue): Self = StObject.set(x, "newKeyValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewNavigation(value: () => Navigation): Self = StObject.set(x, "newNavigation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewNotification(value: () => Notification): Self = StObject.set(x, "newNotification", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOpenLink(value: () => OpenLink): Self = StObject.set(x, "newOpenLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSelectionInput(value: () => SelectionInput): Self = StObject.set(x, "newSelectionInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSuggestions(value: () => Suggestions): Self = StObject.set(x, "newSuggestions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSuggestionsResponseBuilder(value: () => SuggestionsResponseBuilder): Self = StObject.set(x, "newSuggestionsResponseBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSwitch(value: () => Switch): Self = StObject.set(x, "newSwitch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextButton(value: () => TextButton): Self = StObject.set(x, "newTextButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextInput(value: () => TextInput): Self = StObject.set(x, "newTextInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextParagraph(value: () => TextParagraph): Self = StObject.set(x, "newTextParagraph", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUniversalActionResponseBuilder(value: () => UniversalActionResponseBuilder): Self = StObject.set(x, "newUniversalActionResponseBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateDraftActionResponseBuilder(value: () => UpdateDraftActionResponseBuilder): Self = StObject.set(x, "newUpdateDraftActionResponseBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateDraftBodyAction(value: () => UpdateDraftBodyAction): Self = StObject.set(x, "newUpdateDraftBodyAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClose(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ js.Any): Self = StObject.set(x, "OnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenAs(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ js.Any): Self = StObject.set(x, "OpenAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionInputType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ js.Any
    ): Self = StObject.set(x, "SelectionInputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchControlType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ js.Any
    ): Self = StObject.set(x, "SwitchControlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextButtonStyle(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ js.Any
    ): Self = StObject.set(x, "TextButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDraftBodyType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ js.Any
    ): Self = StObject.set(x, "UpdateDraftBodyType", value.asInstanceOf[js.Any])
  }
}
