package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events which relate to mouse hovering (such as entering or leaving) over menu items.
  */
trait ASPxClientMenuItemMouseEventArgs extends ASPxClientMenuItemEventArgs {
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any
}

object ASPxClientMenuItemMouseEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, item: ASPxClientMenuItem): ASPxClientMenuItemMouseEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItemMouseEventArgs]
  }
}

