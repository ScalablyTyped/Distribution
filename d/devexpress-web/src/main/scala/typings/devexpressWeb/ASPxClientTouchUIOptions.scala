package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options affecting the touch scrolling functionality.
  */
trait ASPxClientTouchUIOptions extends js.Object {
  /**
    * Gets or sets the name of the CSS class defining the horizontal scroll bar's appearance.
    */
  var hScrollClassName: String
  /**
    * Gets or sets a value that specifies whether or not the horizontal scroll bar should be displayed.
    */
  var showHorizontalScrollbar: Boolean
  /**
    * Gets or sets a value that specifies whether or not the vertical scroll bar should be displayed.
    */
  var showVerticalScrollbar: Boolean
  /**
    * Gets or sets the name of the CSS class defining the vertical scroll bar's appearance.
    */
  var vScrollClassName: String
}

object ASPxClientTouchUIOptions {
  @scala.inline
  def apply(
    hScrollClassName: String,
    showHorizontalScrollbar: Boolean,
    showVerticalScrollbar: Boolean,
    vScrollClassName: String
  ): ASPxClientTouchUIOptions = {
    val __obj = js.Dynamic.literal(hScrollClassName = hScrollClassName.asInstanceOf[js.Any], showHorizontalScrollbar = showHorizontalScrollbar.asInstanceOf[js.Any], showVerticalScrollbar = showVerticalScrollbar.asInstanceOf[js.Any], vScrollClassName = vScrollClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTouchUIOptions]
  }
}

