package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The hint control's options.
  */
trait ASPxClientHintOptions extends StObject {
  
  /**
    * Gets or sets a value that specifies whether to flip the hint to the opposite position relative to the target element.
    */
  var allowFlip: Boolean
  
  /**
    * Gets or sets a value that specifies whether to shift a hint if its content and title are hidden outside of the client area.
    */
  var allowShift: Boolean
  
  /**
    * Gets or sets whether it should use animation effects when a hint appears.
    */
  var animation: js.Any
  
  /**
    * Gets or sets the delay in displaying the hint.
    */
  var appearAfter: Double
  
  /**
    * Gets or sets a custom CSS class name that will be assigned to the root ASPxHint element.
    */
  var className: String
  
  /**
    * Gets or sets a value that is the HTML DOM-element.
    */
  var container: String
  
  /**
    * Gets or sets the hint's content.
    */
  var content: String
  
  /**
    * Gets or sets the attribute name.
    */
  var contentAttribute: String
  
  /**
    * Gets or sets the duration after which a hint disappears when the mouse pointer is no longer positioned over the target element.
    */
  var disappearAfter: Double
  
  /**
    * Gets or sets a value that is the hint's height.
    */
  var height: String
  
  /**
    * Specifies whether to hide native tooltips for an item and its nested items.
    */
  var hideNativeTooltipForNestedTitleAttributes: Boolean
  
  /**
    * Gets the offset of a hint.
    */
  var offset: Double
  
  /**
    * A handler for the ASPxClientHint.Hiding event.
    */
  var onHiding: ASPxClientEvent[ASPxClientHintHidingEventHandler]
  
  /**
    * A handler for the ASPxClientHint.Showing event.
    */
  var onShowing: ASPxClientEvent[ASPxClientHintShowingEventHandler]
  
  /**
    * Gets or sets where a hint should be positioned.
    */
  var position: String
  
  /**
    * Gets or sets a value that specifies whether a hint is displayed in a callout box.
    */
  var showCallout: Boolean
  
  /**
    * Gets or sets a value that specifies whether a hint's title is displayed.
    */
  var showTitle: Boolean
  
  /**
    * Gets or sets a value that is the hint's title.
    */
  var title: String
  
  /**
    * Gets or sets the attribute name.
    */
  var titleAttribute: String
  
  /**
    * Gets or sets which user action triggers a hint.
    */
  var triggerAction: String
  
  /**
    * Gets or sets a value that is the hint's width.
    */
  var width: String
  
  /**
    * Gets or sets the X coordinate.
    */
  var x: Double
  
  /**
    * Gets or sets the Y coordinate.
    */
  var y: Double
}
object ASPxClientHintOptions {
  
  inline def apply(
    allowFlip: Boolean,
    allowShift: Boolean,
    animation: js.Any,
    appearAfter: Double,
    className: String,
    container: String,
    content: String,
    contentAttribute: String,
    disappearAfter: Double,
    height: String,
    hideNativeTooltipForNestedTitleAttributes: Boolean,
    offset: Double,
    onHiding: ASPxClientEvent[ASPxClientHintHidingEventHandler],
    onShowing: ASPxClientEvent[ASPxClientHintShowingEventHandler],
    position: String,
    showCallout: Boolean,
    showTitle: Boolean,
    title: String,
    titleAttribute: String,
    triggerAction: String,
    width: String,
    x: Double,
    y: Double
  ): ASPxClientHintOptions = {
    val __obj = js.Dynamic.literal(allowFlip = allowFlip.asInstanceOf[js.Any], allowShift = allowShift.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], appearAfter = appearAfter.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentAttribute = contentAttribute.asInstanceOf[js.Any], disappearAfter = disappearAfter.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideNativeTooltipForNestedTitleAttributes = hideNativeTooltipForNestedTitleAttributes.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onHiding = onHiding.asInstanceOf[js.Any], onShowing = onShowing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], showCallout = showCallout.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleAttribute = titleAttribute.asInstanceOf[js.Any], triggerAction = triggerAction.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHintOptions]
  }
  
  extension [Self <: ASPxClientHintOptions](x: Self) {
    
    inline def setAllowFlip(value: Boolean): Self = StObject.set(x, "allowFlip", value.asInstanceOf[js.Any])
    
    inline def setAllowShift(value: Boolean): Self = StObject.set(x, "allowShift", value.asInstanceOf[js.Any])
    
    inline def setAnimation(value: js.Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAppearAfter(value: Double): Self = StObject.set(x, "appearAfter", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentAttribute(value: String): Self = StObject.set(x, "contentAttribute", value.asInstanceOf[js.Any])
    
    inline def setDisappearAfter(value: Double): Self = StObject.set(x, "disappearAfter", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHideNativeTooltipForNestedTitleAttributes(value: Boolean): Self = StObject.set(x, "hideNativeTooltipForNestedTitleAttributes", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOnHiding(value: ASPxClientEvent[ASPxClientHintHidingEventHandler]): Self = StObject.set(x, "onHiding", value.asInstanceOf[js.Any])
    
    inline def setOnShowing(value: ASPxClientEvent[ASPxClientHintShowingEventHandler]): Self = StObject.set(x, "onShowing", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setShowCallout(value: Boolean): Self = StObject.set(x, "showCallout", value.asInstanceOf[js.Any])
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleAttribute(value: String): Self = StObject.set(x, "titleAttribute", value.asInstanceOf[js.Any])
    
    inline def setTriggerAction(value: String): Self = StObject.set(x, "triggerAction", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
