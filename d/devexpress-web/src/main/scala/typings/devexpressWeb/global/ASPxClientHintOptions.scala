package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientHintHidingEventHandler
import typings.devexpressWeb.ASPxClientHintShowingEventHandler
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
class ASPxClientHintOptions ()
  extends typings.devexpressWeb.ASPxClientHintOptions {
  /**
    * Gets or sets a value that specifies whether to flip the hint to the opposite position relative to the target element.
    */
  /* CompleteClass */
  override var allowFlip: Boolean = js.native
  /**
    * Gets or sets a value that specifies whether to shift a hint if its content and title are hidden outside of the client area.
    */
  /* CompleteClass */
  override var allowShift: Boolean = js.native
  /**
    * Gets or sets whether it should use animation effects when a hint appears.
    */
  /* CompleteClass */
  override var animation: js.Any = js.native
  /**
    * Gets or sets the delay in displaying the hint.
    */
  /* CompleteClass */
  override var appearAfter: Double = js.native
  /**
    * Gets or sets a custom CSS class name that will be assigned to the root ASPxHint element.
    */
  /* CompleteClass */
  override var className: String = js.native
  /**
    * Gets or sets a value that is the HTML DOM-element.
    */
  /* CompleteClass */
  override var container: String = js.native
  /**
    * Gets or sets the hint's content.
    */
  /* CompleteClass */
  override var content: String = js.native
  /**
    * Gets or sets the attribute name.
    */
  /* CompleteClass */
  override var contentAttribute: String = js.native
  /**
    * Gets or sets the duration after which a hint disappears when the mouse pointer is no longer positioned over the target element.
    */
  /* CompleteClass */
  override var disappearAfter: Double = js.native
  /**
    * Gets or sets a value that is the hint's height.
    */
  /* CompleteClass */
  override var height: String = js.native
  /**
    * Specifies whether to hide native tooltips for an item and its nested items.
    */
  /* CompleteClass */
  override var hideNativeTooltipForNestedTitleAttributes: Boolean = js.native
  /**
    * Gets the offset of a hint.
    */
  /* CompleteClass */
  override var offset: Double = js.native
  /**
    * A handler for the ASPxClientHint.Hiding event.
    */
  /* CompleteClass */
  override var onHiding: typings.devexpressWeb.ASPxClientEvent[ASPxClientHintHidingEventHandler] = js.native
  /**
    * A handler for the ASPxClientHint.Showing event.
    */
  /* CompleteClass */
  override var onShowing: typings.devexpressWeb.ASPxClientEvent[ASPxClientHintShowingEventHandler] = js.native
  /**
    * Gets or sets where a hint should be positioned.
    */
  /* CompleteClass */
  override var position: String = js.native
  /**
    * Gets or sets a value that specifies whether a hint is displayed in a callout box.
    */
  /* CompleteClass */
  override var showCallout: Boolean = js.native
  /**
    * Gets or sets a value that specifies whether a hint's title is displayed.
    */
  /* CompleteClass */
  override var showTitle: Boolean = js.native
  /**
    * Gets or sets a value that is the hint's title.
    */
  /* CompleteClass */
  override var title: String = js.native
  /**
    * Gets or sets the attribute name.
    */
  /* CompleteClass */
  override var titleAttribute: String = js.native
  /**
    * Gets or sets which user action triggers a hint.
    */
  /* CompleteClass */
  override var triggerAction: String = js.native
  /**
    * Gets or sets a value that is the hint's width.
    */
  /* CompleteClass */
  override var width: String = js.native
  /**
    * Gets or sets the X coordinate.
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * Gets or sets the Y coordinate.
    */
  /* CompleteClass */
  override var y: Double = js.native
}

