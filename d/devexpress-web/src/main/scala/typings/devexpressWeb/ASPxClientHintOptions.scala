package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The hint control's options.
  */
@JSGlobal("ASPxClientHintOptions")
@js.native
/**
  * Initializes a new instance of the ASPxClientHintOptions class with default settings.
  */
class ASPxClientHintOptions () extends js.Object {
  /**
    * Gets or sets a value that specifies whether to flip the hint to the opposite position relative to the target element.
    */
  var allowFlip: Boolean = js.native
  /**
    * Gets or sets a value that specifies whether to shift a hint if its content and title are hidden outside of the client area.
    */
  var allowShift: Boolean = js.native
  /**
    * Gets or sets whether it should use animation effects when a hint appears.
    */
  var animation: js.Any = js.native
  /**
    * Gets or sets the delay in displaying the hint.
    */
  var appearAfter: Double = js.native
  /**
    * Gets or sets a custom CSS class name that will be assigned to the root ASPxHint element.
    */
  var className: String = js.native
  /**
    * Gets or sets a value that is the HTML DOM-element.
    */
  var container: String = js.native
  /**
    * Gets or sets the hint's content.
    */
  var content: String = js.native
  /**
    * Gets or sets the attribute name.
    */
  var contentAttribute: String = js.native
  /**
    * Gets or sets the duration after which a hint disappears when the mouse pointer is no longer positioned over the target element.
    */
  var disappearAfter: Double = js.native
  /**
    * Gets or sets a value that is the hint's height.
    */
  var height: String = js.native
  /**
    * Specifies whether to hide native tooltips for an item and its nested items.
    */
  var hideNativeTooltipForNestedTitleAttributes: Boolean = js.native
  /**
    * Gets the offset of a hint.
    */
  var offset: Double = js.native
  /**
    * A handler for the ASPxClientHint.Hiding event.
    */
  var onHiding: ASPxClientEvent[ASPxClientHintHidingEventHandler] = js.native
  /**
    * A handler for the ASPxClientHint.Showing event.
    */
  var onShowing: ASPxClientEvent[ASPxClientHintShowingEventHandler] = js.native
  /**
    * Gets or sets where a hint should be positioned.
    */
  var position: String = js.native
  /**
    * Gets or sets a value that specifies whether a hint is displayed in a callout box.
    */
  var showCallout: Boolean = js.native
  /**
    * Gets or sets a value that specifies whether a hint's title is displayed.
    */
  var showTitle: Boolean = js.native
  /**
    * Gets or sets a value that is the hint's title.
    */
  var title: String = js.native
  /**
    * Gets or sets the attribute name.
    */
  var titleAttribute: String = js.native
  /**
    * Gets or sets which user action triggers a hint.
    */
  var triggerAction: String = js.native
  /**
    * Gets or sets a value that is the hint's width.
    */
  var width: String = js.native
  /**
    * Gets or sets the X coordinate.
    */
  var x: Double = js.native
  /**
    * Gets or sets the Y coordinate.
    */
  var y: Double = js.native
}

