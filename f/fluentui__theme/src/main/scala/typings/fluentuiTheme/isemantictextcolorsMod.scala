package typings.fluentuiTheme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isemantictextcolorsMod {
  
  trait ISemanticTextColors extends StObject {
    
    /**
      * Color of text for accent button (kicker)
      */
    var accentButtonText: String
    
    /**
      * Neutral colored links and links for action buttons.
      */
    var actionLink: String
    
    /**
      * Hover state for neutral colored links and links for action buttons.
      */
    var actionLinkHovered: String
    
    /**
      * De-emphasized text; e.g. metadata, captions, placeholder text.
      */
    var bodySubtext: String
    
    /**
      * The default color for text.
      */
    var bodyText: String
    
    /**
      * Checked text color, e.g. selected menu item text.
      */
    var bodyTextChecked: String
    
    /**
      * Color of text in a standard button
      */
    var buttonText: String
    
    /**
      * Color of text in a checked standard button
      */
    var buttonTextChecked: String
    
    /**
      * Color of text in a checked and hovered standard button
      */
    var buttonTextCheckedHovered: String
    
    /**
      * Color of text in a disabled standard button
      */
    var buttonTextDisabled: String
    
    /**
      * Color of text in a hovered standard button
      */
    var buttonTextHovered: String
    
    /**
      * Color of text in a pressed standard button; i.e. currently being clicked by mouse
      */
    var buttonTextPressed: String
    
    /**
      * Disabled de-emphasized text, for use on the default background (bodyBackground).
      */
    var disabledBodySubtext: String
    
    /**
      * The default color for disabled text on the default background (bodyBackground).
      */
    var disabledBodyText: String
    
    /**
      * Disabled de-emphasized text, for use on disabledBackground.
      */
    var disabledSubtext: String
    
    /**
      * The default color for disabled text on top of disabledBackground; e.g. text in a disabled text field or
      * disabled button text.
      */
    var disabledText: String
    
    /**
      * The default color of error text on bodyBackground.
      */
    var errorText: String
    
    /**
      * The color of placeholder text.
      */
    var inputPlaceholderText: String
    
    /**
      * The color of input text.
      */
    var inputText: String
    
    /**
      * The color of input text on hover.
      */
    var inputTextHovered: String
    
    /**
      * The color of a link.
      */
    var link: String
    
    /**
      * The color of a hovered link. Also used when the link is active.
      */
    var linkHovered: String
    
    /**
      * The default text color for list item titles and text in column fields.
      */
    var listText: String
    
    /** @deprecated
      * This slot was incorrectly named. Use listText instead. */
    var listTextColor: String
    
    /**
      * The default color of text in a message bar.
      */
    var messageText: String
    
    /**
      * Color of text in a primary button
      */
    var primaryButtonText: String
    
    /**
      * Color of text in a disabled primary button
      */
    var primaryButtonTextDisabled: String
    
    /**
      * Color of text in a hovered primary button
      */
    var primaryButtonTextHovered: String
    
    /**
      * Color of text in a pressed primary button; i.e. currently being clicked by mouse
      */
    var primaryButtonTextPressed: String
    
    /** @deprecated
      * No longer used. Consider using messageText and/or successIcon instead.
      */
    var successText: String
    
    /** @deprecated
      * No longer used. Consider using messageText and/or warningIcon instead.
      */
    var warningText: String
  }
  object ISemanticTextColors {
    
    @scala.inline
    def apply(
      accentButtonText: String,
      actionLink: String,
      actionLinkHovered: String,
      bodySubtext: String,
      bodyText: String,
      bodyTextChecked: String,
      buttonText: String,
      buttonTextChecked: String,
      buttonTextCheckedHovered: String,
      buttonTextDisabled: String,
      buttonTextHovered: String,
      buttonTextPressed: String,
      disabledBodySubtext: String,
      disabledBodyText: String,
      disabledSubtext: String,
      disabledText: String,
      errorText: String,
      inputPlaceholderText: String,
      inputText: String,
      inputTextHovered: String,
      link: String,
      linkHovered: String,
      listText: String,
      listTextColor: String,
      messageText: String,
      primaryButtonText: String,
      primaryButtonTextDisabled: String,
      primaryButtonTextHovered: String,
      primaryButtonTextPressed: String,
      successText: String,
      warningText: String
    ): ISemanticTextColors = {
      val __obj = js.Dynamic.literal(accentButtonText = accentButtonText.asInstanceOf[js.Any], actionLink = actionLink.asInstanceOf[js.Any], actionLinkHovered = actionLinkHovered.asInstanceOf[js.Any], bodySubtext = bodySubtext.asInstanceOf[js.Any], bodyText = bodyText.asInstanceOf[js.Any], bodyTextChecked = bodyTextChecked.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], buttonTextChecked = buttonTextChecked.asInstanceOf[js.Any], buttonTextCheckedHovered = buttonTextCheckedHovered.asInstanceOf[js.Any], buttonTextDisabled = buttonTextDisabled.asInstanceOf[js.Any], buttonTextHovered = buttonTextHovered.asInstanceOf[js.Any], buttonTextPressed = buttonTextPressed.asInstanceOf[js.Any], disabledBodySubtext = disabledBodySubtext.asInstanceOf[js.Any], disabledBodyText = disabledBodyText.asInstanceOf[js.Any], disabledSubtext = disabledSubtext.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], inputPlaceholderText = inputPlaceholderText.asInstanceOf[js.Any], inputText = inputText.asInstanceOf[js.Any], inputTextHovered = inputTextHovered.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkHovered = linkHovered.asInstanceOf[js.Any], listText = listText.asInstanceOf[js.Any], listTextColor = listTextColor.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], primaryButtonText = primaryButtonText.asInstanceOf[js.Any], primaryButtonTextDisabled = primaryButtonTextDisabled.asInstanceOf[js.Any], primaryButtonTextHovered = primaryButtonTextHovered.asInstanceOf[js.Any], primaryButtonTextPressed = primaryButtonTextPressed.asInstanceOf[js.Any], successText = successText.asInstanceOf[js.Any], warningText = warningText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISemanticTextColors]
    }
    
    @scala.inline
    implicit class ISemanticTextColorsMutableBuilder[Self <: ISemanticTextColors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentButtonText(value: String): Self = StObject.set(x, "accentButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionLink(value: String): Self = StObject.set(x, "actionLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionLinkHovered(value: String): Self = StObject.set(x, "actionLinkHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodySubtext(value: String): Self = StObject.set(x, "bodySubtext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyText(value: String): Self = StObject.set(x, "bodyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyTextChecked(value: String): Self = StObject.set(x, "bodyTextChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextChecked(value: String): Self = StObject.set(x, "buttonTextChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextCheckedHovered(value: String): Self = StObject.set(x, "buttonTextCheckedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextDisabled(value: String): Self = StObject.set(x, "buttonTextDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextHovered(value: String): Self = StObject.set(x, "buttonTextHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextPressed(value: String): Self = StObject.set(x, "buttonTextPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledBodySubtext(value: String): Self = StObject.set(x, "disabledBodySubtext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledBodyText(value: String): Self = StObject.set(x, "disabledBodyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledSubtext(value: String): Self = StObject.set(x, "disabledSubtext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledText(value: String): Self = StObject.set(x, "disabledText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPlaceholderText(value: String): Self = StObject.set(x, "inputPlaceholderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputText(value: String): Self = StObject.set(x, "inputText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTextHovered(value: String): Self = StObject.set(x, "inputTextHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkHovered(value: String): Self = StObject.set(x, "linkHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListText(value: String): Self = StObject.set(x, "listText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTextColor(value: String): Self = StObject.set(x, "listTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonText(value: String): Self = StObject.set(x, "primaryButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonTextDisabled(value: String): Self = StObject.set(x, "primaryButtonTextDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonTextHovered(value: String): Self = StObject.set(x, "primaryButtonTextHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonTextPressed(value: String): Self = StObject.set(x, "primaryButtonTextPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessText(value: String): Self = StObject.set(x, "successText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningText(value: String): Self = StObject.set(x, "warningText", value.asInstanceOf[js.Any])
    }
  }
}
