package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.CustomButtonClick event.
  */
@js.native
trait ASPxClientTreeListCustomButtonEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the value which identifies the custom button.
    */
  var buttonID: String = js.native
  /**
    * Gets the button's index.
    */
  var buttonIndex: Double = js.native
  /**
    * Gets the key value of the node whose custom button has been clicked.
    */
  var nodeKey: String = js.native
}

object ASPxClientTreeListCustomButtonEventArgs {
  @scala.inline
  def apply(buttonID: String, buttonIndex: Double, nodeKey: String): ASPxClientTreeListCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], buttonIndex = buttonIndex.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListCustomButtonEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeListCustomButtonEventArgsOps[Self <: ASPxClientTreeListCustomButtonEventArgs] (val x: Self) extends AnyVal {
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
    def setButtonID(value: String): Self = this.set("buttonID", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonIndex(value: Double): Self = this.set("buttonIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeKey(value: String): Self = this.set("nodeKey", value.asInstanceOf[js.Any])
  }
  
}

