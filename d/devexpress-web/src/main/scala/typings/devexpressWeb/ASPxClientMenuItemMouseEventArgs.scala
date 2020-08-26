package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events which relate to mouse hovering (such as entering or leaving) over menu items.
  */
@js.native
trait ASPxClientMenuItemMouseEventArgs extends ASPxClientMenuItemEventArgs {
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any = js.native
}

object ASPxClientMenuItemMouseEventArgs {
  @scala.inline
  def apply(htmlElement: js.Any, item: ASPxClientMenuItem): ASPxClientMenuItemMouseEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItemMouseEventArgs]
  }
  @scala.inline
  implicit class ASPxClientMenuItemMouseEventArgsOps[Self <: ASPxClientMenuItemMouseEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHtmlElement(value: js.Any): Self = this.set("htmlElement", value.asInstanceOf[js.Any])
  }
  
}

