package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A section contains a collection of widgets that are rendered (vertically)
  * in the order that they are specified. Across all platforms, cards have a
  * narrow fixed width, so there is currently no need for layout properties
  * (e.g. float).
  */
@js.native
trait Schema$Section extends js.Object {
  /**
    * The header of the section, text formatted supported.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * A section must contain at least 1 widget.
    */
  var widgets: js.UndefOr[js.Array[Schema$WidgetMarkup]] = js.native
}

object Schema$Section {
  @scala.inline
  def apply(header: String = null, widgets: js.Array[Schema$WidgetMarkup] = null): Schema$Section = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (widgets != null) __obj.updateDynamic("widgets")(widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Section]
  }
}

