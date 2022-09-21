package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientHintHidingEventHandler
import typings.devexpressWeb.ASPxClientHintShowingEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The hint control's options.
  */
@JSGlobal("ASPxClientHintOptions")
@js.native
/**
  * Initializes a new instance of the ASPxClientHintOptions class with default settings.
  */
open class ASPxClientHintOptions ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHintOptions {
  
  /**
    * Gets or sets a value that specifies whether to flip the hint to the opposite position relative to the target element.
    */
  /* CompleteClass */
  var allowFlip: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether to shift a hint if its content and title are hidden outside of the client area.
    */
  /* CompleteClass */
  var allowShift: Boolean = js.native
  
  /**
    * Gets or sets whether it should use animation effects when a hint appears.
    */
  /* CompleteClass */
  var animation: Any = js.native
  
  /**
    * Gets or sets the delay in displaying the hint.
    */
  /* CompleteClass */
  var appearAfter: Double = js.native
  
  /**
    * Gets or sets a custom CSS class name that will be assigned to the root ASPxHint element.
    */
  /* CompleteClass */
  var className: String = js.native
  
  /**
    * Gets or sets a value that is the HTML DOM-element.
    */
  /* CompleteClass */
  var container: String = js.native
  
  /**
    * Gets or sets the hint's content.
    */
  /* CompleteClass */
  var content: String = js.native
  
  /**
    * Gets or sets the attribute name.
    */
  /* CompleteClass */
  var contentAttribute: String = js.native
  
  /**
    * Gets or sets the duration after which a hint disappears when the mouse pointer is no longer positioned over the target element.
    */
  /* CompleteClass */
  var disappearAfter: Double = js.native
  
  /**
    * Gets or sets a value that is the hint's height.
    */
  /* CompleteClass */
  var height: String = js.native
  
  /**
    * Specifies whether to hide native tooltips for an item and its nested items.
    */
  /* CompleteClass */
  var hideNativeTooltipForNestedTitleAttributes: Boolean = js.native
  
  /**
    * Gets the offset of a hint.
    */
  /* CompleteClass */
  var offset: Double = js.native
  
  /**
    * A handler for the ASPxClientHint.Hiding event.
    */
  /* CompleteClass */
  var onHiding: typings.devexpressWeb.ASPxClientEvent[ASPxClientHintHidingEventHandler] = js.native
  
  /**
    * A handler for the ASPxClientHint.Showing event.
    */
  /* CompleteClass */
  var onShowing: typings.devexpressWeb.ASPxClientEvent[ASPxClientHintShowingEventHandler] = js.native
  
  /**
    * Gets or sets where a hint should be positioned.
    */
  /* CompleteClass */
  var position: String = js.native
  
  /**
    * Gets or sets a value that specifies whether a hint is displayed in a callout box.
    */
  /* CompleteClass */
  var showCallout: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether a hint's title is displayed.
    */
  /* CompleteClass */
  var showTitle: Boolean = js.native
  
  /**
    * Gets or sets a value that is the hint's title.
    */
  /* CompleteClass */
  var title: String = js.native
  
  /**
    * Gets or sets the attribute name.
    */
  /* CompleteClass */
  var titleAttribute: String = js.native
  
  /**
    * Gets or sets which user action triggers a hint.
    */
  /* CompleteClass */
  var triggerAction: String = js.native
  
  /**
    * Gets or sets a value that is the hint's width.
    */
  /* CompleteClass */
  var width: String = js.native
  
  /**
    * Gets or sets the X coordinate.
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * Gets or sets the Y coordinate.
    */
  /* CompleteClass */
  var y: Double = js.native
}
