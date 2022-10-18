package typings.fluentuiTheme

import typings.fluentuiTheme.libTypesIsemantictextcolorsMod.ISemanticTextColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesIsemanticcolorsMod {
  
  trait ISemanticColors
    extends StObject
       with ISemanticTextColors {
    
    /**
      * Background of an accent button (kicker)
      */
    var accentButtonBackground: String
    
    /**
      * Background for blocking issues, which is more severe than a warning, but not as bad as an error.
      */
    var blockingBackground: String
    
    /**
      * Color for icons on blockingBackground.
      */
    var blockingIcon: String
    
    /**
      * The default color for backgrounds.
      */
    var bodyBackground: String
    
    /**
      * The default background color of selected interactable elements that don't have their own backgrounds.
      * e.g. indicates in the nav which page you're currently on
      */
    var bodyBackgroundChecked: String
    
    /**
      * The default hover color for the backgrounds of interactable elements that don't have their own backgrounds.
      * e.g. if links had hover backgrounds, they'd use this
      */
    var bodyBackgroundHovered: String
    
    /**
      * Divider lines; e.g. lines that separate sections in a menu, an <HR> element.
      */
    var bodyDivider: String
    
    /**
      * The color for chrome adjacent to an area with bodyBackground.
      * This can be used to provide visual separation of zones when using stronger colors, when using a divider line
      * is not desired.
      * In most themes, this should match the color of bodyBackground.
      * See also: bodyFrameDivider
      */
    var bodyFrameBackground: String
    
    /**
      * Used as the border between a zone with bodyFrameBackground and a zone with bodyBackground.
      * If bodyBackground and bodyFrameBackground are different, this should be the same color as bodyFrameBackground
      * in order to visually disappear.
      * See also: bodyFrameBackground
      */
    var bodyFrameDivider: String
    
    /**
      * The standout color for highlighted content backgrounds.
      * For highlighted content when there is no emphasis, use the neutral variant instead.
      * This should be a shade darker than bodyBackground in light themes, and a shade lighter in inverted themes.
      */
    var bodyStandoutBackground: String
    
    /**
      * Background of a standard button
      */
    var buttonBackground: String
    
    /**
      * Background of a checked standard button; e.g. bold/italicize/underline text button in toolbar
      */
    var buttonBackgroundChecked: String
    
    /**
      * Background of a checked and hovered standard button; e.g. bold/italicize/underline text button in toolbar
      */
    var buttonBackgroundCheckedHovered: String
    
    /**
      * Background of a disabled standard button
      */
    var buttonBackgroundDisabled: String
    
    /**
      * Background of a hovered standard button
      */
    var buttonBackgroundHovered: String
    
    /**
      * Background of a pressed standard button; i.e. currently being clicked by mouse
      */
    var buttonBackgroundPressed: String
    
    /**
      * Border of a standard button
      */
    var buttonBorder: String
    
    /**
      * Border of a disabled standard button
      */
    var buttonBorderDisabled: String
    
    /**
      * The default box-shadow for a card. In inverted themes, by default, this is set to `none` since shadows do not work
      * well on dark backgrounds. If the card could be the same color as the background, it is recommended that
      * `variantBorder` is used instead, so the card doesn't disappear in inverted themes.
      * For use with `box-shadow`.
      */
    var cardShadow: String
    
    /**
      * The default box-shadow when hovering on a card. Generally, this is a deeper shadow than `cardShadow`, to give
      * the effect that the card is lifting off the page.
      * In inverted themes, this should be set to a box-shadow that looks like a solid border, because shadows are not
      * visible on dark themes.
      * For use with `box-shadow`.
      */
    var cardShadowHovered: String
    
    /**
      * The background color of a card (or other surface) on a standout background.
      * Cards usually have shadows, but the variantBorder slots can be used for a solid border.
      * e.g. cards on a carousel of highlighted articles
      */
    var cardStandoutBackground: String
    
    /**
      * Background color for default/empty state graphical elements; eg default icons, empty section that
      * needs user to fill in content, placeholder graphics, empty seats, etc.
      */
    var defaultStateBackground: String
    
    /**
      * The default color for backgrounds of disabled controls; e.g. disabled text field.
      */
    var disabledBackground: String
    
    /**
      * The default color for border of disabled controls; e.g. disabled slider, disabled toggle border.
      */
    var disabledBorder: String
    
    /**
      * The background for errors, if necessary, or highlighting the section of the page where the error is present.
      */
    var errorBackground: String
    
    /**
      * Color for icons on errorBackground.
      */
    var errorIcon: String
    
    /**
      * The color of the outline around focused controls that don't already have a border; e.g. menu items
      */
    var focusBorder: String
    
    /**
      * Background for informational messages.
      */
    var infoBackground: String
    
    /**
      * Color for icons on infoBackground.
      */
    var infoIcon: String
    
    /**
      * The background color of an input, e.g. textbox background.
      */
    var inputBackground: String
    
    /**
      * The background of a checked control; e.g. checked radio button's dot, checked toggle's background.
      */
    var inputBackgroundChecked: String
    
    /**
      * The background of a checked and hovered control; e.g. checked checkbox's background color on hover.
      */
    var inputBackgroundCheckedHovered: String
    
    /**
      * The border of a large input control in its resting, state; e.g. the box of dropdown.
      */
    var inputBorder: String
    
    /**
      * The border color of a large hovered input control, such as textbox.
      */
    var inputBorderHovered: String
    
    /**
      * The alternate focus border color for elements that already have a border; e.g. text field borders on focus.
      */
    var inputFocusBorderAlt: String
    
    /**
      * The foreground of a checked control; e.g. checked checkbox's checkmark color, checked toggle's thumb color,
      * radio button's background color around the dot.
      */
    var inputForegroundChecked: String
    
    /**
      * The color for icon ; e.g. SearchBox magnifying glass in rest state.
      */
    var inputIcon: String
    
    /**
      * The color for disabled icon ; e.g. SearchBox magnifying glass in disabled state.
      */
    var inputIconDisabled: String
    
    /**
      * The color for hovered icon ; e.g. SearchBox magnifying glass in hovered state.
      */
    var inputIconHovered: String
    
    /**
      * The placeholder background color of a checked control, e.g. slider background, spinner background.
      */
    var inputPlaceholderBackgroundChecked: String
    
    /**
      * The background color for the entire list.
      */
    var listBackground: String
    
    /**
      * The background color for a hovered list header.
      */
    var listHeaderBackgroundHovered: String
    
    /**
      * The background color for a pressed list header.
      */
    var listHeaderBackgroundPressed: String
    
    /**
      * The background color of a checked list item.
      */
    var listItemBackgroundChecked: String
    
    /**
      * The background color of a checked and hovered list item.
      */
    var listItemBackgroundCheckedHovered: String
    
    /**
      * The background color of a hovered list item.
      */
    var listItemBackgroundHovered: String
    
    /**
      * The background of a menu.
      */
    var menuBackground: String
    
    /**
      * The divider between menu items.
      */
    var menuDivider: String
    
    /**
      * The headers in menus that denote title of a section.
      */
    var menuHeader: String
    
    /**
      * The default colors of icons in menus.
      */
    var menuIcon: String
    
    /**
      * @deprecated
      * (Checked menu items no longer get a background color.)
      * The background of checked menu item; e.g. a menu item whose submenu is open, a selected dropdown item.
      */
    var menuItemBackgroundChecked: String
    
    /**
      * The background of a hovered menu item.
      */
    var menuItemBackgroundHovered: String
    
    /**
      * The background of a pressed menu item.
      */
    var menuItemBackgroundPressed: String
    
    /**
      * The text color of a menu item.
      */
    var menuItemText: String
    
    /**
      * The text color of a hovered menu item.
      */
    var menuItemTextHovered: String
    
    /**
      * Color of links within a message.
      */
    var messageLink: String
    
    /**
      * Color of links within a message when hovered.
      */
    var messageLinkHovered: String
    
    /**
      * Background of a primary button
      */
    var primaryButtonBackground: String
    
    /**
      * Background of a disabled primary button
      */
    var primaryButtonBackgroundDisabled: String
    
    /**
      * Background of a hovered primary button
      */
    var primaryButtonBackgroundHovered: String
    
    /**
      * Background of a pressed primary button; i.e. currently being clicked by mouse
      */
    var primaryButtonBackgroundPressed: String
    
    /**
      * Border of a primary button
      */
    var primaryButtonBorder: String
    
    /**
      * Background for severe warning messages.
      */
    var severeWarningBackground: String
    
    /**
      * Color for icons on severeWarningBackground.
      */
    var severeWarningIcon: String
    
    /**
      * The border of a small input control in its resting unchecked state; e.g. the box of an unchecked checkbox.
      */
    var smallInputBorder: String
    
    /**
      * Background for success
      */
    var successBackground: String
    
    /**
      * Color for icons on successBackground.
      */
    var successIcon: String
    
    /**
      * The color of the border that provides contrast between an element, such as a card, and a standout background.
      */
    var variantBorder: String
    
    /**
      * Hover color of border that provides contrast between an element, such as a card, and a standout background.
      */
    var variantBorderHovered: String
    
    /**
      * Background for warning messages.
      */
    var warningBackground: String
    
    /**
      * @deprecated
      * (no longer used)
      * Foreground color for warning highlights
      */
    var warningHighlight: String
    
    /**
      * Color for icons on warningBackground.
      */
    var warningIcon: String
  }
  object ISemanticColors {
    
    inline def apply(
      accentButtonBackground: String,
      accentButtonText: String,
      actionLink: String,
      actionLinkHovered: String,
      blockingBackground: String,
      blockingIcon: String,
      bodyBackground: String,
      bodyBackgroundChecked: String,
      bodyBackgroundHovered: String,
      bodyDivider: String,
      bodyFrameBackground: String,
      bodyFrameDivider: String,
      bodyStandoutBackground: String,
      bodySubtext: String,
      bodyText: String,
      bodyTextChecked: String,
      buttonBackground: String,
      buttonBackgroundChecked: String,
      buttonBackgroundCheckedHovered: String,
      buttonBackgroundDisabled: String,
      buttonBackgroundHovered: String,
      buttonBackgroundPressed: String,
      buttonBorder: String,
      buttonBorderDisabled: String,
      buttonText: String,
      buttonTextChecked: String,
      buttonTextCheckedHovered: String,
      buttonTextDisabled: String,
      buttonTextHovered: String,
      buttonTextPressed: String,
      cardShadow: String,
      cardShadowHovered: String,
      cardStandoutBackground: String,
      defaultStateBackground: String,
      disabledBackground: String,
      disabledBodySubtext: String,
      disabledBodyText: String,
      disabledBorder: String,
      disabledSubtext: String,
      disabledText: String,
      errorBackground: String,
      errorIcon: String,
      errorText: String,
      focusBorder: String,
      infoBackground: String,
      infoIcon: String,
      inputBackground: String,
      inputBackgroundChecked: String,
      inputBackgroundCheckedHovered: String,
      inputBorder: String,
      inputBorderHovered: String,
      inputFocusBorderAlt: String,
      inputForegroundChecked: String,
      inputIcon: String,
      inputIconDisabled: String,
      inputIconHovered: String,
      inputPlaceholderBackgroundChecked: String,
      inputPlaceholderText: String,
      inputText: String,
      inputTextHovered: String,
      link: String,
      linkHovered: String,
      listBackground: String,
      listHeaderBackgroundHovered: String,
      listHeaderBackgroundPressed: String,
      listItemBackgroundChecked: String,
      listItemBackgroundCheckedHovered: String,
      listItemBackgroundHovered: String,
      listText: String,
      listTextColor: String,
      menuBackground: String,
      menuDivider: String,
      menuHeader: String,
      menuIcon: String,
      menuItemBackgroundChecked: String,
      menuItemBackgroundHovered: String,
      menuItemBackgroundPressed: String,
      menuItemText: String,
      menuItemTextHovered: String,
      messageLink: String,
      messageLinkHovered: String,
      messageText: String,
      primaryButtonBackground: String,
      primaryButtonBackgroundDisabled: String,
      primaryButtonBackgroundHovered: String,
      primaryButtonBackgroundPressed: String,
      primaryButtonBorder: String,
      primaryButtonText: String,
      primaryButtonTextDisabled: String,
      primaryButtonTextHovered: String,
      primaryButtonTextPressed: String,
      severeWarningBackground: String,
      severeWarningIcon: String,
      smallInputBorder: String,
      successBackground: String,
      successIcon: String,
      successText: String,
      variantBorder: String,
      variantBorderHovered: String,
      warningBackground: String,
      warningHighlight: String,
      warningIcon: String,
      warningText: String
    ): ISemanticColors = {
      val __obj = js.Dynamic.literal(accentButtonBackground = accentButtonBackground.asInstanceOf[js.Any], accentButtonText = accentButtonText.asInstanceOf[js.Any], actionLink = actionLink.asInstanceOf[js.Any], actionLinkHovered = actionLinkHovered.asInstanceOf[js.Any], blockingBackground = blockingBackground.asInstanceOf[js.Any], blockingIcon = blockingIcon.asInstanceOf[js.Any], bodyBackground = bodyBackground.asInstanceOf[js.Any], bodyBackgroundChecked = bodyBackgroundChecked.asInstanceOf[js.Any], bodyBackgroundHovered = bodyBackgroundHovered.asInstanceOf[js.Any], bodyDivider = bodyDivider.asInstanceOf[js.Any], bodyFrameBackground = bodyFrameBackground.asInstanceOf[js.Any], bodyFrameDivider = bodyFrameDivider.asInstanceOf[js.Any], bodyStandoutBackground = bodyStandoutBackground.asInstanceOf[js.Any], bodySubtext = bodySubtext.asInstanceOf[js.Any], bodyText = bodyText.asInstanceOf[js.Any], bodyTextChecked = bodyTextChecked.asInstanceOf[js.Any], buttonBackground = buttonBackground.asInstanceOf[js.Any], buttonBackgroundChecked = buttonBackgroundChecked.asInstanceOf[js.Any], buttonBackgroundCheckedHovered = buttonBackgroundCheckedHovered.asInstanceOf[js.Any], buttonBackgroundDisabled = buttonBackgroundDisabled.asInstanceOf[js.Any], buttonBackgroundHovered = buttonBackgroundHovered.asInstanceOf[js.Any], buttonBackgroundPressed = buttonBackgroundPressed.asInstanceOf[js.Any], buttonBorder = buttonBorder.asInstanceOf[js.Any], buttonBorderDisabled = buttonBorderDisabled.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], buttonTextChecked = buttonTextChecked.asInstanceOf[js.Any], buttonTextCheckedHovered = buttonTextCheckedHovered.asInstanceOf[js.Any], buttonTextDisabled = buttonTextDisabled.asInstanceOf[js.Any], buttonTextHovered = buttonTextHovered.asInstanceOf[js.Any], buttonTextPressed = buttonTextPressed.asInstanceOf[js.Any], cardShadow = cardShadow.asInstanceOf[js.Any], cardShadowHovered = cardShadowHovered.asInstanceOf[js.Any], cardStandoutBackground = cardStandoutBackground.asInstanceOf[js.Any], defaultStateBackground = defaultStateBackground.asInstanceOf[js.Any], disabledBackground = disabledBackground.asInstanceOf[js.Any], disabledBodySubtext = disabledBodySubtext.asInstanceOf[js.Any], disabledBodyText = disabledBodyText.asInstanceOf[js.Any], disabledBorder = disabledBorder.asInstanceOf[js.Any], disabledSubtext = disabledSubtext.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], errorBackground = errorBackground.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], focusBorder = focusBorder.asInstanceOf[js.Any], infoBackground = infoBackground.asInstanceOf[js.Any], infoIcon = infoIcon.asInstanceOf[js.Any], inputBackground = inputBackground.asInstanceOf[js.Any], inputBackgroundChecked = inputBackgroundChecked.asInstanceOf[js.Any], inputBackgroundCheckedHovered = inputBackgroundCheckedHovered.asInstanceOf[js.Any], inputBorder = inputBorder.asInstanceOf[js.Any], inputBorderHovered = inputBorderHovered.asInstanceOf[js.Any], inputFocusBorderAlt = inputFocusBorderAlt.asInstanceOf[js.Any], inputForegroundChecked = inputForegroundChecked.asInstanceOf[js.Any], inputIcon = inputIcon.asInstanceOf[js.Any], inputIconDisabled = inputIconDisabled.asInstanceOf[js.Any], inputIconHovered = inputIconHovered.asInstanceOf[js.Any], inputPlaceholderBackgroundChecked = inputPlaceholderBackgroundChecked.asInstanceOf[js.Any], inputPlaceholderText = inputPlaceholderText.asInstanceOf[js.Any], inputText = inputText.asInstanceOf[js.Any], inputTextHovered = inputTextHovered.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkHovered = linkHovered.asInstanceOf[js.Any], listBackground = listBackground.asInstanceOf[js.Any], listHeaderBackgroundHovered = listHeaderBackgroundHovered.asInstanceOf[js.Any], listHeaderBackgroundPressed = listHeaderBackgroundPressed.asInstanceOf[js.Any], listItemBackgroundChecked = listItemBackgroundChecked.asInstanceOf[js.Any], listItemBackgroundCheckedHovered = listItemBackgroundCheckedHovered.asInstanceOf[js.Any], listItemBackgroundHovered = listItemBackgroundHovered.asInstanceOf[js.Any], listText = listText.asInstanceOf[js.Any], listTextColor = listTextColor.asInstanceOf[js.Any], menuBackground = menuBackground.asInstanceOf[js.Any], menuDivider = menuDivider.asInstanceOf[js.Any], menuHeader = menuHeader.asInstanceOf[js.Any], menuIcon = menuIcon.asInstanceOf[js.Any], menuItemBackgroundChecked = menuItemBackgroundChecked.asInstanceOf[js.Any], menuItemBackgroundHovered = menuItemBackgroundHovered.asInstanceOf[js.Any], menuItemBackgroundPressed = menuItemBackgroundPressed.asInstanceOf[js.Any], menuItemText = menuItemText.asInstanceOf[js.Any], menuItemTextHovered = menuItemTextHovered.asInstanceOf[js.Any], messageLink = messageLink.asInstanceOf[js.Any], messageLinkHovered = messageLinkHovered.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], primaryButtonBackground = primaryButtonBackground.asInstanceOf[js.Any], primaryButtonBackgroundDisabled = primaryButtonBackgroundDisabled.asInstanceOf[js.Any], primaryButtonBackgroundHovered = primaryButtonBackgroundHovered.asInstanceOf[js.Any], primaryButtonBackgroundPressed = primaryButtonBackgroundPressed.asInstanceOf[js.Any], primaryButtonBorder = primaryButtonBorder.asInstanceOf[js.Any], primaryButtonText = primaryButtonText.asInstanceOf[js.Any], primaryButtonTextDisabled = primaryButtonTextDisabled.asInstanceOf[js.Any], primaryButtonTextHovered = primaryButtonTextHovered.asInstanceOf[js.Any], primaryButtonTextPressed = primaryButtonTextPressed.asInstanceOf[js.Any], severeWarningBackground = severeWarningBackground.asInstanceOf[js.Any], severeWarningIcon = severeWarningIcon.asInstanceOf[js.Any], smallInputBorder = smallInputBorder.asInstanceOf[js.Any], successBackground = successBackground.asInstanceOf[js.Any], successIcon = successIcon.asInstanceOf[js.Any], successText = successText.asInstanceOf[js.Any], variantBorder = variantBorder.asInstanceOf[js.Any], variantBorderHovered = variantBorderHovered.asInstanceOf[js.Any], warningBackground = warningBackground.asInstanceOf[js.Any], warningHighlight = warningHighlight.asInstanceOf[js.Any], warningIcon = warningIcon.asInstanceOf[js.Any], warningText = warningText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISemanticColors]
    }
    
    extension [Self <: ISemanticColors](x: Self) {
      
      inline def setAccentButtonBackground(value: String): Self = StObject.set(x, "accentButtonBackground", value.asInstanceOf[js.Any])
      
      inline def setBlockingBackground(value: String): Self = StObject.set(x, "blockingBackground", value.asInstanceOf[js.Any])
      
      inline def setBlockingIcon(value: String): Self = StObject.set(x, "blockingIcon", value.asInstanceOf[js.Any])
      
      inline def setBodyBackground(value: String): Self = StObject.set(x, "bodyBackground", value.asInstanceOf[js.Any])
      
      inline def setBodyBackgroundChecked(value: String): Self = StObject.set(x, "bodyBackgroundChecked", value.asInstanceOf[js.Any])
      
      inline def setBodyBackgroundHovered(value: String): Self = StObject.set(x, "bodyBackgroundHovered", value.asInstanceOf[js.Any])
      
      inline def setBodyDivider(value: String): Self = StObject.set(x, "bodyDivider", value.asInstanceOf[js.Any])
      
      inline def setBodyFrameBackground(value: String): Self = StObject.set(x, "bodyFrameBackground", value.asInstanceOf[js.Any])
      
      inline def setBodyFrameDivider(value: String): Self = StObject.set(x, "bodyFrameDivider", value.asInstanceOf[js.Any])
      
      inline def setBodyStandoutBackground(value: String): Self = StObject.set(x, "bodyStandoutBackground", value.asInstanceOf[js.Any])
      
      inline def setButtonBackground(value: String): Self = StObject.set(x, "buttonBackground", value.asInstanceOf[js.Any])
      
      inline def setButtonBackgroundChecked(value: String): Self = StObject.set(x, "buttonBackgroundChecked", value.asInstanceOf[js.Any])
      
      inline def setButtonBackgroundCheckedHovered(value: String): Self = StObject.set(x, "buttonBackgroundCheckedHovered", value.asInstanceOf[js.Any])
      
      inline def setButtonBackgroundDisabled(value: String): Self = StObject.set(x, "buttonBackgroundDisabled", value.asInstanceOf[js.Any])
      
      inline def setButtonBackgroundHovered(value: String): Self = StObject.set(x, "buttonBackgroundHovered", value.asInstanceOf[js.Any])
      
      inline def setButtonBackgroundPressed(value: String): Self = StObject.set(x, "buttonBackgroundPressed", value.asInstanceOf[js.Any])
      
      inline def setButtonBorder(value: String): Self = StObject.set(x, "buttonBorder", value.asInstanceOf[js.Any])
      
      inline def setButtonBorderDisabled(value: String): Self = StObject.set(x, "buttonBorderDisabled", value.asInstanceOf[js.Any])
      
      inline def setCardShadow(value: String): Self = StObject.set(x, "cardShadow", value.asInstanceOf[js.Any])
      
      inline def setCardShadowHovered(value: String): Self = StObject.set(x, "cardShadowHovered", value.asInstanceOf[js.Any])
      
      inline def setCardStandoutBackground(value: String): Self = StObject.set(x, "cardStandoutBackground", value.asInstanceOf[js.Any])
      
      inline def setDefaultStateBackground(value: String): Self = StObject.set(x, "defaultStateBackground", value.asInstanceOf[js.Any])
      
      inline def setDisabledBackground(value: String): Self = StObject.set(x, "disabledBackground", value.asInstanceOf[js.Any])
      
      inline def setDisabledBorder(value: String): Self = StObject.set(x, "disabledBorder", value.asInstanceOf[js.Any])
      
      inline def setErrorBackground(value: String): Self = StObject.set(x, "errorBackground", value.asInstanceOf[js.Any])
      
      inline def setErrorIcon(value: String): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      inline def setFocusBorder(value: String): Self = StObject.set(x, "focusBorder", value.asInstanceOf[js.Any])
      
      inline def setInfoBackground(value: String): Self = StObject.set(x, "infoBackground", value.asInstanceOf[js.Any])
      
      inline def setInfoIcon(value: String): Self = StObject.set(x, "infoIcon", value.asInstanceOf[js.Any])
      
      inline def setInputBackground(value: String): Self = StObject.set(x, "inputBackground", value.asInstanceOf[js.Any])
      
      inline def setInputBackgroundChecked(value: String): Self = StObject.set(x, "inputBackgroundChecked", value.asInstanceOf[js.Any])
      
      inline def setInputBackgroundCheckedHovered(value: String): Self = StObject.set(x, "inputBackgroundCheckedHovered", value.asInstanceOf[js.Any])
      
      inline def setInputBorder(value: String): Self = StObject.set(x, "inputBorder", value.asInstanceOf[js.Any])
      
      inline def setInputBorderHovered(value: String): Self = StObject.set(x, "inputBorderHovered", value.asInstanceOf[js.Any])
      
      inline def setInputFocusBorderAlt(value: String): Self = StObject.set(x, "inputFocusBorderAlt", value.asInstanceOf[js.Any])
      
      inline def setInputForegroundChecked(value: String): Self = StObject.set(x, "inputForegroundChecked", value.asInstanceOf[js.Any])
      
      inline def setInputIcon(value: String): Self = StObject.set(x, "inputIcon", value.asInstanceOf[js.Any])
      
      inline def setInputIconDisabled(value: String): Self = StObject.set(x, "inputIconDisabled", value.asInstanceOf[js.Any])
      
      inline def setInputIconHovered(value: String): Self = StObject.set(x, "inputIconHovered", value.asInstanceOf[js.Any])
      
      inline def setInputPlaceholderBackgroundChecked(value: String): Self = StObject.set(x, "inputPlaceholderBackgroundChecked", value.asInstanceOf[js.Any])
      
      inline def setListBackground(value: String): Self = StObject.set(x, "listBackground", value.asInstanceOf[js.Any])
      
      inline def setListHeaderBackgroundHovered(value: String): Self = StObject.set(x, "listHeaderBackgroundHovered", value.asInstanceOf[js.Any])
      
      inline def setListHeaderBackgroundPressed(value: String): Self = StObject.set(x, "listHeaderBackgroundPressed", value.asInstanceOf[js.Any])
      
      inline def setListItemBackgroundChecked(value: String): Self = StObject.set(x, "listItemBackgroundChecked", value.asInstanceOf[js.Any])
      
      inline def setListItemBackgroundCheckedHovered(value: String): Self = StObject.set(x, "listItemBackgroundCheckedHovered", value.asInstanceOf[js.Any])
      
      inline def setListItemBackgroundHovered(value: String): Self = StObject.set(x, "listItemBackgroundHovered", value.asInstanceOf[js.Any])
      
      inline def setMenuBackground(value: String): Self = StObject.set(x, "menuBackground", value.asInstanceOf[js.Any])
      
      inline def setMenuDivider(value: String): Self = StObject.set(x, "menuDivider", value.asInstanceOf[js.Any])
      
      inline def setMenuHeader(value: String): Self = StObject.set(x, "menuHeader", value.asInstanceOf[js.Any])
      
      inline def setMenuIcon(value: String): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
      
      inline def setMenuItemBackgroundChecked(value: String): Self = StObject.set(x, "menuItemBackgroundChecked", value.asInstanceOf[js.Any])
      
      inline def setMenuItemBackgroundHovered(value: String): Self = StObject.set(x, "menuItemBackgroundHovered", value.asInstanceOf[js.Any])
      
      inline def setMenuItemBackgroundPressed(value: String): Self = StObject.set(x, "menuItemBackgroundPressed", value.asInstanceOf[js.Any])
      
      inline def setMenuItemText(value: String): Self = StObject.set(x, "menuItemText", value.asInstanceOf[js.Any])
      
      inline def setMenuItemTextHovered(value: String): Self = StObject.set(x, "menuItemTextHovered", value.asInstanceOf[js.Any])
      
      inline def setMessageLink(value: String): Self = StObject.set(x, "messageLink", value.asInstanceOf[js.Any])
      
      inline def setMessageLinkHovered(value: String): Self = StObject.set(x, "messageLinkHovered", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonBackground(value: String): Self = StObject.set(x, "primaryButtonBackground", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonBackgroundDisabled(value: String): Self = StObject.set(x, "primaryButtonBackgroundDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonBackgroundHovered(value: String): Self = StObject.set(x, "primaryButtonBackgroundHovered", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonBackgroundPressed(value: String): Self = StObject.set(x, "primaryButtonBackgroundPressed", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonBorder(value: String): Self = StObject.set(x, "primaryButtonBorder", value.asInstanceOf[js.Any])
      
      inline def setSevereWarningBackground(value: String): Self = StObject.set(x, "severeWarningBackground", value.asInstanceOf[js.Any])
      
      inline def setSevereWarningIcon(value: String): Self = StObject.set(x, "severeWarningIcon", value.asInstanceOf[js.Any])
      
      inline def setSmallInputBorder(value: String): Self = StObject.set(x, "smallInputBorder", value.asInstanceOf[js.Any])
      
      inline def setSuccessBackground(value: String): Self = StObject.set(x, "successBackground", value.asInstanceOf[js.Any])
      
      inline def setSuccessIcon(value: String): Self = StObject.set(x, "successIcon", value.asInstanceOf[js.Any])
      
      inline def setVariantBorder(value: String): Self = StObject.set(x, "variantBorder", value.asInstanceOf[js.Any])
      
      inline def setVariantBorderHovered(value: String): Self = StObject.set(x, "variantBorderHovered", value.asInstanceOf[js.Any])
      
      inline def setWarningBackground(value: String): Self = StObject.set(x, "warningBackground", value.asInstanceOf[js.Any])
      
      inline def setWarningHighlight(value: String): Self = StObject.set(x, "warningHighlight", value.asInstanceOf[js.Any])
      
      inline def setWarningIcon(value: String): Self = StObject.set(x, "warningIcon", value.asInstanceOf[js.Any])
    }
  }
}
