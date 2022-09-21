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
  
  var BorderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderType */ Any
  
  var ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ Any
  
  var ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ Any
  
  var DisplayStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayStyle */ Any
  
  var GridItemLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GridItemLayout */ Any
  
  var HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ Any
  
  var Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ Any
  
  var ImageCropType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageCropType */ Any
  
  var ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ Any
  
  var LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ Any
  
  var OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ Any
  
  var OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ Any
  
  var SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ Any
  
  var SwitchControlType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ Any
  
  var TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ Any
  
  var UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ Any
  
  def newAction(): Action
  
  def newActionResponseBuilder(): ActionResponseBuilder
  
  def newAttachment(): Attachment
  
  def newAuthorizationAction(): AuthorizationAction
  
  def newAuthorizationException(): AuthorizationException
  
  /**
    * Creates a new BorderStyle.
    */
  def newBorderStyle(): BorderStyle
  
  def newButtonSet(): ButtonSet
  
  def newCalendarEventActionResponseBuilder(): CalendarEventActionResponseBuilder
  
  def newCardAction(): CardAction
  
  def newCardBuilder(): CardBuilder
  
  def newCardHeader(): CardHeader
  
  def newCardSection(): CardSection
  
  def newComposeActionResponseBuilder(): ComposeActionResponseBuilder
  
  def newDatePicker(): DatePicker
  
  def newDateTimePicker(): DateTimePicker
  
  def newDecoratedText(): DecoratedText
  
  def newDivider(): Divider
  
  def newDriveItemsSelectedActionResponseBuilder(): DriveItemsSelectedActionResponseBuilder
  
  /**
    * Creates a new EditorFileScopeActionResponseBuilder.
    */
  def newEditorFileScopeActionResponseBuilder(): EditorFileScopeActionResponseBuilder
  
  def newFixedFooter(): FixedFooter
  
  /**
    * Creates a new Grid
    */
  def newGrid(): Grid
  
  /**
    * Creates a new GridItem.
    */
  def newGridItem(): GridItem
  
  def newIconImage(): IconImage
  
  def newImage(): Image
  
  def newImageButton(): ImageButton
  
  /**
    * Creates a new ImageComponent.
    */
  def newImageComponent(): ImageComponent
  
  /**
    * Creates a new ImageCropStyle.
    */
  def newImageCropStyle(): ImageCropStyle
  
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
  
  def newTimePicker(): TimePicker
  
  def newUniversalActionResponseBuilder(): UniversalActionResponseBuilder
  
  def newUpdateDraftActionResponseBuilder(): UpdateDraftActionResponseBuilder
  
  def newUpdateDraftBccRecipientsAction(): UpdateDraftBccRecipientsAction
  
  def newUpdateDraftBodyAction(): UpdateDraftBodyAction
  
  def newUpdateDraftCcRecipientsAction(): UpdateDraftCcRecipientsAction
  
  def newUpdateDraftSubjectAction(): UpdateDraftSubjectAction
  
  def newUpdateDraftToRecipientsAction(): UpdateDraftToRecipientsAction
}
object CardService {
  
  inline def apply(
    BorderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderType */ Any,
    ComposedEmailType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ Any,
    ContentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ Any,
    DisplayStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayStyle */ Any,
    GridItemLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GridItemLayout */ Any,
    HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ Any,
    Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ Any,
    ImageCropType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageCropType */ Any,
    ImageStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ Any,
    LoadIndicator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ Any,
    OnClose: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ Any,
    OpenAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ Any,
    SelectionInputType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ Any,
    SwitchControlType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ Any,
    TextButtonStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ Any,
    UpdateDraftBodyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ Any,
    newAction: () => Action,
    newActionResponseBuilder: () => ActionResponseBuilder,
    newAttachment: () => Attachment,
    newAuthorizationAction: () => AuthorizationAction,
    newAuthorizationException: () => AuthorizationException,
    newBorderStyle: () => BorderStyle,
    newButtonSet: () => ButtonSet,
    newCalendarEventActionResponseBuilder: () => CalendarEventActionResponseBuilder,
    newCardAction: () => CardAction,
    newCardBuilder: () => CardBuilder,
    newCardHeader: () => CardHeader,
    newCardSection: () => CardSection,
    newComposeActionResponseBuilder: () => ComposeActionResponseBuilder,
    newDatePicker: () => DatePicker,
    newDateTimePicker: () => DateTimePicker,
    newDecoratedText: () => DecoratedText,
    newDivider: () => Divider,
    newDriveItemsSelectedActionResponseBuilder: () => DriveItemsSelectedActionResponseBuilder,
    newEditorFileScopeActionResponseBuilder: () => EditorFileScopeActionResponseBuilder,
    newFixedFooter: () => FixedFooter,
    newGrid: () => Grid,
    newGridItem: () => GridItem,
    newIconImage: () => IconImage,
    newImage: () => Image,
    newImageButton: () => ImageButton,
    newImageComponent: () => ImageComponent,
    newImageCropStyle: () => ImageCropStyle,
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
    newTimePicker: () => TimePicker,
    newUniversalActionResponseBuilder: () => UniversalActionResponseBuilder,
    newUpdateDraftActionResponseBuilder: () => UpdateDraftActionResponseBuilder,
    newUpdateDraftBccRecipientsAction: () => UpdateDraftBccRecipientsAction,
    newUpdateDraftBodyAction: () => UpdateDraftBodyAction,
    newUpdateDraftCcRecipientsAction: () => UpdateDraftCcRecipientsAction,
    newUpdateDraftSubjectAction: () => UpdateDraftSubjectAction,
    newUpdateDraftToRecipientsAction: () => UpdateDraftToRecipientsAction
  ): typings.googleAppsScript.GoogleAppsScript.CardService.CardService = {
    val __obj = js.Dynamic.literal(BorderType = BorderType.asInstanceOf[js.Any], ComposedEmailType = ComposedEmailType.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], GridItemLayout = GridItemLayout.asInstanceOf[js.Any], HorizontalAlignment = HorizontalAlignment.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], ImageCropType = ImageCropType.asInstanceOf[js.Any], ImageStyle = ImageStyle.asInstanceOf[js.Any], LoadIndicator = LoadIndicator.asInstanceOf[js.Any], OnClose = OnClose.asInstanceOf[js.Any], OpenAs = OpenAs.asInstanceOf[js.Any], SelectionInputType = SelectionInputType.asInstanceOf[js.Any], SwitchControlType = SwitchControlType.asInstanceOf[js.Any], TextButtonStyle = TextButtonStyle.asInstanceOf[js.Any], UpdateDraftBodyType = UpdateDraftBodyType.asInstanceOf[js.Any], newAction = js.Any.fromFunction0(newAction), newActionResponseBuilder = js.Any.fromFunction0(newActionResponseBuilder), newAttachment = js.Any.fromFunction0(newAttachment), newAuthorizationAction = js.Any.fromFunction0(newAuthorizationAction), newAuthorizationException = js.Any.fromFunction0(newAuthorizationException), newBorderStyle = js.Any.fromFunction0(newBorderStyle), newButtonSet = js.Any.fromFunction0(newButtonSet), newCalendarEventActionResponseBuilder = js.Any.fromFunction0(newCalendarEventActionResponseBuilder), newCardAction = js.Any.fromFunction0(newCardAction), newCardBuilder = js.Any.fromFunction0(newCardBuilder), newCardHeader = js.Any.fromFunction0(newCardHeader), newCardSection = js.Any.fromFunction0(newCardSection), newComposeActionResponseBuilder = js.Any.fromFunction0(newComposeActionResponseBuilder), newDatePicker = js.Any.fromFunction0(newDatePicker), newDateTimePicker = js.Any.fromFunction0(newDateTimePicker), newDecoratedText = js.Any.fromFunction0(newDecoratedText), newDivider = js.Any.fromFunction0(newDivider), newDriveItemsSelectedActionResponseBuilder = js.Any.fromFunction0(newDriveItemsSelectedActionResponseBuilder), newEditorFileScopeActionResponseBuilder = js.Any.fromFunction0(newEditorFileScopeActionResponseBuilder), newFixedFooter = js.Any.fromFunction0(newFixedFooter), newGrid = js.Any.fromFunction0(newGrid), newGridItem = js.Any.fromFunction0(newGridItem), newIconImage = js.Any.fromFunction0(newIconImage), newImage = js.Any.fromFunction0(newImage), newImageButton = js.Any.fromFunction0(newImageButton), newImageComponent = js.Any.fromFunction0(newImageComponent), newImageCropStyle = js.Any.fromFunction0(newImageCropStyle), newKeyValue = js.Any.fromFunction0(newKeyValue), newNavigation = js.Any.fromFunction0(newNavigation), newNotification = js.Any.fromFunction0(newNotification), newOpenLink = js.Any.fromFunction0(newOpenLink), newSelectionInput = js.Any.fromFunction0(newSelectionInput), newSuggestions = js.Any.fromFunction0(newSuggestions), newSuggestionsResponseBuilder = js.Any.fromFunction0(newSuggestionsResponseBuilder), newSwitch = js.Any.fromFunction0(newSwitch), newTextButton = js.Any.fromFunction0(newTextButton), newTextInput = js.Any.fromFunction0(newTextInput), newTextParagraph = js.Any.fromFunction0(newTextParagraph), newTimePicker = js.Any.fromFunction0(newTimePicker), newUniversalActionResponseBuilder = js.Any.fromFunction0(newUniversalActionResponseBuilder), newUpdateDraftActionResponseBuilder = js.Any.fromFunction0(newUpdateDraftActionResponseBuilder), newUpdateDraftBccRecipientsAction = js.Any.fromFunction0(newUpdateDraftBccRecipientsAction), newUpdateDraftBodyAction = js.Any.fromFunction0(newUpdateDraftBodyAction), newUpdateDraftCcRecipientsAction = js.Any.fromFunction0(newUpdateDraftCcRecipientsAction), newUpdateDraftSubjectAction = js.Any.fromFunction0(newUpdateDraftSubjectAction), newUpdateDraftToRecipientsAction = js.Any.fromFunction0(newUpdateDraftToRecipientsAction))
    __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.CardService.CardService]
  }
  
  extension [Self <: typings.googleAppsScript.GoogleAppsScript.CardService.CardService](x: Self) {
    
    inline def setBorderType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderType */ Any): Self = StObject.set(x, "BorderType", value.asInstanceOf[js.Any])
    
    inline def setComposedEmailType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ComposedEmailType */ Any
    ): Self = StObject.set(x, "ComposedEmailType", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ Any): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setDisplayStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayStyle */ Any): Self = StObject.set(x, "DisplayStyle", value.asInstanceOf[js.Any])
    
    inline def setGridItemLayout(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GridItemLayout */ Any): Self = StObject.set(x, "GridItemLayout", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ Any
    ): Self = StObject.set(x, "HorizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ Any): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setImageCropType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageCropType */ Any): Self = StObject.set(x, "ImageCropType", value.asInstanceOf[js.Any])
    
    inline def setImageStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageStyle */ Any): Self = StObject.set(x, "ImageStyle", value.asInstanceOf[js.Any])
    
    inline def setLoadIndicator(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadIndicator */ Any): Self = StObject.set(x, "LoadIndicator", value.asInstanceOf[js.Any])
    
    inline def setNewAction(value: () => Action): Self = StObject.set(x, "newAction", js.Any.fromFunction0(value))
    
    inline def setNewActionResponseBuilder(value: () => ActionResponseBuilder): Self = StObject.set(x, "newActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewAttachment(value: () => Attachment): Self = StObject.set(x, "newAttachment", js.Any.fromFunction0(value))
    
    inline def setNewAuthorizationAction(value: () => AuthorizationAction): Self = StObject.set(x, "newAuthorizationAction", js.Any.fromFunction0(value))
    
    inline def setNewAuthorizationException(value: () => AuthorizationException): Self = StObject.set(x, "newAuthorizationException", js.Any.fromFunction0(value))
    
    inline def setNewBorderStyle(value: () => BorderStyle): Self = StObject.set(x, "newBorderStyle", js.Any.fromFunction0(value))
    
    inline def setNewButtonSet(value: () => ButtonSet): Self = StObject.set(x, "newButtonSet", js.Any.fromFunction0(value))
    
    inline def setNewCalendarEventActionResponseBuilder(value: () => CalendarEventActionResponseBuilder): Self = StObject.set(x, "newCalendarEventActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewCardAction(value: () => CardAction): Self = StObject.set(x, "newCardAction", js.Any.fromFunction0(value))
    
    inline def setNewCardBuilder(value: () => CardBuilder): Self = StObject.set(x, "newCardBuilder", js.Any.fromFunction0(value))
    
    inline def setNewCardHeader(value: () => CardHeader): Self = StObject.set(x, "newCardHeader", js.Any.fromFunction0(value))
    
    inline def setNewCardSection(value: () => CardSection): Self = StObject.set(x, "newCardSection", js.Any.fromFunction0(value))
    
    inline def setNewComposeActionResponseBuilder(value: () => ComposeActionResponseBuilder): Self = StObject.set(x, "newComposeActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewDatePicker(value: () => DatePicker): Self = StObject.set(x, "newDatePicker", js.Any.fromFunction0(value))
    
    inline def setNewDateTimePicker(value: () => DateTimePicker): Self = StObject.set(x, "newDateTimePicker", js.Any.fromFunction0(value))
    
    inline def setNewDecoratedText(value: () => DecoratedText): Self = StObject.set(x, "newDecoratedText", js.Any.fromFunction0(value))
    
    inline def setNewDivider(value: () => Divider): Self = StObject.set(x, "newDivider", js.Any.fromFunction0(value))
    
    inline def setNewDriveItemsSelectedActionResponseBuilder(value: () => DriveItemsSelectedActionResponseBuilder): Self = StObject.set(x, "newDriveItemsSelectedActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewEditorFileScopeActionResponseBuilder(value: () => EditorFileScopeActionResponseBuilder): Self = StObject.set(x, "newEditorFileScopeActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewFixedFooter(value: () => FixedFooter): Self = StObject.set(x, "newFixedFooter", js.Any.fromFunction0(value))
    
    inline def setNewGrid(value: () => Grid): Self = StObject.set(x, "newGrid", js.Any.fromFunction0(value))
    
    inline def setNewGridItem(value: () => GridItem): Self = StObject.set(x, "newGridItem", js.Any.fromFunction0(value))
    
    inline def setNewIconImage(value: () => IconImage): Self = StObject.set(x, "newIconImage", js.Any.fromFunction0(value))
    
    inline def setNewImage(value: () => Image): Self = StObject.set(x, "newImage", js.Any.fromFunction0(value))
    
    inline def setNewImageButton(value: () => ImageButton): Self = StObject.set(x, "newImageButton", js.Any.fromFunction0(value))
    
    inline def setNewImageComponent(value: () => ImageComponent): Self = StObject.set(x, "newImageComponent", js.Any.fromFunction0(value))
    
    inline def setNewImageCropStyle(value: () => ImageCropStyle): Self = StObject.set(x, "newImageCropStyle", js.Any.fromFunction0(value))
    
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
    
    inline def setNewTimePicker(value: () => TimePicker): Self = StObject.set(x, "newTimePicker", js.Any.fromFunction0(value))
    
    inline def setNewUniversalActionResponseBuilder(value: () => UniversalActionResponseBuilder): Self = StObject.set(x, "newUniversalActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewUpdateDraftActionResponseBuilder(value: () => UpdateDraftActionResponseBuilder): Self = StObject.set(x, "newUpdateDraftActionResponseBuilder", js.Any.fromFunction0(value))
    
    inline def setNewUpdateDraftBccRecipientsAction(value: () => UpdateDraftBccRecipientsAction): Self = StObject.set(x, "newUpdateDraftBccRecipientsAction", js.Any.fromFunction0(value))
    
    inline def setNewUpdateDraftBodyAction(value: () => UpdateDraftBodyAction): Self = StObject.set(x, "newUpdateDraftBodyAction", js.Any.fromFunction0(value))
    
    inline def setNewUpdateDraftCcRecipientsAction(value: () => UpdateDraftCcRecipientsAction): Self = StObject.set(x, "newUpdateDraftCcRecipientsAction", js.Any.fromFunction0(value))
    
    inline def setNewUpdateDraftSubjectAction(value: () => UpdateDraftSubjectAction): Self = StObject.set(x, "newUpdateDraftSubjectAction", js.Any.fromFunction0(value))
    
    inline def setNewUpdateDraftToRecipientsAction(value: () => UpdateDraftToRecipientsAction): Self = StObject.set(x, "newUpdateDraftToRecipientsAction", js.Any.fromFunction0(value))
    
    inline def setOnClose(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OnClose */ Any): Self = StObject.set(x, "OnClose", value.asInstanceOf[js.Any])
    
    inline def setOpenAs(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenAs */ Any): Self = StObject.set(x, "OpenAs", value.asInstanceOf[js.Any])
    
    inline def setSelectionInputType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionInputType */ Any
    ): Self = StObject.set(x, "SelectionInputType", value.asInstanceOf[js.Any])
    
    inline def setSwitchControlType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwitchControlType */ Any
    ): Self = StObject.set(x, "SwitchControlType", value.asInstanceOf[js.Any])
    
    inline def setTextButtonStyle(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextButtonStyle */ Any
    ): Self = StObject.set(x, "TextButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateDraftBodyType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateDraftBodyType */ Any
    ): Self = StObject.set(x, "UpdateDraftBodyType", value.asInstanceOf[js.Any])
  }
}
